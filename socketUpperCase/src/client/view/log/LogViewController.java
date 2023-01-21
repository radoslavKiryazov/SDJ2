package client.view.log;

import client.core.ViewHandler;
import javafx.scene.control.ListView;

public class LogViewController {


    public ListView<String> listLogView;
    private ViewHandler viewHandler;
    private LogViewModel logViewModel;

    public void innit(ViewHandler viewHandler,LogViewModel logViewModel){
        this.viewHandler = viewHandler;
        this.logViewModel = logViewModel;
        logViewModel.loadLogs();
        listLogView.setItems(logViewModel.getLogList());
    }

    public void onBackButton() {
        viewHandler.openUpperCaseView();
    }

    public void reload() {
        logViewModel.loadLogs();
    }
}
