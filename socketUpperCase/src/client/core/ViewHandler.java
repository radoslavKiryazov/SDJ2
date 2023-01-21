package client.core;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import client.view.log.LogViewController;
import client.view.uppercase.UpperCaseViewController;

import java.io.IOException;

public class ViewHandler {

    private Scene upperCaseScene;
    private Stage stage;
    private ViewModelFactory vmf;
    private Scene logScene;
    private LogViewController logViewController;

    public ViewHandler(ViewModelFactory vmf){
        this.vmf = vmf;
        stage = new Stage();
    }

    public void start(){
        openUpperCaseView();
        stage.show();
    }
    public void openUpperCaseView(){
        if(upperCaseScene==null) {
            try {
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("../client.view/uppercase/UpperCaseView.fxml"));
                Parent root = loader.load();

                UpperCaseViewController viewController = loader.getController();
                viewController.innit(this, vmf.getUpperCaseVM());

                upperCaseScene = new Scene(root);

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        stage.setScene(upperCaseScene);
        stage.setTitle("UpperCaseConverter");
    }
    public void openLogView(){
        if(logScene == null) {
            try {
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("../client.view/log/LogView.fxml"));
                Parent root = loader.load();

                logViewController = loader.getController();
                logViewController.innit(this, vmf.getLogViewModel());
                logScene = new Scene(root);

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

            logViewController.reload();
            stage.setScene(logScene);
            stage.setTitle("Logs");
    }

}
