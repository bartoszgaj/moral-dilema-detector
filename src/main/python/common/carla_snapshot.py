from typing import List

import common.objects as obj
from common.strings import *


class CarlaSnapshot:
    def __init__(self, objects):
        self.__vehicles: List[obj.Vehicle] = objects[KEY_VEHICLE]
        self.__cyclists: List[obj.Cyclist] = objects[KEY_CYCLIST]
        self.__pedestrians: List[obj.Pedestrian] = objects[KEY_PEDESTRIAN]
        self.__lanes: List[obj.Lane] = objects[KEY_LANE]
        self.__roads: List[obj.Road] = objects[KEY_ROAD]
        self.__delimiters: List[obj.Delimiter] = objects[KEY_DELIMITER]
        self.__junctions: List[obj.Junction] = objects[KEY_JUNCTION]
        self.__road_attributes: List[obj.RoadAttributes] = objects[KEY_ROADATTRIBUTE]
        self.__road_points: List[obj.RoadPoint] = objects[KEY_ROADPOINT]
        self.__laneboundary: List[obj.LaneBoundary] = objects[KEY_LANEBOUNDARY]

    def get_vehicles(self) -> List[obj.Vehicle]:
        return self.__vehicles

    def get_cyclists(self) -> List[obj.Cyclist]:
        return self.__cyclists

    def get_pedestrians(self) -> List[obj.Pedestrian]:
        return self.__pedestrians

    def get_lanes(self) -> List[obj.Lane]:
        return self.__lanes

    def get_roads(self) -> List[obj.Road]:
        return self.__roads

    def get_delimiters(self) -> List[obj.Delimiter]:
        return self.__delimiters

    def get_junctions(self) -> List[obj.Junction]:
        return self.__junctions

    def get_road_attributes(self) -> List[obj.RoadAttributes]:
        return self.__road_attributes

    def get_road_points(self) -> List[obj.RoadPoint]:
        return self.__road_points

    def get_laneboundary(self) -> List[obj.LaneBoundary]:
        return self.__laneboundary
