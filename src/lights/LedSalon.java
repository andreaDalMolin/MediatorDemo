package lights;

public class LedSalon implements Light {
    private boolean isOn;

    public LedSalon() {
        this.isOn = false;
    }

    @Override
    public void turnOn() {
        this.isOn = true;
        System.out.println("LED du salon allumés !");
    }

    @Override
    public void turnOff() {
        this.isOn = false;
        System.out.println("LED du salon éteintes !");
    }
}
