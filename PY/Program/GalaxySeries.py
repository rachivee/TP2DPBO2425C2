from Handphone import Handphone

class GalaxySeries(Handphone):
    def __init__(self, code="", name="", price=0, android_ver="", ui_ver="", processor="", imei="", model="", category=""):
        super().__init__(code, name, price, android_ver, ui_ver, processor) # memanggil konstruktor dari kelas induk
        # Private attributes
        self.__imei = imei
        self.__model = model
        self.__category = category

    # getter dan setter untuk imei
    def get_imei(self):
        return self.__imei

    def set_imei(self, imei):
        self.__imei = imei

    # getter dan setter untuk model
    def get_model(self):
        return self.__model

    def set_model(self, model):
        self.__model = model

    # getter dan setter untuk category
    def get_category(self):
        return self.__category

    def set_category(self, category):
        self.__category = category
