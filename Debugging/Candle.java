public class Candle {
    String color;
    double height;
    double price;

    Candle(String colorInput, double heightInput, double priceInput){
        this.color = colorInput;
        this.height = heightInput;
        this.price = priceInput;
    }
    Candle(String colorInput, double heightInput){
        this.color = colorInput;
        this.height = heightInput;
        setHeight();
    }
    public void setHeight(){
        this.price = this.height * 2;
    }

    public String displayInfo(){
        return "A "+ this.color +" candle and " + this.height + " tall is $" + this.price;
    }
}
