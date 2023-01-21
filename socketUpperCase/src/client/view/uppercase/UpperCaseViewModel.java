package client.view.uppercase;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import client.model.TextConverter;

public class UpperCaseViewModel {
    private StringProperty request = new SimpleStringProperty();
    private StringProperty reply = new SimpleStringProperty();
    private StringProperty error = new SimpleStringProperty();

    private TextConverter textConverterModel;

    public UpperCaseViewModel(TextConverter textConverterModule) {
        this.textConverterModel = textConverterModule;
    }

    public void convert() {

        String requestValue = request.getValue();
        if (requestValue == null || "".equals(requestValue)){
            error.set("Input Field Cannot Be Empty");
            return;
        }
        String uppercased = textConverterModel.toUpperCase(requestValue);
        request.set("");
        reply.setValue(uppercased);
        error.setValue("");

    }

    public StringProperty request() {
        return request;
    }

    public StringProperty replyProperty() {
        return reply;
    }

    public StringProperty errorProperty() {
        return error;
    }
}
