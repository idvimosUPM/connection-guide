package org.connection;

import com.cyberbotics.webots.controller.Camera;
import com.cyberbotics.webots.controller.vehicle.Car;

public class DrivingJava extends Car {

    private int timeStep = 128;
    private Camera camera = getCamera("camera");
    void run() {
        while (step(timeStep) != -1) {
            setCruisingSpeed(100.0);
            camera.enable(2);
        }
    }
    public static void main(String[] args) {
        new DrivingJava().run();
    }
}