package LogList;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Log {

    private ArrayList<LogLine> logLines;
    private static Log log;
    private static Object lock = new Object();

    private Log(){
        logLines = new ArrayList<>();
        log = new Log();
    }
    public void addLog(String text){
        LogLine line = new LogLine(text);
        logLines.add(line);
        log.addToFile(line);
        System.out.println(line);
    }
    public ArrayList<LogLine> getAll(){
        return logLines;
    }

     
    public static Log getLog(){
        if (log==null){
            synchronized (lock){
                if(log == null){
                    log = new Log();
                }
            }
        }
        return log;
    }

    @Override
    public String toString() {
        return "Log{" +
                "logLines=" + logLines +
                '}';
    }
    private void addToFile(LogLine log){
        if (log == null){
            return;
        }
        BufferedWriter out  = null;
        try{
            String fileName = "Log- "+log.getDateTime().getSortableDate()+ ". txt";
            out = new BufferedWriter(new FileWriter(fileName,true));
            out.write(log +"\n");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
