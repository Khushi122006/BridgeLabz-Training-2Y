import java.util.Scanner;

public class volumeofcylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER RADIUS:");
        double radius = sc.nextDouble();
        System.out.println("ENETR THE HEIGHT:");
        double height = sc.nextDouble();

        double Volume= Math.PI * radius*radius*height ; 

        System.out.println("THE VOLUME OF CYLINER IS: "+ Volume);
        
    }
    
}
