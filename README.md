# TP2DPBO2425C2

Saya Farah Maulida dengan NIM 2410024 mengerjakan Tugas Praktikum 2 dalam mata kuliah Desain dan Pemrograman Berbasis Objek untuk keberkahan-Nya maka saya tidak akan melakukan kecurangan seperti yang telah di spesifikasikan Aamiin.

Pada TP DPBO ke-2 ini, saya mengembangkan class Sumisang yang sebelumnya telah dibuat dengan menggunakan konsep multilevel inheritence. Berikut adalah desain dalam bentuk diagram:

<img width="500" height="300" alt="DPBO-TP2_DPBO24C2 drawio (3)" src="https://github.com/user-attachments/assets/02e94364-dc9a-44dd-93fe-382df87fbec4" />

Terdapat tiga Class yang dibuat dengan masing-masing Class memiliki 3 atribut.
1. Class pertama adalah Sumisang sebagai Base Class yang mempunyai atribut code (menyimpan kode produk), name (menyimpan nama produk), dan price (menyimpan harga produk dalam bentuk int). Class ini memiliki konstruktor, setter, dan getter untuk setiap atributnya.
2. Class kedua adalah Handphone yang merupakan anak dari Class Sumisang sebagai intermediary class. Class ini mempunyai atribut, yaitu, androidVer (menyimpan versi android handphone tersebut), uiVer(menyimpan versi ui dari handphone), dan processor (menyimpan processor yang digunakan). Seperti Class sebelumnya, class ini juga memiliki konstruktor, setter, dan getter.
3. Class terakhit adalah GalaxySeries yang merupakan anak dari Class Handphone atau cucu dari Class Sumisang sebagai derived class. Class ini merupakan bagian lebih spesifik dari Handphone, dengan tiga atribut yaitu imei, model, dan category.
