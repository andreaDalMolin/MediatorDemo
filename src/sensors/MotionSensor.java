package sensors;

import mediator.Mediator;
import mediator.SensorToggles;

public class MotionSensor implements Sensor {
    private final boolean isOn;
    private final Mediator homeMediator;

    public MotionSensor(Mediator mediator) {
        this.isOn = false;
        this.homeMediator = mediator;
    }

    @Override
    public void toggle() throws InterruptedException {
        homeMediator.toggle(SensorToggles.MOTION_SENSOR);
    }

    @Override
    public boolean isOn() {
        return this.isOn;
    }
}
