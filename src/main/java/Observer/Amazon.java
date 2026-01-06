package Observer;

import java.util.ArrayList;
import java.util.List;

public class Amazon {

    private static Amazon amazon;
    private List<OnOrderPlacedSubscriber> registeredServices=new ArrayList<>();


    public static Amazon getInstance(){
        if(amazon==null)
            amazon=new Amazon();
        return amazon;
    }

    public void register(OnOrderPlacedSubscriber subscriber){
        registeredServices.add(subscriber);
    }

    public void deRegister(OnOrderPlacedSubscriber subscriber){
        registeredServices.remove(subscriber);
    }

    public void onOrderPlaced(){
        for (OnOrderPlacedSubscriber subscriber:registeredServices)
            subscriber.notifyOrderPlaced();
    }
}
