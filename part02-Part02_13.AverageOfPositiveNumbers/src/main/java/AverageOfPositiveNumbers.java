
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double average = 0;
        double sum = 0;
        int count = 0;
        String result;
        
        while(true){
            int input = Integer.valueOf(scanner.nextLine());
                                            
            if( input > 0 ){
                sum = sum + input;
                count++;
                continue;
            }
            if ( input < 0 ){
                continue;
            }
            if ( input == 0){
                if( sum == 0){
                    result = "Cannot calculate the average"; 
                    break;
                } else{
                    average = sum / count;
                    result = String.valueOf(average);
                    break;              
                }               
            }           
        }
        
        System.out.println(result);
                       
    }
}
