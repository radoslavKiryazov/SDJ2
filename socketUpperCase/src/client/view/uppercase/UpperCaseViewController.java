package client.view.uppercase;

import client.core.ViewHandler;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class UpperCaseViewController {

    public TextField inputField;
    public TextField outputField;
    public Button onConvertButton;
    public Label errorLabel;
    private ViewHandler viewHandler;
    private UpperCaseViewModel upperCaseVM;

    public void innit(ViewHandler viewHandler, UpperCaseViewModel upperCaseVM){
     this.viewHandler = viewHandler;
        this.upperCaseVM = upperCaseVM;
        inputField.textProperty().bindBidirectional(upperCaseVM.request());
        outputField.textProperty().bindBidirectional(upperCaseVM.replyProperty());
        errorLabel.textProperty().bind(upperCaseVM.errorProperty());

    }

    public void onConvertButton() {
      upperCaseVM.convert();
    }

    public void onLogButton(ActionEvent actionEvent) {
       viewHandler.openLogView();
    }
}
