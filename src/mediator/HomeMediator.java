package mediator;

import lights.LampeCuisine;
import lights.LedBureau;
import lights.LedSalon;

public class HomeMediator implements Mediator {
    private final LedBureau ledBureau;
    private final LedSalon ledSalon;
    private final LampeCuisine lampeCuisine;

    public HomeMediator(){
        this.ledBureau = new LedBureau();
        this.ledSalon = new LedSalon();
        this.lampeCuisine = new LampeCuisine();
    }

    @Override
    public void toggle(SensorToggles toggledSensor) throws InterruptedException {
        switch (toggledSensor) {
            case LIGHT_SENSOR:
                System.out.println("Allumage des LED du bureau...");
                Thread.sleep(1000);
                ledBureau.turnOn();
                break;
            case MOTION_SENSOR:
                System.out.println("Allumage des LED du salon...");
                Thread.sleep(1000);
                ledSalon.turnOn();
                break;
            case SWITCH:
                System.out.println("Allumage de la lampe de cuisine...");
                Thread.sleep(1000);
                lampeCuisine.turnOn();
                break;
        }
    }
}
