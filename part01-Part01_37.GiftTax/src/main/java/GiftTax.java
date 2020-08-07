
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Value of the gift?");
        int giftPrice = Integer.valueOf(scan.nextLine());
        
        if ( giftPrice < 5000){
            System.out.println("No tax!");
        } else if( giftPrice >= 5000 && giftPrice <25000){
            System.out.println((100 +(giftPrice - 5000)* 0.08));
        } else if( giftPrice >= 25000 && giftPrice <55000){
            System.out.println((1700 +(giftPrice - 25000)* 0.1));
        } else if( giftPrice >= 55000 && giftPrice <200000){
            System.out.println((4700 +(giftPrice - 55000)* 0.12));
        } else if( giftPrice >= 200000 && giftPrice <1000000){
            System.out.println((22100 +(giftPrice - 200000)* 0.15));
        } else if( giftPrice >= 1000000){
            System.out.println((142100 +(giftPrice - 1000000)* 0.17));
        }
        
             
    }
}
