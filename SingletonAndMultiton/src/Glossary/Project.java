package Glossary;

public class Project {
    private String name;
    private ProjectGlossary glossary;

    public Project(String name){
        this.name=name;
        glossary = new ProjectGlossary();
    }

    public String getName() {
        return name;
    }

    public ProjectGlossary getGlossary() {
        return glossary;
    }
    public String getDefinition(String definition){
      return glossary.getDefinition(definition);
    }
    public void addGlossaryItem(String phrase,String description){
        glossary.addItem(phrase,description);
    }
    public void removeGlossaryItem(String phrase){
        glossary.removeItem(phrase);
    }

    @Override
    public String toString() {
        return "Project{" +
                "name='" + name + '\'' +
                ", glossary=" + glossary +
                '}';
    }
}
