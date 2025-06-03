import java.util.Scanner;

public class Login {
    public boolean login(Hesap hesap){
        Scanner scanner = new Scanner(System.in);
        String userName;
        String password;

        System.out.println("Type UserName: ");
        userName = scanner.nextLine();
        System.out.println("Type password: ");
        password = scanner.nextLine();

        if (hesap.getUserName().equals(userName) && hesap.getPassword().equals(password)){
            return true;
        }
        return false;

    }
}
