package Strategy;

public class WalkPathCalculator implements PathCalculatorStrategy{
    @Override
    public void getPath(String from, String to) {
        System.out.println("Walk Path");
    }
}
