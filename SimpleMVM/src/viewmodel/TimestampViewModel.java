package viewmodel;

import model.DataModel;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class TimestampViewModel {

    private StringProperty updateTimeStamp;
    private StringProperty numberofUpdates;

    private DataModel model;

    public TimestampViewModel(DataModel model) {
        this.model = model;
        updateTimeStamp = new SimpleStringProperty("Last update: ");
    }

    public void updateTimestamp() {
        updateTimeStamp.setValue("Last updated: " + model.getLastUpdateTimeStamp());
    }


    public StringProperty updateTimeStampProperty() {
        return updateTimeStamp;
    }
}
