package client.core;

import client.view.log.LogViewModel;
import client.view.uppercase.UpperCaseViewModel;

public class ViewModelFactory {
    private final ModelFactory mf;

    public ViewModelFactory(ModelFactory mf) {
        this.mf = mf;
    }

    public UpperCaseViewModel getUpperCaseVM(){
        return new UpperCaseViewModel(mf.getTextConverterModule());
    }

    public LogViewModel getLogViewModel() {
        return new LogViewModel(mf.getTextConverterModule());
    }
}
