import java.util.Scanner; 
public class KmtoMile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter distance:");
        double km = sc.nextDouble();

        double  m = km/1.6;

        System.out.println("the total miles is " + m + " miles for " + km + "km.");

        
    }
    
}
