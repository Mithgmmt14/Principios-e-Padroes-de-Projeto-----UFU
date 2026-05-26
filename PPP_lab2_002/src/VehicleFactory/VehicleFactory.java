package VehicleFactory;

import Vehicle.*;

public interface VehicleFactory {
    public IVehicle makeVehicle(String modelo);
}
