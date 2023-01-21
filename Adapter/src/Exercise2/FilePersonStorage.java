package Exercise2;

import java.util.ArrayList;
import java.util.List;

public class FilePersonStorage implements PersonStorage {
private List<Person> people;

    public FilePersonStorage() {
        people = new ArrayList<>();

    }

    @Override
    public void addPerson(Person person) {
        people.add(person);

    }

    @Override
    public Person getPerson(int ssn) {
        for (Person person : people) {
            if(person.getSocialSecurityNumber()==ssn){
                return person;
            }
        }
        return null;
    }
}
