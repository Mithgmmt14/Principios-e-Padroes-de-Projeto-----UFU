package FabricanteCelular;

import Celular.*;

public class Samsung implements FabricanteCelular{
    private static Samsung instance;
    private Samsung(){};
    public static FabricanteCelular getInstance(){
        if (instance == null ){
            instance = new Samsung();
        }
        return instance;
    }
    @Override
    public Celular constroiCelular(String modelo) {
        if ( modelo.equalsIgnoreCase("Galaxy8")){
            return new Galaxy8();
        }
        if ( modelo.equalsIgnoreCase("Galaxy20")){
            return new Galaxy20();
        }
        return null;
    }
}
