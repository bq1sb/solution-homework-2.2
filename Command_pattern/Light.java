package Command_pattern;


public class Light {
    private String location;
    private boolean isOn = false;
    public Light(String location){
        this.location = location;
    }
    public void turnOn(){
        System.out.println("[" + location + " Light] Turning on");
        isOn = true;
    }
    public void turnOff(){
        System.out.println("[" + location + "Light] Turning off");

    }
}
