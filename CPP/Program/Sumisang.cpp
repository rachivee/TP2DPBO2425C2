#include <iostream>
#include <string>

using namespace std;

// Kelas Sumisang
class Sumisang{
    private:
        string code;
        string name;
        int price;

    public:
        // Konstruktor default dan parameterized
        Sumisang(){
            this->code = "";
            this->name = "";
            this->price = 0;
        }

        Sumisang(string code, string name, int price){
            this->code = code;
            this->name = name;
            this->price = price;
        }
        
        // Setter dan Getter untuk code
        void setCode(string code){
            this->code = code;
        }

        string getCode(){
            return this->code;
        }

        // Setter dan Getter untuk name
        void setName(string name){
            this->name = name;
        }

        string getName(){
            return this->name;
        }

        // Setter dan Getter untuk price
        void setPrice(int price){
            this->price = price;
        }

        int getPrice(){
            return this->price;
        }

        ~Sumisang(){
        }
};