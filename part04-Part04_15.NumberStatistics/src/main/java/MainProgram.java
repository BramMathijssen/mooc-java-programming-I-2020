
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Statistics statistics = new Statistics();
        Statistics statistics2 = new Statistics();
        Statistics statistics3 = new Statistics();
             
        System.out.println("Enter numbers: ");
        int input = Integer.valueOf(scanner.nextLine());
        
        while(input != -1){
            statistics.addNumber(input);
            
            if(input % 2 == 0){
                statistics2.addNumber(input);
            } else if(input % 2 != 0){
               statistics3.addNumber(input); 
            }
                       
            input = Integer.valueOf(scanner.nextLine());          
        }
        
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Sum of even numbers: " + statistics2.sum());
        System.out.println("Sum of odd numbers: " + statistics3.sum());
    }
}
