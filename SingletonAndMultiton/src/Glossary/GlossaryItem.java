package Glossary;

public class GlossaryItem {
    private String phrase;
    private String definition;

    public GlossaryItem(String phrase,String definition){
        this.definition = definition;
        this.phrase = phrase;
    }
    public String getPhrase(){
        return phrase;
    }
    public String getDefinition(){
        return definition;
    }
    public void setDefinition(String definition){
        this.definition=definition;
    }

    @Override
    public String toString() {
        return "Glossary.GlossaryItem{" +
                "phrase='" + phrase + '\'' +
                ", definition='" + definition + '\'' +
                '}';
    }
}

