package by.itacademy.robot.head;

public abstract class Head {
    private int id;

    public Head(int id) {
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
        return "Head{" +
                "id=" + id +
                '}';
    }
}
