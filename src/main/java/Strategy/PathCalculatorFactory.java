package Strategy;

public class PathCalculatorFactory {

    public static PathCalculatorStrategy getPathCalculatorForMode(PathType mode){
        if(mode.equals(PathType.CAR))
            return new CarPathCalculator();
        if(mode.equals(PathType.BIKE))
            return new BikePathCalculator();
        if(mode.equals(PathType.WALK))
            return new WalkPathCalculator();
        return null;
    }
}
