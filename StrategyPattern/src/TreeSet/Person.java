package TreeSet;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName,String lastName,int age){
        this.age = age;
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        return firstName+" "+lastName+" "+age;
    }
}
