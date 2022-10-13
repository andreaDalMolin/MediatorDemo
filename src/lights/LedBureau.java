package lights;

public class LedBureau implements Light {
    private boolean isOn;

    public LedBureau() {
        this.isOn = false;
    }

    @Override
    public void turnOn() {
        this.isOn = true;
        System.out.println("LED du bureau allumés !");
    }

    @Override
    public void turnOff() {
        this.isOn = true;
        System.out.println("LED du bureau éteinte !");
    }
}
