
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int currentNumber =0;
        int highestNumber =0;
        
        String input = scanner.nextLine();

        
        while(!input.equals("")){           
                                          
            String splitArray[] = input.split(",");
                           
            for(int i= 1; i< splitArray.length ; i=+2){
           
                currentNumber= Integer.valueOf(splitArray[i]);
                
                if(currentNumber > highestNumber){
                    highestNumber = currentNumber;
                }
                                 
            }
            
            input = scanner.nextLine();
                    
        }
        
        System.out.println("Age of the oldest: " + highestNumber); 
              
    }
}
