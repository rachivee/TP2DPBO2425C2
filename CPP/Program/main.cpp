#include <iostream>
#include <iomanip>
#include <vector>
#include <algorithm>
#include "GalaxySeries.cpp"

using namespace std;

// Struktur untuk menyimpan lebar kolom
struct TabelWidth {
    // Inisialisasi lebar kolom dengan nilai minimum
    size_t code = 4;
    size_t name = 4;
    size_t price = 5;
    size_t androidVer = 11;
    size_t uiVer = 6;
    size_t processor = 9;
    size_t imei = 4;
    size_t model = 5;
    size_t category = 8;

    // Total lebar tabel ditambah 3 spasi untuk setiap kolom
    size_t total() const {
        return code + name + price + androidVer + uiVer + processor + imei + model + category + 9 * 3;
    }
};

// Fungsi untuk menghitung lebar kolom dinamis
TabelWidth calculateWidths(vector<GalaxySeries>& daftarHP) {
    TabelWidth w; // deklarasi struktur untuk menyimpan lebar kolom

    // Iterasi untuk setiap atribut dan memperbarui lebar maksimum
    for (auto& hp : daftarHP) {
        // Memperbarui lebar maksimum untuk setiap atribut dengan fungsi max
        w.code = max(w.code, hp.getCode().length());
        w.name = max(w.name, hp.getName().length());
        w.price = max(w.price, to_string(hp.getPrice()).length());
        w.androidVer = max(w.androidVer, hp.getAndroidVer().length());
        w.uiVer = max(w.uiVer, hp.getUiVer().length());
        w.processor = max(w.processor, hp.getProcessor().length());
        w.imei = max(w.imei, hp.getImei().length());
        w.model = max(w.model, hp.getModel().length());
        w.category = max(w.category, hp.getCategory().length());
    }

    return w;
}

// Fungsi untuk mencetak garis horizontal
void printLine(size_t width) {
    // Mencetak garis horizontal dengan karakter '-'
    cout << setfill('-') << setw(width) << "-" << setfill(' ') << endl;
}

// Fungsi untuk mencetak header tabel
void printHeader(const TabelWidth& w) {
    printLine(w.total()); // mencetak garis horizontal sepanjang total lebar tabel
    cout << left // align kiri untuk header
        // mencetak header dengan lebar dinamis
         << setw(w.code + 3) << "Code"
         << setw(w.name + 3) << "Name"
         << setw(w.price + 3) << "Price"
         << setw(w.androidVer + 3) << "Android"
         << setw(w.uiVer + 3) << "UI"
         << setw(w.processor + 3) << "Processor"
         << setw(w.imei + 3) << "IMEI"
         << setw(w.model + 3) << "Model"
         << setw(w.category + 3) << "Category"
         << endl;
    printLine(w.total()); // cetak kembali garis horizontal
}

// Fungsi untuk mencetak baris data
void printDataRow(GalaxySeries& hp, const TabelWidth& w) {
    cout << left
        // mencetak isi tabel dengan lebar dinamis
         << setw(w.code + 3) << hp.getCode()
         << setw(w.name + 3) << hp.getName()
         << setw(w.price + 3) << hp.getPrice()
         << setw(w.androidVer + 3) << hp.getAndroidVer()
         << setw(w.uiVer + 3) << hp.getUiVer()
         << setw(w.processor + 3) << hp.getProcessor()
         << setw(w.imei + 3) << hp.getImei()
         << setw(w.model + 3) << hp.getModel()
         << setw(w.category + 3) << hp.getCategory()
         << endl;
}


int main() {
    // isi data awal
    vector<GalaxySeries> daftarHP = {
        // Sample data Galaxy Series
        GalaxySeries("G001", "Galaxy A10", 2000000, "Android 10", "One UI 2", "Exynos 7884", "IMEI001", "SM-A105", "Entry"),
        GalaxySeries("G002", "Galaxy S20", 12000000, "Android 11", "One UI 3", "Exynos 990", "IMEI002", "SM-G980", "Flagship"),
        GalaxySeries("G003", "Galaxy M21", 3000000, "Android 11", "One UI 3.1", "Exynos 9611", "IMEI003", "SM-M215", "Mid"),
        GalaxySeries("G004", "Galaxy Z Flip", 18000000, "Android 12", "One UI 4", "Snapdragon 855+", "IMEI004", "SM-F700", "Foldable"),
        GalaxySeries("G005", "Galaxy Note 10", 14000000, "Android 10", "One UI 2.5", "Exynos 9825", "IMEI005", "SM-N970", "Note")
    };

    char tambah; // variabel untuk menambah data baru
    do { // loop untuk menambah data baru
        cout << "\nTambah data baru? (y/n): "; // menanyakan kepada pengguna apakah ingin menambah data baru
        cin >> tambah; // membaca input dari pengguna
        cin.ignore(); //

        if (tolower(tambah) == 'y') { // jika input adalah 'y' atau 'Y'
            // variabel untuk menyimpan input pengguna
            string code, name, androidVer, uiVer, processor, imei, model, category;
            int price;

            // meminta input dari pengguna untuk setiap atribut
            cout << "Code       : "; getline(cin, code);
            cout << "Name       : "; getline(cin, name);
            cout << "Price      : "; cin >> price; cin.ignore();
            cout << "Android Ver: "; getline(cin, androidVer);
            cout << "UI Ver     : "; getline(cin, uiVer);
            cout << "Processor  : "; getline(cin, processor);
            cout << "IMEI       : "; getline(cin, imei);
            cout << "Model      : "; getline(cin, model);
            cout << "Category   : "; getline(cin, category);

            // menambahkan objek GalaxySeries baru ke dalam vektor
            daftarHP.emplace_back(code, name, price, androidVer, uiVer, processor, imei, model, category);
        }
    } while (tolower(tambah) == 'y'); // selama user memasukkan 'y' atau 'Y'

    // Hitung lebar dinamis
    TabelWidth width = calculateWidths(daftarHP);

    // Tampilkan tabel
    cout << "\nDaftar Galaxy Series:\n";
    printHeader(width); // cetak header tabel
    for (auto& hp : daftarHP) { // iterasi melalui setiap objek GalaxySeries dalam vektor
        printDataRow(hp, width); // cetak baris data
    }
    printLine(width.total()); // cetak garis penutup tabel

    return 0;
}
