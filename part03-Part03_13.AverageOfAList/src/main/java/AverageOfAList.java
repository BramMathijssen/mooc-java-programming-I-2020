
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.
        ArrayList<Integer> list = new ArrayList<>();
        
        while(true){
            int input = Integer.valueOf(scanner.nextLine());
            
            if(input == -1){
                double average = calculateAverage(list);
                System.out.println(average);
                break;
            }
            
            list.add(input);
            
            
        }
        
    }
    
    public static double calculateAverage(ArrayList<Integer> list){
        int sum = 0;
        double average = 0;
        int amount = list.size();
        
        for(int number : list){
            sum = sum + number; 
        }
        
        average = (double)sum / amount;
        
        return average;
    }
}
