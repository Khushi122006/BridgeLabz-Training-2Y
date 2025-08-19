import java.util.Scanner;
public class perimeterofrectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length:");
        double l = sc.nextInt();
        System.out.println("enter breadth:");
        double b = sc.nextInt();
        
        double p = 2*(l+b);

        System.out.println("the perimeter is : " + p);

    }
    
}
