import java.util.Scanner;
public class simpleintrest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER PRINCIPLE:");
        double p = sc.nextDouble();
        System.out.println("ENTER TIME:");
        double t = sc.nextDouble();
        System.out.println("ENTER RATE:");
        double r = sc.nextDouble();

        double simple_interest = ((p*r*t)/100);
        System.out.println("S.I. IS = "+ simple_interest);

    }
    
}
