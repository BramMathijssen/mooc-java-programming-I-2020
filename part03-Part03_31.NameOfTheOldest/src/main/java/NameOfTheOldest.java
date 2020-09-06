
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int currentNumber =0;
        int highestNumber =0;
        String name= "";
        
        String input = scanner.nextLine();

        
        while(!input.equals("")){           
                                          
            String splitArray[] = input.split(",");
                           
            for(int i= 1; i< splitArray.length ; i=+2){
           
                currentNumber= Integer.valueOf(splitArray[i]);
                
                
                if(currentNumber > highestNumber){
                    highestNumber = currentNumber;
                    name = splitArray[i-1];
                }
                                 
            }
            
            input = scanner.nextLine();
                    
        }
        
        System.out.println("Name of the oldest: " + name); 
              
    }
}
