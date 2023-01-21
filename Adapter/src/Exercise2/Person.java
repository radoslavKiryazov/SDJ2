package Exercise2;

public class Person {
    private String name;
    private String dateOfBirth;
    private int socialSecurityNumber;

    public Person(String name,String dob,int socialSecurityNumber) {
        this.name = name;
        this.dateOfBirth = dob;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public int getSocialSecurityNumber() {
        return socialSecurityNumber;
    }
}
