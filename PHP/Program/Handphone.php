<?php
require_once "Sumisang.php";

class Handphone extends Sumisang {
    private $androidVer;
    private $uiVer;
    private $processor;

    // Constructor
    public function __construct($code, $name, $price, $androidVer, $uiVer, $processor, $photo) {
        parent::__construct($code, $name, $price, $photo);  // Menambahkan foto
        $this->androidVer = $androidVer;
        $this->uiVer = $uiVer;
        $this->processor = $processor;
    }

    // Setters and Getters
    public function setAndroidVer($androidVer) {
        $this->androidVer = $androidVer;
    }

    public function getAndroidVer() {
        return $this->androidVer;
    }

    public function setUiVer($uiVer) {
        $this->uiVer = $uiVer;
    }

    public function getUiVer() {
        return $this->uiVer;
    }

    public function setProcessor($processor) {
        $this->processor = $processor;
    }

    public function getProcessor() {
        return $this->processor;
    }
}
?>
