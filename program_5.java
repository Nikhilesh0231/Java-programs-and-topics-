package NikhileshProgrmas;
import java.util.Scanner;
public class program_5 {
    int factorial(int n){
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
    public static void main (String args[]){
        System.out.println("Enter a Number : ");
        Scanner sc =new Scanner(System.in);
        int x = sc.nextInt();
         program_5 f1 = new program_5();
         System.out.println("The Factorial Of The Number Is :  " + f1.factorial(x));
    }
}
