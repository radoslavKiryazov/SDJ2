package TrafficLight;

public class TrafficLightTest {
    public static void main(String[] args) throws InterruptedException {
        TrafficLights trafficLights1 = new TrafficLights();
        CarVersion3 carVersion3 = new CarVersion3(trafficLights1);
        trafficLights1.start();

    }
}
