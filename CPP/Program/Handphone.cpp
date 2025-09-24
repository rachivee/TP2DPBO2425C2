#include <iostream>
#include <string>
#include "Sumisang.cpp"

using namespace std;

// Kelas Handphone, turunan dari Sumisang
class Handphone : public Sumisang{
    private:
        string androidVer;
        string uiVer;
        string processor;

    public:
        // Konstruktor default dan parameterized
        Handphone(){
        }

        Handphone(string code, string name, int price, string androidVer, string uiVer, string processor) : Sumisang(code, name, price){
            this->androidVer = androidVer;
            this->uiVer = uiVer;
            this->processor = processor;
        }

        // Setter dan Getter untuk androidVer
        void setAndroidVer(string androidVer){
            this->androidVer = androidVer;
        }

        string getAndroidVer(){
            return this->androidVer;
        }

        // Setter dan Getter untuk uiVer
        void setUiVer(string uiVer){
            this->uiVer = uiVer;
        }

        string getUiVer(){
            return this->uiVer;
        }

        // Setter dan Getter untuk processor
        void setProcessor(string processor){
            this->processor = processor;
        }

        string getProcessor(){
            return this->processor;
        }

        ~Handphone(){
        }
};