package VehicleFactory;
import Vehicle.*;
public class Toyota implements VehicleFactory{
    private static Toyota instance;
    private Toyota(){}
    public static VehicleFactory getInstance(){
        if (instance == null ){
            instance = new Toyota();
        }
        return instance;
    }
    @Override
    public IVehicle makeVehicle(String modelo) {
        if ( modelo.equalsIgnoreCase("Corolla")){
            return new Corolla();
        }
        if ( modelo.equalsIgnoreCase("Hilux")){
            return new Hilux();
        }
        if ( modelo.equalsIgnoreCase("Etios") ){
            return new Etios();
        }
        return null;
    }
}
