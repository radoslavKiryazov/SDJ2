package core;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import view.radiator.RadiatorController;
import view.thermometer.ThermometerController;

import java.io.IOException;

public class ViewHandler {
    private Scene radiatorScene;
    private Scene thermometerScene;
    private Stage stage;
    private ViewModelFactory vmf;


    public ViewHandler(ViewModelFactory vmf) {
        this.vmf = vmf;
        stage = new Stage();
    }

    public void start() {
        openRadiatorView();
        stage.show();
    }

    public void openRadiatorView() {
            try {
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("../view/radiator/Radiator.fxml"));
                Parent root = loader.load();

                RadiatorController radiatorController = loader.getController();
                radiatorController.innit(this, vmf.getRadiatorVM());

                radiatorScene = new Scene(root);
            } catch (IOException e) {
                e.printStackTrace();
            }
        stage.setScene(radiatorScene);
        stage.setTitle("Radiator");
    }
    public void openThermometersView(){
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("../view/thermometer/Thermometer.fxml"));
            Parent root = loader.load();

            ThermometerController thermometerController = loader.getController();
            thermometerController.innit(this);

            thermometerScene = new Scene(root);
        } catch (IOException e) {
            e.printStackTrace();
        }
        stage.setScene(thermometerScene);
        stage.setTitle("Thermometers");
    }
}
