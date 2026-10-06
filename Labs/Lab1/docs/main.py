# Вариант 19 - Вода


class Liquid():
    def __init__(self, color, density, freezing_temp):
        self.color = color
        self.density = density
        self.freezing_temp = freezing_temp


    @property
    def color(self):
        return self._color


    @property
    def density(self):
        return self._density


    @property
    def freezing_temp(self):
        return self._freezing_temp


    @color.setter
    def color(self, value):
        self._color = value


    @density.setter
    def density(self, value):
        if value > 0:
            self._density = value
        else:
            raise ValueError(f"Invalid density value: {value}")


    @freezing_temp.setter
    def freezing_temp(self, value):
        self._freezing_temp = value


    def heat(self, deg):
        return f'Heating liquid to {deg} degrees'


    def cool(self, deg):
        return f'Cooling liquid to {deg} degrees'


    def get_state(self):
        return f'Liquid: color - {self.color}, density - {self.density}, freezing temperature - {self.freezing_temp}'


class Water(Liquid):
    def __init__(self, color, density, freezing_temp, volume, ph_lvl, purity):
        super().__init__(color, density, freezing_temp)
        self.volume = volume
        self.ph_lvl = ph_lvl
        self.purity = purity


    @property
    def volume(self):
        return self._volume


    @property
    def ph_lvl(self):
        return self._ph_lvl


    @property
    def purity(self):
        return self._purity


    @volume.setter
    def volume(self, value):
        if value > 0:
            self._volume = value
        else:
            raise ValueError(f"Invalid volume value: {value}")


    @ph_lvl.setter
    def ph_lvl(self, value):
        if 0 <= value <= 14:
            self._ph_lvl = value
        else:
            raise ValueError(f"Invalid PH level value: {value}")


    @purity.setter
    def purity(self, value):
        if 0 <= value <= 100:
            self._purity = value
        else:
            raise ValueError(f"Invalid purity value: {value}")


    def drink(self):
        return 'Drinking water' 


    def pour(self):
        return 'Pouring water' 


    def water_info(self):
        return f'Water {self.volume} volume with PH level {self.ph_lvl} and {self.purity}% purity'


class MineralWater(Water):
    def __init__(self, color, density, freezing_temp, volume, ph_lvl, purity, source, brand, minerals):
        super().__init__(color, density, freezing_temp, volume, ph_lvl, purity)
        self.source = source 
        self.brand = brand 
        self.minerals = minerals 


    @property
    def source(self):
        return self._source


    @property
    def brand(self):
        return self._brand


    @property
    def minerals(self):
        return self._minerals


    @source.setter
    def source(self, value):
        self._source = value


    @brand.setter
    def brand(self, value):
        self._brand = value


    @minerals.setter
    def minerals(self, value):
        if isinstance(value, list):
            self._minerals = value 
        else:
            raise ValueError(f"Minerals must be a list, got {type(value)}")


    def get_minerals(self):
        if self.minerals:
            return self.minerals
        else:
            return 'No minerals'


    def get_source(self):
        return f'Mineral water is from {self.source}' 


    def is_healing(self):
        if len(self.minerals) > 3:
            return 'Healing'
        else:
            return 'Not healing'