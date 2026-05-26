import FabricanteCelular.*;
import Celular.*;
public class Main {
    public static void main(String[] args) {
        FabricanteCelular apple = Apple.getInstance();
        FabricanteCelular samsung = Samsung.getInstance();

        System.out.println("=== SAMSUNG === \n");
        String[] celularesSamsung = {"Galaxy8", "Galaxy20"};
        for ( String celular : celularesSamsung){
            Celular celularteste = samsung.constroiCelular( celular );
            if ( celularteste != null ){
                celularteste.teste();
            }
            System.out.println();
        }

        System.out.println("=== APPLE === \n");
        String[] celularesApple = {"IPhoneS", "IPhoneX"};
        for ( String celular : celularesApple){
            Celular celularteste = apple.constroiCelular( celular );
            if ( celularteste != null ){
                celularteste.teste();
            }
            System.out.println();
        }

    }
}

