import java.util.Scanner;
public class addnumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("ENTER THE FIRST NO: ");
        float a = sc.nextFloat();

        System.out.println("ENTER THE SECOND NO: ");
        float b = sc.nextFloat();

        float sum = a+b;
        System.out.println("THE SUM OF THE TWO NUMBERS IS: " + sum);     
         
    }
    
}
