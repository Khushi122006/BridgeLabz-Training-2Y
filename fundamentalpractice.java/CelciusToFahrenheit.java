import java.util.Scanner;
public class CelciusToFahrenheit{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE TEMPERATURE :");
        float Celsius = sc.nextFloat();

        float Fahrenheit = (Celsius * 9/5) + 32;

        System.out.println("THE TEMPERATURE IN FAHRENHEIT IS: " + Fahrenheit);

    }
}
