package by.itacademy.robot.body;

public class WaterBody extends Body {
    public WaterBody(int id) {
        super(id);
    }
    @Override
    public String toString() {
        return "WaterBody-"+super.getId();
    }
}
