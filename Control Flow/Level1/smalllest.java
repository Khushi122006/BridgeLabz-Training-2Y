import java.util.Scanner ; 
public class smalllest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter num1: ");
        int num1 = sc.nextInt();

         System.out.println("enter num2: ");
        int num2 = sc.nextInt();

         System.out.println("enter num3: ");
        int num3 = sc.nextInt();

        if(num1<num2 && num1<num3){
            System.out.println("Yes, it is the smallest of all the three numbers. ");
        }
        else{
            System.out.println("No, it is not the  smallest of the three numbers.");
        }


            
        }
    }
    

