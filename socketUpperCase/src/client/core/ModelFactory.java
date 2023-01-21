package client.core;

import client.model.TextConverter;
import client.model.TextConverterModel;

public class ModelFactory {
    private TextConverter textConverter;


    public TextConverter getTextConverterModule() {
        if(textConverter == null){
            textConverter = new TextConverterModel();
        }
        return textConverter;
    }
}
