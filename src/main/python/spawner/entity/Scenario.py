from typing import List

from spawner.entity.Environment import Environment
from spawner.entity.Pedestrian import Pedestrian
from spawner.entity.Vehicle import Vehicle


class Scenario:
    def __init__(self, name, vehicles, pedestrians, environment):
        self.__name = name
        self.__vehicles: List[Vehicle] = vehicles
        self.__pedestrians: List[Pedestrian] = pedestrians
        self.__environment: Environment = environment

    def get_vehicles(self):
        return self.__vehicles

    def get_pedestrians(self):
        return self.__pedestrians

    def get_environment(self):
        return self.__environment
