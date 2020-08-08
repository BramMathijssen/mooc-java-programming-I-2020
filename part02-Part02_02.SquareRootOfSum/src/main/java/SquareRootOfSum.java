
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int input = Integer.valueOf(scanner.nextLine());
        int input2 = Integer.valueOf(scanner.nextLine());
        
        int total = input + input2;
        
        double squareRoot = Math.sqrt(total);
        
        System.out.println(squareRoot);

    }
}
