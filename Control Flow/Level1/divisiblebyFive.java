import java.util.Scanner ; 
public class divisiblebyFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("enter the number: ");
        double num = sc.nextDouble();

        if(num%5==0)
        System.out.println("divisible by five!");

        else
        System.out.println("not divisible by five!");

    }
    
}
