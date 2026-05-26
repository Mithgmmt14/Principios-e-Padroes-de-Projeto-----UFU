package VehicleFactory;
import Vehicle.*;
public class Honda implements VehicleFactory {
    private static Honda instance;
    private Honda(){}
    public static VehicleFactory getInstance(){
        if (instance == null ){
            instance = new Honda();
        }
        return instance;
    }
    @Override
    public IVehicle makeVehicle(String modelo) {
        if ( modelo.equalsIgnoreCase("City")){
            return new City();
        }
        if ( modelo.equalsIgnoreCase("Civic")){
            return new Civic();
        }
        if ( modelo.equalsIgnoreCase("Fit") ){
            return new Fit();
        }
        return null;
    }
}
