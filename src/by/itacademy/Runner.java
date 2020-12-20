package by.itacademy;

import by.itacademy.factory.HeadFactory;
import by.itacademy.factory.BodyFactory;
import by.itacademy.robot.body.Body;
import by.itacademy.robot.head.Head;
import by.itacademy.robot.Robot;

public class Runner {

    public static void main(String[] args) {

        Robot<Head, Body> robot0 = new Robot<>(HeadFactory.SENSOR_HEAD.getInstance(1), BodyFactory.WATER_BODY.getInstance(1));
        Robot<Head, Body> robot1 = new Robot<>(HeadFactory.EMITTER_HEAD.getInstance(1), BodyFactory.WATER_BODY.getInstance(1));
        Robot<Head, Body> robot2 = new Robot<>(HeadFactory.SENSOR_HEAD.getInstance(2), BodyFactory.AIR_BODY.getInstance(2));
        Robot<Head, Body> robot3 = new Robot<>(HeadFactory.REFLECTOR_HEAD.getInstance(3), BodyFactory.GROUND_BODY.getInstance(3));

        System.out.println(robot0.toString());
        System.out.println(robot1.toString());
        System.out.println(robot2.toString());
        System.out.println(robot3.toString());
    }

}
