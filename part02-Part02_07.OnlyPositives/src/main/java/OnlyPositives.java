
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            System.out.println("Give a number: ");
            int number = Integer.valueOf(scanner.nextLine());
            
            if(number > 0 ){
                int power = number * number;
                System.out.println(power);
            } else if (number < 0 ){
                System.out.println("Unsuitable number");      
            } else if (number == 0){
                break;
            }
        }

    }
}
