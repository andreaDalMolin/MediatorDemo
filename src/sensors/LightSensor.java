package sensors;

import mediator.Mediator;
import mediator.SensorToggles;

public class LightSensor implements Sensor {
    private final boolean isOn;
    private final Mediator homeMediator;

    public LightSensor(Mediator mediator) {
        this.isOn = false;
        this.homeMediator = mediator;
    }

    @Override
    public void toggle() throws InterruptedException {
        homeMediator.toggle(SensorToggles.LIGHT_SENSOR);
    }

    @Override
    public boolean isOn() {
        return this.isOn;
    }
}
