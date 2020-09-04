
import java.util.ArrayList;
import java.util.Scanner;

public class SumOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                int total = calculateSum(list);
                System.out.println(total);
                break;
            }

            list.add(input);
        }

        System.out.println("");

        // toteuta listan lukujen summan laskeminen tänne
    }
    
    public static int calculateSum(ArrayList<Integer> list){
        int sum = 0;
        
        for(Integer i : list){
            sum = sum + i;          
        }
        return sum;         
    }
}
