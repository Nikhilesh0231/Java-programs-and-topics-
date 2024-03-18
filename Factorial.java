package NikhileshProgrmas;
import java.util.Scanner;
public class Factorial {
        public static void main(String []args)
        {
            System.out.println("Enter The Number To Find The Factorial : ");
            int fact=1;
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            for(int i = x;i>=1;i--)
            {
                fact = fact*i;
            }
            System.out.println(fact);
            System.out.println("Nikhilesh Tiwari!!!");
        }
    }
