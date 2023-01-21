package client.view.log;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import client.model.TextConverter;

import java.util.List;

public class LogViewModel {
    private ObservableList<String> logs = FXCollections.observableArrayList();
    private TextConverter textConverterModule;

    public LogViewModel(TextConverter textConverterModule) {
        this.textConverterModule = textConverterModule;
    }


    public void loadLogs(){
        List<String> list = textConverterModule.getLogs();
        list.clear();
        logs.addAll(list);
    }

    public ObservableList<String> getLogList(){
        return logs;
    }
}
