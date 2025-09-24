from GalaxySeries import GalaxySeries

# fungsi untuk menghitung lebar kolom berdasarkan data
def calculate_widths(hp_list):
    # inisialisasi lebar kolom dengan panjang minimal
    widths = {
        "Code": 4,
        "Name": 4,
        "Price": 5,
        "Android": 11,
        "UI": 6,
        "Processor": 9,
        "IMEI": 4,
        "Model": 5,
        "Category": 8
    }

    # hitung lebar kolom berdasarkan data
    for hp in hp_list: # iterasi setiap objek Handphone
        # perbarui lebar kolom jika diperlukan
        widths["Code"] = max(widths["Code"], len(hp.get_code()))
        widths["Name"] = max(widths["Name"], len(hp.get_name()))
        widths["Price"] = max(widths["Price"], len(str(hp.get_price())))
        widths["Android"] = max(widths["Android"], len(hp.get_android_ver()))
        widths["UI"] = max(widths["UI"], len(hp.get_ui_ver()))
        widths["Processor"] = max(widths["Processor"], len(hp.get_processor()))
        widths["IMEI"] = max(widths["IMEI"], len(hp.get_imei()))
        widths["Model"] = max(widths["Model"], len(hp.get_model()))
        widths["Category"] = max(widths["Category"], len(hp.get_category()))

    return widths

# fungsi untuk mencetak garis pemisah
def print_line(total_width): # total_width adalah lebar total tabel
    # mencetak garis horizontal
    print("-" * total_width)

# fungsi untuk mencetak header tabel
def print_header(widths): # widths adalah lebar kolom
    # hitung lebar total tabel
    total_width = sum(widths.values()) + len(widths) * 3 # 3 spasi antar kolom
    # cetak header tabel
    print_line(total_width)
    # cetak nama kolom dengan lebar yang sesuai
    for key in widths:
        print(f"{key:<{widths[key]+3}}", end="") 
    print()
    # cetak garis pemisah
    print_line(total_width)

# fungsi untuk mencetak data baris per baris
def print_data_row(hp, widths): # hp adalah objek Handphone, widths adalah lebar kolom
    # cetak data dengan lebar yang sesuai
    print(f"{hp.get_code():<{widths['Code']+3}}"
          f"{hp.get_name():<{widths['Name']+3}}"
          f"{hp.get_price():<{widths['Price']+3}}"
          f"{hp.get_android_ver():<{widths['Android']+3}}"
          f"{hp.get_ui_ver():<{widths['UI']+3}}"
          f"{hp.get_processor():<{widths['Processor']+3}}"
          f"{hp.get_imei():<{widths['IMEI']+3}}"
          f"{hp.get_model():<{widths['Model']+3}}"
          f"{hp.get_category():<{widths['Category']+3}}")

# main
def main():
    # daftar objek Handphone
    daftar_hp = [
        GalaxySeries("G001", "Galaxy A10", 2000000, "Android 10", "One UI 2", "Exynos 7884", "IMEI001", "SM-A105", "Entry"),
        GalaxySeries("G002", "Galaxy S20", 12000000, "Android 11", "One UI 3", "Exynos 990", "IMEI002", "SM-G980", "Flagship"),
        GalaxySeries("G003", "Galaxy M21", 3000000, "Android 11", "One UI 3.1", "Exynos 9611", "IMEI003", "SM-M215", "Mid"),
        GalaxySeries("G004", "Galaxy Z Flip", 18000000, "Android 12", "One UI 4", "Snapdragon 855+", "IMEI004", "SM-F700", "Foldable"),
        GalaxySeries("G005", "Galaxy Note 10", 14000000, "Android 10", "One UI 2.5", "Exynos 9825", "IMEI005", "SM-N970", "Note")
    ]

    # input awal sebelum loop
    tambah = input("\nTambah data baru? (y/n): ").lower()

    # loop untuk menambah data selama user memasukkan 'y'
    while tambah == 'y':
        # minta input data handphone baru
        code = input("Code       : ")
        name = input("Name       : ")
        price = int(input("Price      : "))
        android_ver = input("Android Ver: ")
        ui_ver = input("UI Ver     : ")
        processor = input("Processor  : ")
        imei = input("IMEI       : ")
        model = input("Model      : ")
        category = input("Category   : ")

        # buat objek Handphone baru dan tambahkan ke daftar
        daftar_hp.append(GalaxySeries(code, name, price, android_ver, ui_ver, processor, imei, model, category))

        # input ulang di akhir loop
        tambah = input("\nTambah data baru? (y/n): ").lower()

    # hitung lebar kolom berdasarkan data
    widths = calculate_widths(daftar_hp)

    print("\nDaftar Galaxy Series:\n")
    print_header(widths) # cetak header tabel
    for hp in daftar_hp:
        print_data_row(hp, widths) # cetak setiap baris data
    print_line(sum(widths.values()) + len(widths) * 3) # cetak garis penutup tabel

if __name__ == "__main__":
    main()
