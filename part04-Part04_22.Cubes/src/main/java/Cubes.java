
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String input = scanner.nextLine();
        
        while(!input.equals("end")){
            int cube = 0;
            int number = Integer.valueOf(input);
            
            cube = number * number * number;
            
            System.out.println(cube);
            
            input = scanner.nextLine();
        }

    }
}
