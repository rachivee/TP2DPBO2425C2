// kelas GalaxySeries yang merupakan subclass dari Handphone
public class GalaxySeries extends Handphone {
    // atribut tambahan untuk GalaxySeries
    private String imei;
    private String model;
    private String category;

    // konstruktor default
    public GalaxySeries() {
        super();
    }

    // konstruktor parameterized
    public GalaxySeries(String code, String name, int price, String androidVer, String uiVer, String processor, String imei, String model, String category) {
        super(code, name, price, androidVer, uiVer, processor);
        this.imei = imei;
        this.model = model;
        this.category = category;
    }

    // setter dan getter untuk imei
    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    // setter dan getter untuk model
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    // setter dan getter untuk category
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
