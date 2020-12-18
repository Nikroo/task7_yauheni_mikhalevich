package by.itacademy.robot.body;

public abstract class Body {
    private int id;

    public Body(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Body{" +
                "id=" + id +
                '}';
    }
}
