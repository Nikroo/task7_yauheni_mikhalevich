package by.itacademy.factory;

import by.itacademy.robot.head.EmitterHead;
import by.itacademy.robot.head.Head;
import by.itacademy.robot.head.ReflectorHead;
import by.itacademy.robot.head.SensorHead;

public enum HeadFactory {
    SENSOR_HEAD {
        public Head getInstance(int id){
            return new SensorHead(id);
        }
    },
    EMITTER_HEAD {
        public Head getInstance(int id){
            return new EmitterHead(id);
        }
    },
    REFLECTOR_HEAD {
        public Head getInstance(int id){
            return new ReflectorHead(id);
        }
    };

    public abstract Head getInstance(int id);
}

