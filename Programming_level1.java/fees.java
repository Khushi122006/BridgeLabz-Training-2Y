import java.util.Scanner;
public class fees {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER FEE: ");
        double fee = sc.nextDouble();
        System.out.println("ENTER DISCOUNT: ");
        double discountPercent = sc.nextDouble();

        double discount = (fee*discountPercent)/100;
        double discounted_fee = fee-discount;


        System.out.println("The discount amount is INR  " + discount + " and the discounted fees is INR " + discounted_fee);
    
    }
    
}
