package Strategy;

public class BikePathCalculator implements PathCalculatorStrategy{
    @Override
    public void getPath(String from, String to) {
        System.out.println("Bike Path");
    }
}
