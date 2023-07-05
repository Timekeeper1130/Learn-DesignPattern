package Adapter;

public class TestAdapter {

    public void test() {
        Charger usCharger = new UsCharger();
        NewCharger newCharger = new NewChargerAdapter(usCharger);;
        newCharger.getCnCharger();
    }

}
