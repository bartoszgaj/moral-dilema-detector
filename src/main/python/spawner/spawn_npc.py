#!/usr/bin/env python

# Copyright (c) 2019 Computer Vision Center (CVC) at the Universitat Autonoma de
# Barcelona (UAB).
#
# This work is licensed under the terms of the MIT license.
# For a copy, see <https://opensource.org/licenses/MIT>.

"""Spawn NPCs into the simulation"""

import glob
import os
import sys
import time

from spawner.entity.subentity.Sex import Sex
from spawner.scenarios.ScenarioA1 import ScenarioA1

try:
    sys.path.append(glob.glob('../carla/dist/carla-*%d.%d-%s.egg' % (
        sys.version_info.major,
        sys.version_info.minor,
        'win-amd64' if os.name == 'nt' else 'linux-x86_64'))[0])
except IndexError:
    pass

import carla

from carla import Transform, Location, Rotation

import argparse
import logging
from numpy import random


def saveFile(scenario, ontology_id):
    f = open(ontology_id + ".txt", "a")

    for vehicle in scenario.get_vehicles():
        f.write("VEHICLE: ")
        f.write(vehicle.identifier)
        f.write("\n")
        for passenger in vehicle.passengers:
            f.write("PASSENGER: ")
            f.write(passenger.identifier + " ")
            f.write(str(passenger.seat) + " ")
            f.write(str(passenger.seat_belts) + " ")
            f.write(str(passenger.age) + " ")
            f.write(str(passenger.sex) + " ")
            f.write(str(passenger.health) + " ")
            f.write(str(passenger.weight) + " ")
            f.write(str(passenger.fitness) + " ")
            f.write(str(passenger.has_children) + " ")
            f.write(str(passenger.social_usefulness))
            f.write("\n")

    for pedestrian in scenario.get_pedestrians():
        f.write("PEDESTRIAN: ")
        f.write(pedestrian.identifier + " ")
        f.write(str(pedestrian.age) + " ")
        f.write(str(pedestrian.sex) + " ")
        f.write(str(pedestrian.health) + " ")
        f.write(str(pedestrian.weight) + " ")
        f.write(str(pedestrian.fitness) + " ")
        f.write(str(pedestrian.has_children) + " ")
        f.write(str(pedestrian.social_usefulness))
        f.write("\n")

    for biker in scenario.get_bikers():
        f.write("BIKER: ")
        f.write(biker.identifier + " ")
        f.write(str(biker.age) + " ")
        f.write(str(biker.sex) + " ")
        f.write(str(biker.health) + " ")
        f.write(str(biker.weight) + " ")
        f.write(str(biker.fitness) + " ")
        f.write(str(biker.has_children) + " ")
        f.write(str(biker.social_usefulness))
        f.write("\n")

    f.write("ENVIRONMENT:")
    f.write(str(scenario.get_environment().temperature) + " ")
    f.write(str(scenario.get_environment().humidity) + " ")
    f.write(str(scenario.get_environment().brightness) + " ")
    f.write(str(scenario.get_environment().slippery))

    f.close()


