
import java.util.ArrayList;
import java.util.Scanner;

public class FirstAndLast {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                String firstName = list.get(0);
                String lastName = list.get(list.size()-1);
                System.out.println(firstName);
                System.out.println(lastName);
                break;
            }

            list.add(input);
        }

    }
}
