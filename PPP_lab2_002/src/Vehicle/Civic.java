package Vehicle;

public class Civic implements IVehicle {

    @Override
    public void start() {
        System.out.println("Honda Civic ligado.");
    }

    @Override
    public void drive() {
        System.out.println("Dirigindo o Honda Civic.");
    }

    @Override
    public void stop() {
        System.out.println("Honda Civic desligado.");
    }

    public void teste() {
        this.start();
        this.drive();
        this.stop();
    }
}
