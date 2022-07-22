package com.yilmaznaslan;

import de.bvg.Train;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainApplication {
    private static Logger LOGGER = LoggerFactory.getLogger(MainApplication.class);

    public static void main(String [] args){
        Bus bus_1 = new Bus("M49", 30);
        Train train_1 = new Train("Urban Train");
        LOGGER.info("Main application is starting. Bus capacity: {}",bus_1.getCapacity());
    }
}
