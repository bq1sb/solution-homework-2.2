package Command_pattern;

public class Thermostat {
    private int temperature = 15;
    private int prevTemperature = 15;

    public void setTemperature(int temp) {
        prevTemperature = temperature;
        temperature = temp;
        System.out.println("[Thermostat] setting temperature to " + temperature + "*");

    }

    public void revertTemperature() {
        System.out.println("[Thermostat] reverting to previous temperature: " + prevTemperature + "*");
        int temp = temperature;
        temperature = prevTemperature;
        prevTemperature = temp;

    }
}

