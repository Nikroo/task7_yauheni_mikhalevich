package by.itacademy.robot;

public class Robot<T1, T2> {
    private String name;
    private T1 head;
    private T2 body;

    public Robot(T1 head, T2 body) {
        this.head = head;
        this.body = body;
        this.name = setName();
    }

    public void setHead(T1 head) {
        this.head = head;
    }

    public void setBody(T2 body) {
        this.body = body;
    }

    public String setName() {
        return head.toString().substring(0, 1).toUpperCase() + body.toString().substring(0, 1);
    }

    @Override
    public String toString() {
        return "Robot[Name: " + name + "; Head: " + head + "; Body: " + body + ']';
    }
}
