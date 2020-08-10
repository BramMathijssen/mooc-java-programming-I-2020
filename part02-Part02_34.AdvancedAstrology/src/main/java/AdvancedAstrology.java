
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        int i = 0;
        while(i < number){
            System.out.print("*");
            i++; 
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        int i = 0;
        while (i < number){
            System.out.print(" ");
            i++;
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        int i = size -1;
        int y = 1;
        
        while(i > -1){
            printSpaces(i);
            printStars(y);
            y++;
            i--;
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        int x=0;
        int i=height-1;
        int y=1;
                    
        while(x < height){
            printSpaces(i);
            printStars(y);
            
            i--;
            y= y+2;          
            x++;
            
        }
        
        printSpaces(height-2);
        printStars(3);
        printSpaces(height-2);
        printStars(3);
          
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.


//        printTriangle(4);
        christmasTree(4);
//        System.out.println("---");
//        christmasTree(4);
//        System.out.println("---");
//        christmasTree(10);
    }
}
