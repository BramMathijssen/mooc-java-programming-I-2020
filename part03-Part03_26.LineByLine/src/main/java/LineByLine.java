
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] split ;
        
        
        while(true){         
            String input = scanner.nextLine();
            
            split = input.split(" ");
            
            for(int i=0; i<split.length; i++){
                System.out.println(split[i]);
            }
            
            if(input.equals("")){
                break;
            }
        }
        
    }
}
