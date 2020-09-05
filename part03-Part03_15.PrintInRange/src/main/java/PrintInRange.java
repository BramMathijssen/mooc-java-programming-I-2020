
import java.util.ArrayList;

public class PrintInRange {

    public static void main(String[] args) {
        // Try your method here
        ArrayList<Integer> numbersList = new ArrayList<>();
        numbersList.add(3);
        numbersList.add(2);
        numbersList.add(6);
        numbersList.add(-1);
        numbersList.add(5);
        numbersList.add(1);

        System.out.println("The numbers in the range [0, 5]");
        printNumbersInRange(numbersList, 0, 5);

        System.out.println("The numbers in the range [3, 10]");
        printNumbersInRange(numbersList, 3, 10);
    }
    
    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit){
        for(Integer number: numbers){
            if(number >= lowerLimit && number <= upperLimit ){
                System.out.println(number);
            }

        }
        
        
    }
    
}
