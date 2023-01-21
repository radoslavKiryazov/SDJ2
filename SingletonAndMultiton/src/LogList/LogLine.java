package LogList;

public class LogLine {
    private String text;
    private DateTime dt;

    public LogLine(String text){
        this.text=text;
        dt = new DateTime();
    }

    public String getText() {
        return text;
    }

    public DateTime getDateTime(){
        return dt;
    }

    @Override
    public String toString() {
        return "LogLine{" +
                "text='" + text + '\'' +
                ", dt=" + dt +
                '}';
    }
}
