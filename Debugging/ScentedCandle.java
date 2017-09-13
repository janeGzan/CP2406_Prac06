public class ScentedCandle extends Candle {
    private String scent;

    ScentedCandle(String colorInput, double heightInput, double priceInput, String scentInput) {
        super(colorInput, heightInput, priceInput);
        this.scent = scentInput;

    }

    @Override
    public void setHeight() {
        this.price = this.height * 3;
    }

    public String displayInfo() {
        return "A " + this.color + " candle that is" + scent + " scented and " + this.height + " tall is $" + this.price;
    }
}