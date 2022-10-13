package sensors;

import mediator.Mediator;
import mediator.SensorToggles;

public class Switch implements Sensor {
    private final boolean isOn;
    private final Mediator homeMediator;

    public Switch(Mediator mediator) {
        this.isOn = false;
        this.homeMediator = mediator;
    }

    @Override
    public void toggle() throws InterruptedException {
        homeMediator.toggle(SensorToggles.SWITCH);
    }

    @Override
    public boolean isOn() {
        return this.isOn;
    }
}
