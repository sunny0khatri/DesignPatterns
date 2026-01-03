package Strategy;

public class CarPathCalculator implements PathCalculatorStrategy{
    @Override
    public void getPath(String from, String to) {
        System.out.println("Car Path");
    }
}
