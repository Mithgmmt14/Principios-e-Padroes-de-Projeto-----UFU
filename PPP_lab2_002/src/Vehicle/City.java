package Vehicle;

public class City implements IVehicle {

    @Override
    public void start() {
        System.out.println("Honda City ligado.");
    }

    @Override
    public void drive() {
        System.out.println("Dirigindo o Honda City.");
    }

    @Override
    public void stop() {
        System.out.println("Honda City desligado.");
    }

    @Override
    public void teste() {
        this.start();
        this.drive();
        this.stop();
    }


}
