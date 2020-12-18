package by.itacademy.robot.head;

public class SensorHead extends Head {
    public SensorHead(int id) {
        super(id);
    }
    @Override
    public String toString() {
        return "SensorHead-"+super.getId();
    }
}
