package FabricanteCelular;

import Celular.*;

public class Apple implements FabricanteCelular{
    private static Apple instance;
    private Apple(){};
    public static FabricanteCelular getInstance(){
        if (instance == null ){
            instance = new Apple();
        }
        return instance;
    }
    @Override
    public Celular constroiCelular(String modelo) {
        if ( modelo.equalsIgnoreCase("IPhoneS")){
            return new IPhoneS();
        }
        if ( modelo.equalsIgnoreCase("IPhoneX")){
            return new IPhoneX();
        }
        return null;
    }
}

