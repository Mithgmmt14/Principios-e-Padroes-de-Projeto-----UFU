package Vehicle;

public class Hilux implements IVehicle {

    @Override
    public void start() {
        System.out.println("Toyota Hilux ligada.");
    }

    @Override
    public void drive() {
        System.out.println("Dirigindo a Toyota Hilux.");
    }

    @Override
    public void stop() {
        System.out.println("Toyota Hilux desligada.");
    }

    public void teste() {
        this.start();
        this.drive();
        this.stop();
    }
}