def main():
    argparser = argparse.ArgumentParser(
        description=__doc__)
    argparser.add_argument(
        '--host',
        metavar='H',
        default='127.0.0.1',
        help='IP of the host server (default: 127.0.0.1)')
    argparser.add_argument(
        '-p', '--port',
        metavar='P',
        default=2000,
        type=int,
        help='TCP port to listen to (default: 2000)')
    argparser.add_argument(
        '-s', '--scenario',
        metavar='N',
        default=1,
        type=int,
        help='number of scenario (default: 1)')
    args = argparser.parse_args()

    logging.basicConfig(format='%(levelname)s: %(message)s', level=logging.INFO)

    vehicles_list = []
    walkers_list = []
    bikers_list = []
    all_id = []
    client = carla.Client(args.host, args.port)
    client.set_timeout(10.0)
    synchronous_master = False

    scenario_id = args.scenario
    scenario = ScenarioA1()
    if scenario_id == 'A1':
        scenario = ScenarioA1()
    if scenario_id == 'A2':
        scenario = ScenarioA1()
    if scenario_id == 'A3':
        scenario = ScenarioA1()
    if scenario_id == 'B1':
        scenario = ScenarioA1()
    if scenario_id == 'B2':
        scenario = ScenarioA1()
    if scenario_id == 'B3':
        scenario = ScenarioA1()

    try:
        world = client.get_world()

        traffic_manager = client.get_trafficmanager(8000)
        traffic_manager.set_global_distance_to_leading_vehicle(1.0)

        car = world.get_blueprint_library().filter('vehicle.toyota.prius')[0]
        manWalker = world.get_blueprint_library().filter('walker.pedestrian.0002')[0]
        womanWalker = world.get_blueprint_library().filter('walker.pedestrian.0008')[0]
        bikerBp = world.get_blueprint_library().filter('vehicle.bh.crossbike')[0]

        SpawnActor = carla.command.SpawnActor

        # --------------
        # Spawn vehicles
        # --------------
        batch = []
        for vehicle in scenario.get_vehicles():
            blueprint = car
            if blueprint.has_attribute('color'):
                color = random.choice(blueprint.get_attribute('color').recommended_values)
                blueprint.set_attribute('color', color)

            batch.append(SpawnActor(blueprint, Transform(
                Location(
                    x=vehicle.get_transform().get_location().get_x(),
                    y=vehicle.get_transform().get_location().get_y(),
                    z=vehicle.get_transform().get_location().get_z()
                ),
                Rotation(
                    pitch=vehicle.get_transform().get_rotation().get_pitch(),
                    yaw=vehicle.get_transform().get_rotation().get_yaw(),
                    roll=vehicle.get_transform().get_rotation().get_roll()
                ))
                                    ))

        for response in client.apply_batch_sync(batch, synchronous_master):
            if response.error:
                logging.error(response.error)
            else:
                vehicles_list.append(response.actor_id)
                print(type(response))
                print("spawned vehicle " + str(response.actor_id))

        for pedestrian in scenario.get_pedestrians():
            blueprint = manWalker if pedestrian.sex == Sex.MALE else womanWalker

            batch.append(SpawnActor(blueprint, Transform(
                Location(
                    x=pedestrian.get_transform().get_location().get_x(),
                    y=pedestrian.get_transform().get_location().get_y(),
                    z=pedestrian.get_transform().get_location().get_z()
                ),
                Rotation(
                    pitch=pedestrian.get_transform().get_rotation().get_pitch(),
                    yaw=pedestrian.get_transform().get_rotation().get_yaw(),
                    roll=pedestrian.get_transform().get_rotation().get_roll()
                ))
                                    ))

        for response in client.apply_batch_sync(batch, synchronous_master):
            if response.error:
                logging.error(response.error)
            else:
                walkers_list.append(response.actor_id)
                print("spawned pedestrian " + str(response.actor_id))

        # There is only one model of bike, so it always need to be male
        for biker in scenario.get_bikers():
            # due to lack of models, bikers always have to be woman
            batch.append(SpawnActor(bikerBp, Transform(
                Location(
                    x=biker.get_transform().get_location().get_x(),
                    y=biker.get_transform().get_location().get_y(),
                    z=biker.get_transform().get_location().get_z()
                ),
                Rotation(
                    pitch=biker.get_transform().get_rotation().get_pitch(),
                    yaw=biker.get_transform().get_rotation().get_yaw(),
                    roll=biker.get_transform().get_rotation().get_roll()
                ))
                                    ))

        for response in client.apply_batch_sync(batch, synchronous_master):
            if response.error:
                logging.error(response.error)
            else:
                bikers_list.append(response.actor_id)
                print("spawned biker " + str(response.actor_id))

        ontology_id = "300"
        saveFile(scenario, ontology_id)

        while True:
            world.wait_for_tick()

    finally:

        print('\ndestroying %d vehicles' % len(vehicles_list))
        client.apply_batch([carla.command.DestroyActor(x) for x in vehicles_list])

        print('\ndestroying %d walkers' % len(walkers_list))
        client.apply_batch([carla.command.DestroyActor(x) for x in walkers_list])

        print('\ndestroying %d bikers' % len(bikers_list))
        client.apply_batch([carla.command.DestroyActor(x) for x in bikers_list])

        time.sleep(0.5)


if __name__ == '__main__':

    try:
        main()
    except KeyboardInterrupt:
        pass
    finally:
        print('\ndone.')
