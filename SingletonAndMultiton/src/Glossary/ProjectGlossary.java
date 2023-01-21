package Glossary;

import java.util.ArrayList;
import java.util.List;

public class ProjectGlossary {
    private List<GlossaryItem> itemList;

    public ProjectGlossary(){
        itemList = new ArrayList<>();
    }
    public int size(){
        return itemList.size();
    }
    public GlossaryItem[] getAll(){
        return itemList.toArray(new GlossaryItem[itemList.size()]);
    }
    public String getDefinition(String definiton){
        for (GlossaryItem item:
             itemList) {
            if(item.getDefinition().equals(definiton))
                return item.getDefinition();
        }
        return null;
    }
    public void addItem(String phrase,String definition){
        GlossaryItem temp = new GlossaryItem(phrase,definition);
        for (GlossaryItem item:
             itemList) {
            if(item.equals(temp)){
                throw new IllegalStateException();
            } else{
                itemList.add(temp);
            }
        }
    }
    public void removeItem(String phrase){
        itemList.removeIf(item -> item.getPhrase().equals(phrase));
    }

    @Override
    public String toString() {
        return "ProjectGlossary{" +
                "itemList=" + itemList +
                '}';
    }
}
