from spawner.entity.Person import Person
from spawner.entity.subentity.Fitness import Fitness
from spawner.entity.subentity.Health import Health
from spawner.entity.subentity.Sex import Sex
from spawner.entity.subentity.SocialUsefullness import SocialUsefullness
from spawner.entity.subentity.Transform import Transform


class Biker(Person):
    def __init__(self, identifier, transform: Transform, age: int, sex: Sex, health: Health, weight: int,
                 fitness: Fitness,
                 has_children: bool, social_usefulness: SocialUsefullness):
        super().__init__(identifier, age, sex, health, weight, fitness, has_children, social_usefulness)
        self.transform = transform

    def get_transform(self):
        return self.transform
