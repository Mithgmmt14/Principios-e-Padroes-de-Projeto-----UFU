package Vehicle;

public class Etios implements IVehicle {

    @Override
    public void start() {
        System.out.println("Toyota Etios ligado.");
    }

    @Override
    public void drive() {
        System.out.println("Dirigindo o Toyota Etios.");
    }

    @Override
    public void stop() {
        System.out.println("Toyota Etios desligado.");
    }

    public void teste() {
        this.start();
        this.drive();
        this.stop();
    }
}
