package util;

import java.io.Serializable;

public class Message implements Serializable {
    private String messageBody;

    public Message(String messageBody){
        this.messageBody = messageBody;
    }
    public String getMessageBody(){
        return messageBody;
    }
    public void setMessageBody(String str){
        str = messageBody;
    }

    @Override
    public String toString() {
        return "Message{" +
                "messageBody='" + getMessageBody() + '\'' +
                '}';
    }
}
