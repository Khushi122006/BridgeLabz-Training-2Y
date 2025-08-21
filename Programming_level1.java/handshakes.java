import java.util.Scanner; 
public class handshakes {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int N = sc.nextInt();

        int handshakess = N * (N - 1) / 2;

        System.out.println("The maximum number of handshakes among " + N + " students is " + handshakess);
    }
    
}
