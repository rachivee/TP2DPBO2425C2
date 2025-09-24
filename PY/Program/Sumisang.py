class Sumisang:
    def __init__(self, code="", name="", price=0):
        # Private attributes
        self.__code = code
        self.__name = name
        self.__price = price

    # getter dan setter untuk code
    def get_code(self):
        return self.__code

    def set_code(self, code):
        self.__code = code

    # getter dan setter untuk name
    def get_name(self):
        return self.__name
    
    def set_name(self, name):
        self.__name = name

    # getter dan setter untuk price
    def get_price(self):
        return self.__price

    def set_price(self, price):
        self.__price = price
