package Vehicle;

public class Corolla implements IVehicle {

    @Override
    public void start() {
        System.out.println("Toyota Corolla ligado.");
    }

    @Override
    public void drive() {
        System.out.println("Dirigindo o Toyota Corolla.");
    }

    @Override
    public void stop() {
        System.out.println("Toyota Corolla desligado.");
    }

    public void teste() {
        this.start();
        this.drive();
        this.stop();
    }
}
