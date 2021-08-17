from carla_actor_controller.controller import Controller
from carla_actor_controller.model import Model
from carla_actor_controller.view import KivyView
from carla_reader import CarlaReader

from scenario_describer.ScenarioGeneratror import Generator as ScenarioGenerator

if __name__ == '__main__':
    KivyView(Controller(Model())).run()
