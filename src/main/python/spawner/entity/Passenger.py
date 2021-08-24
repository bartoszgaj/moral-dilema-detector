from spawner.entity.Person import Person
from spawner.entity.subentity.Fitness import Fitness
from spawner.entity.subentity.Health import Health
from spawner.entity.subentity.Seat import Seat
from spawner.entity.subentity.Sex import Sex
from spawner.entity.subentity.SocialUsefullness import SocialUsefullness


class Passenger(Person):
    def __init__(self, identifier,
                 seat: Seat,
                 seat_belts: bool,
                 age: int,
                 sex: Sex,
                 health: Health,
                 weight: int,
                 fitness: Fitness,
                 has_children: bool,
                 social_usefulness: SocialUsefullness):
        super().__init__(identifier, age, sex, health, weight, fitness, has_children, social_usefulness)
        self.seat = seat
        self.seat_belts = seat_belts
