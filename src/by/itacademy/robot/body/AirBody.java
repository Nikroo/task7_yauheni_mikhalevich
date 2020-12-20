package by.itacademy.robot.body;

public class AirBody extends Body {
    public AirBody(int id) {
        super(id);
    }

    @Override
    public String toString() {
        return "air-" + super.getId();
    }
}
