public class DemoCandles {
    public static void  main(String[] args){
        Candle candle = new Candle("blue", 5.2);
        ScentedCandle scentedCandle = new ScentedCandle("black", 6, 5.50, "Vanilla");

        System.out.println(candle.displayInfo());
        System.out.println(scentedCandle.displayInfo());
    }
}
