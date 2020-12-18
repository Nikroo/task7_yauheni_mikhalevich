package by.itacademy.robot.body.factory;

import by.itacademy.robot.body.AirBody;
import by.itacademy.robot.body.Body;
import by.itacademy.robot.body.WaterBody;

public enum BodyFactory {
    AIR_BODY{
        public Body setBody(int id){
            return new AirBody(id);
        }
    },
    WATER_BODY {
        public Body setBody(int id) {
            return new WaterBody(id);
        }
    };
    public abstract Body setBody(int id);
}
