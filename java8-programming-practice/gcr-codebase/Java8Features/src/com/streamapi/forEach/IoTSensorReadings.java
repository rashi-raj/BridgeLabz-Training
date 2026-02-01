package com.streamapi.forEach;
import java.util.List;

public class IoTSensorReadings {
    public static void main(String[] args) {

        List<Double> readings = List.of(22.5, 30.1, 18.9, 35.6, 28.4);
        double threshold = 25.0;

        readings.stream()
                .filter(r -> r > threshold)
                .forEach(r ->
                    System.out.println("High Sensor Reading: " + r)
                );
    }
}
