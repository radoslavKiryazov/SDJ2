package TreeSet;

public class main {
    public static void main(String[] args) {
        Comparator comparator = new AgeComparator();
        TreeSet treeSet = new TreeSet(comparator);
        Person p1 = new Person("PEPE","PEPE",2);
    }
}
