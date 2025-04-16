package Command_pattern;

public class SmartHomeRemote {
    public static void main(String[] args) {
        Light light = new Light("Living Room");
        Thermostat thermostat = new Thermostat();

        Command lightOn = new TurnOnLightCommand(light);
        Command setTemp = new SetThermostatCommand(thermostat, 22);

        SmartHomeRemoteControl remote = new SmartHomeRemoteControl();
        remote.setCommand("light_on", lightOn);
        remote.setCommand("set_temp", setTemp);

        remote.pressButton("light_on");
        remote.pressButton("set_temp");
        remote.undoButton();
    }
}
