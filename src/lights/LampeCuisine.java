package lights;

public class LampeCuisine implements Light {
    private boolean isOn;

    public LampeCuisine(){
        this.isOn = false;
    }

    @Override
    public void turnOn() {
        this.isOn = true;
        System.out.println("Lampe de la cuisine allumée !");
    }

    @Override
    public void turnOff() {
        this.isOn = false;
        System.out.println("Lampe de la cuisine éteinte !");
    }
}
