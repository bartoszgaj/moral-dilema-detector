from spawner.entity.Biker import Biker
from spawner.entity.Environment import Environment
from spawner.entity.Passenger import Passenger
from spawner.entity.Pedestrian import Pedestrian
from spawner.entity.Scenario import Scenario
from spawner.entity.Vehicle import Vehicle
from spawner.entity.subentity.Fitness import Fitness
from spawner.entity.subentity.Health import Health
from spawner.entity.subentity.Location import Location
from spawner.entity.subentity.Rotation import Rotation
from spawner.entity.subentity.Seat import Seat
from spawner.entity.subentity.Sex import Sex
from spawner.entity.subentity.SocialUsefullness import SocialUsefullness
from spawner.entity.subentity.Transform import Transform


class ScenarioA2(Scenario):
    def __init__(self):
        super().__init__(
            "ScenarioA2",
            [
                Vehicle("id",
                        Transform(Location(109, -73, 15), Rotation(0, 2, 0)),
                        [
                            Passenger("passengerId",
                                      Seat.DRIVER,
                                      True,
                                      33,
                                      Sex.MALE,
                                      Health.Healthy,
                                      80,
                                      Fitness.Fit,
                                      False,
                                      SocialUsefullness.Useful),
                            Passenger("passengerId2",
                                      Seat.PASSENGER,
                                      True,
                                      33,
                                      Sex.MALE,
                                      Health.Healthy,
                                      80,
                                      Fitness.Fit,
                                      False,
                                      SocialUsefullness.Useful)
                        ]
                        ),
            ],
            [Biker("biker",
                   Transform(Location(122, -76.5, 15), Rotation(0, 181, 0)),
                   33,
                   Sex.MALE,
                   Health.Healthy,
                   80,
                   Fitness.Fit,
                   False,
                   SocialUsefullness.Useful)],
            [
                Pedestrian(
                "passengerId2",
                Transform(Location(122, -69, 15), Rotation(0, 181, 0)),
                33,
                Sex.MALE,
                Health.Healthy,
                80,
                Fitness.Fit,
                False,
                SocialUsefullness.Useful
            ),
                Pedestrian(
                    "passengerId2",
                    Transform(Location(122, -73, 15), Rotation(0, 181, 0)),
                    33,
                    Sex.MALE,
                    Health.Healthy,
                    80,
                    Fitness.Fit,
                    False,
                    SocialUsefullness.Useful
                )
            ],
            Environment(temperature=30, humidity=3, brightness=1, slippery=1)
        )
