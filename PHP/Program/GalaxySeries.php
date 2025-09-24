<?php
require_once "Handphone.php";

class GalaxySeries extends Handphone {
    private $imei;
    private $model;
    private $category;

    // Constructor
    public function __construct($code, $name, $price, $androidVer, $uiVer, $processor, $imei, $model, $category, $photo) {
        parent::__construct($code, $name, $price, $androidVer, $uiVer, $processor, $photo);  // Menambahkan foto
        $this->imei = $imei;
        $this->model = $model;
        $this->category = $category;
    }

    // Setters and Getters
    public function setImei($imei) {
        $this->imei = $imei;
    }

    public function getImei() {
        return $this->imei;
    }

    public function setModel($model) {
        $this->model = $model;
    }

    public function getModel() {
        return $this->model;
    }

    public function setCategory($category) {
        $this->category = $category;
    }

    public function getCategory() {
        return $this->category;
    }
}
?>
