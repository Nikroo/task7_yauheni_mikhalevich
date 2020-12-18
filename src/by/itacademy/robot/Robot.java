package by.itacademy.robot;

public class Robot <T1, T2> {

    private T1 head;

    private T2 body;

    public Robot(T1 head, T2 body) {
        this.head = head;
        this.body = body;
    }

    public Robot() {
    }

    public void setHead(T1 head) {
        this.head = head;
    }


    @Override
    public String toString() {
        return "Robot{" + head +" " + body +'}';
    }
}
