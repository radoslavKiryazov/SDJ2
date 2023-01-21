package TreeSet;

public class AgeComparator implements Comparator {
    @Override
    public int compare(Person person1, Person person2) {
        if(person1.getAge() == person2.getAge()){
            return 0;
        } else if(person1.getAge() > person2.getAge()){
            return 1;
        } return 0;
    }
}
