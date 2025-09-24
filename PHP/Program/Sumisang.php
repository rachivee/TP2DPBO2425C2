<?php
class Sumisang {
    private $code;
    private $name;
    private $price;
    private $photo;  // Menambahkan atribut untuk foto

    // Constructor
    public function __construct($code = "", $name = "", $price = 0, $photo = "") {
        $this->code = $code;
        $this->name = $name;
        $this->price = $price;
        $this->photo = $photo;  // Menyimpan foto
    }

    // Setters and Getters
    public function setCode($code) {
        $this->code = $code;
    }

    public function getCode() {
        return $this->code;
    }

    public function setName($name) {
        $this->name = $name;
    }

    public function getName() {
        return $this->name;
    }

    public function setPrice($price) {
        $this->price = $price;
    }

    public function getPrice() {
        return $this->price;
    }

    // Setter dan Getter untuk foto
    public function setPhoto($photo) {
        $this->photo = $photo;
    }

    public function getPhoto() {
        return $this->photo;
    }
}
?>
