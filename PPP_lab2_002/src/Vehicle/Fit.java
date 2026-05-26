package Vehicle;

public class Fit implements IVehicle {

    @Override
    public void start() {
        System.out.println("Honda Fit ligado.");
    }

    @Override
    public void drive() {
        System.out.println("Dirigindo o Honda Fit.");
    }

    @Override
    public void stop() {
        System.out.println("Honda Fit desligado.");
    }

    public void teste() {
        this.start();
        this.drive();
        this.stop();
    }
}
