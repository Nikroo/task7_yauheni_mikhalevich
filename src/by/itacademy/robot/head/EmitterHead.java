package by.itacademy.robot.head;

public class EmitterHead extends Head {
    public EmitterHead(int id) {
        super(id);
    }

    @Override
    public String toString() {
        return "emitter-" + super.getId();
    }
}
