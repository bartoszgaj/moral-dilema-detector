from spawner.entity.Entity import Entity
from spawner.entity.subentity.Fitness import Fitness
from spawner.entity.subentity.Health import Health
from spawner.entity.subentity.Sex import Sex
from spawner.entity.subentity.SocialUsefullness import SocialUsefullness


class Person(Entity):
    def __init__(self,
                 identifier,
                 age: int,
                 sex: Sex,
                 health: Health,
                 weight: int,
                 fitness: Fitness,
                 has_children: bool,
                 social_usefulness: SocialUsefullness):
        super().__init__(identifier)
        self.identifier = identifier
        self.age = age
        self.sex = sex
        self.health = health
        self.weight = weight
        self.fitness = fitness
        self.has_children = has_children
        self.social_usefulness = social_usefulness
