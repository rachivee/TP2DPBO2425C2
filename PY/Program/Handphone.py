from Sumisang import Sumisang

class Handphone(Sumisang):
    def __init__(self, code="", name="", price=0, android_ver="", ui_ver="", processor=""):
        super().__init__(code, name, price) # memanggil konstruktor dari kelas induk
        # Private attributes
        self.__android_ver = android_ver
        self.__ui_ver = ui_ver
        self.__processor = processor

    # getter dan setter untuk android_ver
    def get_android_ver(self):
        return self.__android_ver

    def set_android_ver(self, android_ver):
        self.__android_ver = android_ver

    # getter dan setter untuk ui_ver
    def get_ui_ver(self):
        return self.__ui_ver

    def set_ui_ver(self, ui_ver):
        self.__ui_ver = ui_ver

    # getter dan setter untuk processor
    def get_processor(self):
        return self.__processor

    def set_processor(self, processor):
        self.__processor = processor
