package core;

import model.Radiator;
import model.RadiatorState;

public class ModelFactory {
    private RadiatorState radiator;

    public RadiatorState getRadiatorStateModel(){
        if(radiator == null){
            radiator= new Radiator();
        }
        return radiator;

    }
}
