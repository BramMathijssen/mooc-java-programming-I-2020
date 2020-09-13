
import java.util.ArrayList;
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<String> list = new ArrayList<>();
        
        String input = scanner.nextLine();
        
        while(!input.equals("end")){           
            list.add(input);   
            
            input = scanner.nextLine();
        }
        System.out.println(list.size());

    }
}
