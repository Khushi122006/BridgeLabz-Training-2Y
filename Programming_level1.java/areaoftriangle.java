import java.util.Scanner;
public class areaoftriangle {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("enter height:");
        double h = sc.nextDouble();
        System.out.println("enter base: ");
        double b = sc.nextDouble();

        double area =(1.0/2.0)*b*h;
        System.out.println(area);
        
    }
}
