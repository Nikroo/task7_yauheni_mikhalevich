package by.itacademy.robot.head.factory;

import by.itacademy.robot.head.EmitterHead;
import by.itacademy.robot.head.Head;
import by.itacademy.robot.head.SensorHead;

public enum HeadFactory {
    SENSOR_HEAD {
        public Head setHead(int id){
            return new SensorHead(id);
        }
    },
    EMITTER_HEAD {
        public Head setHead(int id){
            return new EmitterHead(id);
        }
    };

    public abstract Head setHead(int id);
}

