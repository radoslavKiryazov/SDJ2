
import core.ModelFactory;
import core.ViewHandler;
import core.ViewModelFactory;
import javafx.application.Application;
import javafx.stage.Stage;
import model.Radiator;
import model.RadiatorState;

public class RadiatorApp extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        RadiatorState r = new Radiator();
        ModelFactory mf = new ModelFactory();
        ViewModelFactory vmf = new ViewModelFactory(mf);
        ViewHandler viewHandler = new ViewHandler(vmf);
        viewHandler.start();
    }

//    private void runAutoUpdate(Radiator r){
//        Thread thread = new Thread(()->{
//           while(true){
//               r.turnDown(r);
//           }
//        });
//        thread.setDaemon(true);
//        thread.start();
//    }
}
