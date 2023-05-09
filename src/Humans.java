public abstract class Humans {
    private String firstName;
    private String lastName;
    private String familyStatus;
    private int age;
    public Humans(String firstName, String lastName, String familyStatus, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.familyStatus = familyStatus;
        this.age = age;
    }

    public Humans() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFamilyStatus() {
        return familyStatus;
    }

    public void setFamilyStatus(String familyStatus) {
        this.familyStatus = familyStatus;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Human is family\n" +
                "firstName: " + firstName + "\n" +
                "lastName: " + lastName + "\n" +
                "familyStatus: " + familyStatus + "\n" +
                "age: " + age +"\n";
    }
}
