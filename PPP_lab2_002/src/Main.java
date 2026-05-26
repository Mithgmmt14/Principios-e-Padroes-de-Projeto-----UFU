import Vehicle.*;
import VehicleFactory.*;

public class Main {
    public static void main(String[] args) {
        VehicleFactory hondaFactory = Honda.getInstance();
        System.out.println("=== Fábrica Honda ===\n");
        String[] modelosHonda = {"City", "Civic", "Fit"};

        for ( String modelo : modelosHonda ){
            IVehicle veiculo = hondaFactory.makeVehicle(modelo);
            if ( veiculo != null){
                veiculo.teste();
            }
            System.out.println();
        }

        System.out.println("=== Fábrica Toyota ===\n");
        VehicleFactory toyotaFactory = Toyota.getInstance();
        String[] modelosToyota = {"Corolla", "Etios", "Hilux"};

        for ( String modelo: modelosToyota ){
            IVehicle veiculo = toyotaFactory.makeVehicle(modelo);
            if ( veiculo != null){
                veiculo.teste();
            }
            System.out.println();
        }
    }
}
