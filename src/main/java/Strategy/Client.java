package Strategy;

public class Client {
    public static void main(String[] args) {
        GoogleMap map=new GoogleMap();
        map.getPath("Patna","Ambala",PathType.CAR);
    }
}
