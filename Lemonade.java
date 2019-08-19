import java.util.Scanner;
public class Lemonade{

     public static void main(String []args){
         
        Scanner Lemonade = new Scanner (System.in);
        
        System.out.println("Welcome to Pris's Lemonade Stand. What would you like to drink?");
        int number = Lemonade.nextInt();
        
        double cost = 4.5;
        double total = cost * number;
        
        if (total < 0) {
            System.out.println("Sorry we are out of service.");
        } else {
            System.out.printf("\nYour total is $%.2f", total);
            
        }
        
        
        
     }
}
