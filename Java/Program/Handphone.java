// kelas Handphone yang merupakan subclass dari Sumisang
public class Handphone extends Sumisang {
    // atribut tambahan untuk Handphone
    private String androidVer;
    private String uiVer;
    private String processor;

    // konstruktor default
    public Handphone() {
        super();
    }

    // konstruktor parameterized
    public Handphone(String code, String name, int price, String androidVer, String uiVer, String processor) {
        super(code, name, price);
        this.androidVer = androidVer;
        this.uiVer = uiVer;
        this.processor = processor;
    }

    // setter dan getter untuk androidVer
    public String getAndroidVer() {
        return androidVer;
    }

    public void setAndroidVer(String androidVer) {
        this.androidVer = androidVer;
    }

    // setter dan getter untuk uiVer
    public String getUiVer() {
        return uiVer;
    }

    public void setUiVer(String uiVer) {
        this.uiVer = uiVer;
    }

    // setter dan getter untuk processor
    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }
}
