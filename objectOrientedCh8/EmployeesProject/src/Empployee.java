public class Empployee {
    private String name;
    private String lastName;
    private int id;

    public Empployee(String name, String lastName, int id) {
        this.name = name;
        this.lastName = lastName;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void showInformation(){
        System.out.println("*** Employee Information ***");
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Lastname: " + lastName);
        System.out.println("Employee ID: " + id);
    }

}
