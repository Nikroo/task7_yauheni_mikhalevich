package by.itacademy;

import by.itacademy.robot.Robot;
import by.itacademy.robot.body.Body;
import by.itacademy.robot.body.factory.BodyFactory;
import by.itacademy.robot.head.Head;
import by.itacademy.robot.head.factory.HeadFactory;

public class Runner {

    public static void main(String[] args) {

        //Robot<Head, Body> robot = new Robot<>(new SensorHead(0), new AirBody(0));

        Robot<Head, Body> robot1 = new Robot<>(HeadFactory.EMITTER_HEAD.setHead(1), BodyFactory.AIR_BODY.setBody(1));
        Robot<Head, Body> robot2 = new Robot();

        robot2.setHead(HeadFactory.SENSOR_HEAD.setHead(2));


        //System.out.println(robot.toString());

        System.out.println(robot1.toString());
        System.out.println(robot2.toString());
    }

}
