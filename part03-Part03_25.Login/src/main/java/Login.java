
import java.util.ArrayList;
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String username1 = "alex";
        String password1 = "sunshine";
        String username2 = "emma";
        String password2 = "haskell";
        boolean loggedIn = false;
        
        System.out.println("Enter username: ");
        String inputUsername = scanner.nextLine();
        
        System.out.println("Enter password: ");
        String inputPassword = scanner.nextLine();
        
        if(inputUsername.equals(username1) && inputPassword.equals(password1)){
            System.out.println("You have succesfully logged in!");
            loggedIn = true;
        } else if(inputUsername.equals(username2) && inputPassword.equals(password2)){
            System.out.println("You have succesfully logged in!");
            loggedIn = true;
        } else if(!loggedIn){
            System.out.println("Incorrect username or password!");
        }
        
        

    }
}
