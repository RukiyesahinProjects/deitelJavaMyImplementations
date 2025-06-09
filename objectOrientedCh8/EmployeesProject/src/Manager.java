import javax.crypto.spec.PSource;

public class Manager extends Empployee{
    private int numberOfEmployee;

    public Manager(String name, String lastName, int id, int numberOfEmployee) {
        super(name, lastName, id);
        this.numberOfEmployee = numberOfEmployee;
    }

    @Override
    public void showInformation() {
        super.showInformation();
        System.out.println("Number of people for whom the manager is responsible: " + numberOfEmployee);
    }
    public void giveRaise(int amount){
        System.out.println("The manager increased the salaries: "+ amount);
    }
}
