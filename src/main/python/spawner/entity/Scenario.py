from typing import List

from spawner.entity.Biker import Biker
from spawner.entity.Environment import Environment
from spawner.entity.Pedestrian import Pedestrian
from spawner.entity.Vehicle import Vehicle


class Scenario:
    def __init__(self, name, vehicles, bikers, pedestrians, environment):
        self.__name = name
        self.__vehicles: List[Vehicle] = vehicles
        self.__bikers: List[Biker] = bikers
        self.__pedestrians: List[Pedestrian] = pedestrians
        self.__environment: Environment = environment

    def get_vehicles(self):
        return self.__vehicles

    def get_bikers(self):
        return self.__bikers

    def get_pedestrians(self):
        return self.__pedestrians

    def get_environment(self):
        return self.__environment