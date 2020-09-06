
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count =0;
        int sum = 0;
        double average = 0;
        String highestName= "";
        
        String input = scanner.nextLine();

        
        while(!input.equals("")){           
                                          
            String splitArray[] = input.split(",");
            sum = sum + Integer.valueOf(splitArray[1]);
            count++;
            
            average = (double) sum/count;
                                
            for(int i= 1; i< splitArray.length ; i=+2){
           
                String currentName= splitArray[i-1];
                
                if(currentName.length() > highestName.length()){
                    highestName = currentName;
                }
                                 
            }
            
            input = scanner.nextLine();
                    
        }
        
        System.out.println("Longest name: " + highestName); 
        System.out.println("Average of the birth years: " + average);
              
    }
}
