package TreeSet;

public class LastNameComparator implements Comparator{
    @Override
    public int compare(Person person1, Person person2) {
        char p1 = person1.getLastName().charAt(0);
        char p2 = person2.getLastName().charAt(0);
        if(p1 == p2)
            return 0;
        else if(p1>p2) {
            return 1;
        } else{
            return -1;
        }
    }
}
