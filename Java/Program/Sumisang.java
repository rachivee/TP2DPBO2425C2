// kelas Sumisang
public class Sumisang {
    // atribut
    private String code;
    private String name;
    private int price;

    // konstruktor default
    public Sumisang() {
        this.code = "";
        this.name = "";
        this.price = 0;
    }

    // konstruktor parameterized
    public Sumisang(String code, String name, int price) {
        this.code = code;
        this.name = name;
        this.price = price;
    }

    // setter dan getter untuk code
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    // setter dan getter untuk name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // setter dan getter untuk price
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
