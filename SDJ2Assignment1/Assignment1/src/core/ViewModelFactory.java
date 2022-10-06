package core;

import view.radiator.RadiatorViewModel;

public class ViewModelFactory {
    private ModelFactory mf;

    public ViewModelFactory(ModelFactory mf){
        this.mf =mf;
    }
    public RadiatorViewModel getRadiatorVM(){
        return new RadiatorViewModel(mf.getRadiatorStateModel());
    }
}
