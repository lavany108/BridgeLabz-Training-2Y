package LambdaExpression;

interface LightAction {
    void activate();
}
public class SmartHomeLighting {
    public static void main(String[] args) {
        LightAction motionDetected = () -> System.out.println("Motion detected!! Turning on the lights.");
        LightAction nightTime = () -> System.out.println("Night time!! Dimming lights to relax.");
        LightAction voiceCommand = () -> System.out.println("Voice command received!! Changing light color to blue.");
        motionDetected.activate();
        nightTime.activate();
        voiceCommand.activate();
    }
}
