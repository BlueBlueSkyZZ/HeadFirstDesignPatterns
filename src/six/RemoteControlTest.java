package six;

public class RemoteControlTest {

    public static void main(String[] args) { //client
        SimpleRemoteControl remote = new SimpleRemoteControl(); //invoker
        Light light = new Light(); //receiver
        GarageDoor garageDoor = new GarageDoor();

        LightOnCommand lightOn = new LightOnCommand(light); //command
        GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(garageDoor);

        remote.setCommand(lightOn); //setCommand()
        remote.buttonWasPressed(); //execute()

        remote.setCommand(garageOpen);
        remote.buttonWasPressed();

    }

}
