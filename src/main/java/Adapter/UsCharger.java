package Adapter;

/**
 * 美国电压
 */
public class UsCharger implements Charger {

    @Override
    public void getCharge() {
        System.out.println("美国电器电压，支持110V");
    }
}
