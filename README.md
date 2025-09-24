# TP2DPBO2425C2

Saya Farah Maulida dengan NIM 2410024 mengerjakan Tugas Praktikum 2 dalam mata kuliah Desain dan Pemrograman Berbasis Objek untuk keberkahan-Nya maka saya tidak akan melakukan kecurangan seperti yang telah di spesifikasikan Aamiin.

Pada TP DPBO ke-2 ini, saya mengembangkan class Sumisang yang sebelumnya telah dibuat dengan menggunakan konsep multilevel inheritence. Berikut adalah desain dalam bentuk diagram:

<img width="500" height="300" alt="DPBO-TP2_DPBO24C2 drawio (3)" src="https://github.com/user-attachments/assets/02e94364-dc9a-44dd-93fe-382df87fbec4" />

Terdapat tiga Class yang dibuat dengan masing-masing Class memiliki 3 atribut.
1. Class pertama adalah Sumisang sebagai Base Class yang mempunyai atribut code (menyimpan kode produk), name (menyimpan nama produk), dan price (menyimpan harga produk dalam bentuk int). Class ini memiliki konstruktor, setter, dan getter untuk setiap atributnya.
2. Class kedua adalah Handphone yang merupakan anak dari Class Sumisang sebagai intermediary class. Class ini mempunyai atribut, yaitu, androidVer (menyimpan versi android handphone tersebut), uiVer(menyimpan versi ui dari handphone), dan processor (menyimpan processor yang digunakan). Seperti Class sebelumnya, class ini juga memiliki konstruktor, setter, dan getter.
3. Class terakhit adalah GalaxySeries yang merupakan anak dari Class Handphone atau cucu dari Class Sumisang sebagai derived class. Class ini merupakan bagian lebih spesifik dari Handphone, dengan tiga atribut yaitu imei, model, dan category.

Dalam program yang dibuat, terdapat fitur untuk menambahkan data dengan memasukkan input 'y' atau 'Y', sedangkan saat input bukan 'y' atau 'Y' maka program akan menampilkan list data dengan tabel sebelum program selesai. Pada awal file main, terdapat kode untuk mengatur tabel, dimulai dari mengatur header tabel dengan lebar minimumnya, lalu menghitung lebar kolom berdasarkan perhitungan dari maksimal data yang terdapat pada list, setelah itu mulai menampilkan isi data dari list, dan ditutup kembali dengan garis penutup. Setelah kode untuk tabel, baru dimulai memasukkan 5 objek GalaxySeries ke list sebagai data sample. Dilanjut dengan melakukan looping untuk menambahkan data jika user menginginkan, dan selesai dengan menampilkan seluruh data dalam tabel jika user tidak ingin menambahkan data lagi.

# Dokumentasi

C++
<img width="1920" height="1080" alt="Screenshot (698)" src="https://github.com/user-attachments/assets/90d9ca38-21f1-4015-b31d-db9d45ec1f0d" />

Java
<img width="1920" height="1080" alt="Screenshot (699)" src="https://github.com/user-attachments/assets/b0aa3412-f87a-4912-b3d2-250f394eee1d" />

Python
<img width="1920" height="1080" alt="Screenshot (700)" src="https://github.com/user-attachments/assets/f9ceb413-5bb0-47fa-b018-4234fcc08d81" />

Jika dengan data asal, untuk memperlihatkan tabel dinamis

C++
<img width="1765" height="547" alt="image" src="https://github.com/user-attachments/assets/95ea1baa-0302-4b34-818b-88b0c1aaa5ce" />

Java
<img width="1762" height="554" alt="image" src="https://github.com/user-attachments/assets/b7eefc90-a3d4-4f73-ab3a-3d4b21ecf5e1" />

Python
<img width="1894" height="643" alt="image" src="https://github.com/user-attachments/assets/caca41a0-9972-448e-a57e-52ce508046f4" />
