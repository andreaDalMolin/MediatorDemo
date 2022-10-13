package sensors;

public interface Sensor {
    void toggle() throws InterruptedException;

    boolean isOn();
}