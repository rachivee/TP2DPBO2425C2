#include <iostream>
#include <string>
#include "Handphone.cpp"

using namespace std;

// Kelas GalaxySeries, turunan dari Handphone
class GalaxySeries : public Handphone{
    private:
        string imei;
        string model;
        string category;

    public:
        // Konstruktor default dan parameterized
        GalaxySeries(){
        }

        GalaxySeries(string code, string name, int price, string androidVer, string uiVer, string processor, string imei, string model, string category) : Handphone(code, name, price, androidVer, uiVer, processor){
            this->imei = imei;
            this->model = model;
            this->category = category;
        }

        // Setter dan Getter untuk imei
        void setImei(string imei){
            this->imei = imei;
        }

        string getImei(){
            return this->imei;
        }

        // Setter dan Getter untuk model
        void setModel(string model){
            this->model = model;
        }

        string getModel(){
            return this->model;
        }

        // Setter dan Getter untuk category
        void setCategory(string category){
            this->category = category;
        }

        string getCategory(){
            return this->category;
        }

        ~GalaxySeries(){
        }
};
      