public abstract class Employee {
    private String firstName;
    private String lastName;
    private String ssNumber;

    public Employee(String firstName, String lastName, String ssNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssNumber = ssNumber;
    }

    public Employee() {
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

    public String getSsNumber() {
        return ssNumber;
    }

    public void setSsNumber(String ssNumber) {
        this.ssNumber = ssNumber;
    }

    // Abstract method must be implemented in subclass
    public abstract double earnings();

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", ssNumber='" + ssNumber + '\'' +
                '}';
    }
}
