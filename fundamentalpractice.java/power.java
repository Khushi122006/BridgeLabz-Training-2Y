import java.util.Scanner;
public class power {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the base:");
        double b = sc.nextDouble();
        System.out.println("enter the exponent:");
        double e = sc.nextDouble();

        double p= Math.pow(b,e);
        System.out.println("the value is:" + p );

    }

    
}
