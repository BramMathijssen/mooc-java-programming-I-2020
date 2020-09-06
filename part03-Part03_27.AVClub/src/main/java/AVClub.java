
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] splitArray;
        
        while(true){
            String input = scanner.nextLine();
            splitArray = input.split(" ");
            
            for(int i=0; i<splitArray.length; i++){
                if(splitArray[i].contains("av")){
                    System.out.println(splitArray[i]);
                }
            }
            
            if(input.equals("")){
                break;
            }    
        }
    }
}
