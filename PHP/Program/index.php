<?php
// Mengimpor kelas-kelas yang telah dipisah
require_once ('Sumisang.php');
require_once ('Handphone.php');
require_once ('GalaxySeries.php');

// Array untuk menyimpan produk
$daftarHP = [
    new GalaxySeries("G001", "Galaxy A10", 2000000, "Android 10", "One UI 2", "Exynos 7884", "IMEI001", "SM-A105", "Entry", "images/g01.jpg"),
    new GalaxySeries("G002", "Galaxy S20", 12000000, "Android 11", "One UI 3", "Exynos 990", "IMEI002", "SM-G980", "Flagship", "images/g02.jpg"),
    new GalaxySeries("G003", "Galaxy M21", 3000000, "Android 11", "One UI 3.1", "Exynos 9611", "IMEI003", "SM-M215", "Mid", "images/g03.jpg"),
    new GalaxySeries("G004", "Galaxy Z Flip", 18000000, "Android 12", "One UI 4", "Snapdragon 855+", "IMEI004", "SM-F700", "Foldable", "images/g04.jpg"),
    new GalaxySeries("G005", "Galaxy Note 10", 14000000, "Android 10", "One UI 2.5", "Exynos 9825", "IMEI005", "SM-N970", "Note", "images/g05.jpg"),
];

// Proses jika form untuk menambah produk dikirim
if ($_SERVER['REQUEST_METHOD'] == 'POST') {
    $code = $_POST['code'];
    $name = $_POST['name'];
    $price = $_POST['price'];
    $androidVer = $_POST['androidVer'];
    $uiVer = $_POST['uiVer'];
    $processor = $_POST['processor'];
    $imei = $_POST['imei'];
    $model = $_POST['model'];
    $category = $_POST['category'];

    // Handle file upload
    if (isset($_FILES['photo']) && $_FILES['photo']['error'] == UPLOAD_ERR_OK) {
        $photoTmpName = $_FILES['photo']['tmp_name'];
        $photoName = basename($_FILES['photo']['name']);
        $photoPath = 'images/' . $photoName;

        // pindahkan file ke direktori 'images/'
        move_uploaded_file($photoTmpName, $photoPath);
    } else {
        $photoPath = ''; //jika tidak ada foto yang diupload 
    }

    // Menambahkan produk baru ke array daftarHP
    $daftarHP[] = new GalaxySeries($code, $name, $price, $androidVer, $uiVer, $processor, $imei, $model, $category, $photoPath);
}
?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Daftar Galaxy Series</title>
</head>
<body>

<h1>Daftar Galaxy Series</h1>

<!-- Form untuk menambah produk baru -->
<h2>Tambah Produk Baru</h2>
<form action="" method="POST" enctype="multipart/form-data">
    <label for="code">Code:</label><br>
    <input type="text" id="code" name="code" required><br><br>

    <label for="name">Name:</label><br>
    <input type="text" id="name" name="name" required><br><br>

    <label for="price">Price:</label><br>
    <input type="number" id="price" name="price" required><br><br>

    <label for="androidVer">Android Version:</label><br>
    <input type="text" id="androidVer" name="androidVer" required><br><br>

    <label for="uiVer">UI Version:</label><br>
    <input type="text" id="uiVer" name="uiVer" required><br><br>

    <label for="processor">Processor:</label><br>
    <input type="text" id="processor" name="processor" required><br><br>

    <label for="imei">IMEI:</label><br>
    <input type="text" id="imei" name="imei" required><br><br>

    <label for="model">Model:</label><br>
    <input type="text" id="model" name="model" required><br><br>

    <label for="category">Category:</label><br>
    <input type="text" id="category" name="category" required><br><br>

    <label for="photo">Upload Photo:</label><br>
    <input type="file" id="photo" name="photo" required><br><br>

    <input type="submit" value="Tambah Produk">
</form>

<hr>

<!-- Tabel Daftar Produk -->
<h2>Daftar Galaxy Series</h2>
<table border="1" cellpadding="5" cellspacing="0">
    <tr>
        <th>Code</th>
        <th>Name</th>
        <th>Price</th>
        <th>Android</th>
        <th>UI</th>
        <th>Processor</th>
        <th>IMEI</th>
        <th>Model</th>
        <th>Category</th>
        <th>Photo</th>
    </tr>
    <?php
    // Loop untuk menampilkan data produk
    foreach ($daftarHP as $hp) {
        // Menampilkan setiap atribut
        echo "<tr>";
        echo "<td>" . $hp->getCode() . "</td>";
        echo "<td>" . $hp->getName() . "</td>";
        echo "<td>" . $hp->getPrice() . "</td>";
        echo "<td>" . $hp->getAndroidVer() . "</td>";
        echo "<td>" . $hp->getUiVer() . "</td>";
        echo "<td>" . $hp->getProcessor() . "</td>";
        echo "<td>" . $hp->getImei() . "</td>";
        echo "<td>" . $hp->getModel() . "</td>";
        echo "<td>" . $hp->getCategory() . "</td>";
        // Menampilkan foto jika ada
        if ($hp->getPhoto()) {
            echo "<td><img src='" . $hp->getPhoto() . "' alt='Photo' width='100'></td>";
        } else {
            echo "<td>No Photo</td>";
        }
        echo "</tr>";
    }
    ?>
</table>
</body>
</html>
