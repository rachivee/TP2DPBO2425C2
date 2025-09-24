import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    // kelas untuk menyimpan lebar kolom tabel
    static class TabelWidth {
        // lebar awal untuk setiap kolom
        int code = 4;
        int name = 4;
        int price = 5;
        int androidVer = 11;
        int uiVer = 6;
        int processor = 9;
        int imei = 4;
        int model = 5;
        int category = 8;

        // total lebar tabel ditambah 3 spasi untuk setiap kolom
        int total() {
            return code + name + price + androidVer + uiVer + processor + imei + model + category + 9 * 3;
        }
    }
    
    // menghitung lebar kolom berdasarkan data yang ada
    public static TabelWidth calculateWidths(ArrayList<GalaxySeries> daftarHP) {
        TabelWidth w = new TabelWidth(); // deklarasi objek TabelWidth
        for (GalaxySeries hp : daftarHP) { // iterasi setiap data handphone
            // memperbarui lebar kolom menjadi lebar maksimum antara lebar saat ini dan panjang data
            w.code = Math.max(w.code, hp.getCode().length());
            w.name = Math.max(w.name, hp.getName().length());
            w.price = Math.max(w.price, Integer.toString(hp.getPrice()).length());
            w.androidVer = Math.max(w.androidVer, hp.getAndroidVer().length());
            w.uiVer = Math.max(w.uiVer, hp.getUiVer().length());
            w.processor = Math.max(w.processor, hp.getProcessor().length());
            w.imei = Math.max(w.imei, hp.getImei().length());
            w.model = Math.max(w.model, hp.getModel().length());
            w.category = Math.max(w.category, hp.getCategory().length());
        }
        return w;
    }

    // metode untuk mencetak garis horizontal
    public static void printLine(int width) {
        for (int i = 0; i < width; i++) System.out.print("-"); // cetak karakter '-' sebanyak width
        System.out.println();
    }

    // metode untuk mencetak header tabel
    public static void printHeader(TabelWidth w) {
        printLine(w.total()); // mencetak garis horizontal
        // mencetak nama kolom dengan lebar yang sudah ditentukan
        System.out.printf("%-" + (w.code + 3) + "s", "Code");
        System.out.printf("%-" + (w.name + 3) + "s", "Name");
        System.out.printf("%-" + (w.price + 3) + "s", "Price");
        System.out.printf("%-" + (w.androidVer + 3) + "s", "Android");
        System.out.printf("%-" + (w.uiVer + 3) + "s", "UI");
        System.out.printf("%-" + (w.processor + 3) + "s", "Processor");
        System.out.printf("%-" + (w.imei + 3) + "s", "IMEI");
        System.out.printf("%-" + (w.model + 3) + "s", "Model");
        System.out.printf("%-" + (w.category + 3) + "s", "Category");
        System.out.println();
        printLine(w.total()); // cetak kembali garis horizontal
    }

    // metode untuk mencetak satu baris data handphone
    public static void printDataRow(GalaxySeries hp, TabelWidth w) {
        // mencetak data handphone dengan format yang sesuai lebar kolom
        System.out.printf("%-" + (w.code + 3) + "s", hp.getCode());
        System.out.printf("%-" + (w.name + 3) + "s", hp.getName());
        System.out.printf("%-" + (w.price + 3) + "d", hp.getPrice());
        System.out.printf("%-" + (w.androidVer + 3) + "s", hp.getAndroidVer());
        System.out.printf("%-" + (w.uiVer + 3) + "s", hp.getUiVer());
        System.out.printf("%-" + (w.processor + 3) + "s", hp.getProcessor());
        System.out.printf("%-" + (w.imei + 3) + "s", hp.getImei());
        System.out.printf("%-" + (w.model + 3) + "s", hp.getModel());
        System.out.printf("%-" + (w.category + 3) + "s", hp.getCategory());
        System.out.println();
    }

    // main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner untuk input
        ArrayList<GalaxySeries> daftarHP = new ArrayList<>(); // List untuk menyimpan data handphone

        // Data awal
        daftarHP.add(new GalaxySeries("G001", "Galaxy A10", 2000000, "Android 10", "One UI 2", "Exynos 7884", "IMEI001", "SM-A105", "Entry"));
        daftarHP.add(new GalaxySeries("G002", "Galaxy S20", 12000000, "Android 11", "One UI 3", "Exynos 990", "IMEI002", "SM-G980", "Flagship"));
        daftarHP.add(new GalaxySeries("G003", "Galaxy M21", 3000000, "Android 11", "One UI 3.1", "Exynos 9611", "IMEI003", "SM-M215", "Mid"));
        daftarHP.add(new GalaxySeries("G004", "Galaxy Z Flip", 18000000, "Android 12", "One UI 4", "Snapdragon 855+", "IMEI004", "SM-F700", "Foldable"));
        daftarHP.add(new GalaxySeries("G005", "Galaxy Note 10", 14000000, "Android 10", "One UI 2.5", "Exynos 9825", "IMEI005", "SM-N970", "Note"));

        // Input tambahan
        String tambah;
        do {
            // meminta input user untuk menambah data
            System.out.print("\nTambah data baru? (y/n): ");
            tambah = sc.nextLine().trim().toLowerCase();

            // jika user memilih 'y', maka meminta detail handphone baru
            if (tambah.equals("y")) {
                // meminta input detail handphone
                System.out.print("Code       : "); String code = sc.nextLine();
                System.out.print("Name       : "); String name = sc.nextLine();
                System.out.print("Price      : "); int price = Integer.parseInt(sc.nextLine());
                System.out.print("Android Ver: "); String androidVer = sc.nextLine();
                System.out.print("UI Ver     : "); String uiVer = sc.nextLine();
                System.out.print("Processor  : "); String processor = sc.nextLine();
                System.out.print("IMEI       : "); String imei = sc.nextLine();
                System.out.print("Model      : "); String model = sc.nextLine();
                System.out.print("Category   : "); String category = sc.nextLine();
                // menambahkan data handphone baru ke dalam list
                daftarHP.add(new GalaxySeries(code, name, price, androidVer, uiVer, processor, imei, model, category));
            }
        } while (tambah.equals("y")); // ulangi selama user memilih 'y'

        // menghitung lebar kolom berdasarkan data yang ada
        TabelWidth width = calculateWidths(daftarHP);

        // mencetak tabel data handphone
        System.out.println("\nDaftar Galaxy Series:");
        printHeader(width); // mencetak header tabel
        for (GalaxySeries hp : daftarHP) {
            printDataRow(hp, width); // mencetak setiap baris data handphone
        }
        printLine(width.total()); // mencetak garis penutup tabel
    }
}
