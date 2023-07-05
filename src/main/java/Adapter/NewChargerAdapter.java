package Adapter;

public class NewChargerAdapter implements NewCharger {

    /**
     * 适配目标
     */
    private final Charger charger;

    public NewChargerAdapter(Charger charger) {
        this.charger = charger;
    }

    @Override
    public void getCnCharger() {
        charger.getCharge();
        System.out.println("中国电器再加110V，现在是220V了");
    }
}
