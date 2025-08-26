
import java.util.Scanner;

public class naturalnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number: ");
        int n = sc.nextInt();

        if(n>0){
           int Sum =(n*(n+1))/2;
           System.out.println("the sum of natural numbers is =" + Sum);
        }
        else{
            System.out.println("the number is not natural number .");
        }
    }
    
}

