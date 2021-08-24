from typing import List

from spawner.entity.Entity import Entity
from spawner.entity.Passenger import Passenger
from spawner.entity.subentity.Transform import Transform


class Vehicle(Entity):
    def __init__(self, identifier, transform: Transform, passengers: List[Passenger]):
        super().__init__(identifier)
        self.identifier = identifier
        self.transform = transform
        self.passengers = passengers

    def get_transform(self):
        return self.transform

