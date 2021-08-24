class Rotation:
    def __init__(self, pitch: int, yaw: int, roll: int):
        self.pitch = pitch
        self.yaw = yaw
        self.roll = roll

    def get_pitch(self):
        return self.pitch

    def get_yaw(self):
        return self.yaw

    def get_roll(self):
        return self.roll