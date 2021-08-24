from spawner.entity.subentity import Location, Rotation


class Transform:
    def __init__(self, location: Location, rotation: Rotation):
        self.location = location
        self.rotation = rotation

    def get_location(self):
        return self.location

    def get_rotation(self):
        return self.rotation