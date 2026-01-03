package Strategy;

public class GoogleMap {
    public void getPath(String from, String to, PathType mode){
        PathCalculatorStrategy pathCalculatorStrategy=PathCalculatorFactory.getPathCalculatorForMode(mode);
        pathCalculatorStrategy.getPath(from,to);
    }
}
