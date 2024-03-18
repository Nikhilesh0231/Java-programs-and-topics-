package NikhileshProgrmas;
import java.util.Scanner;
public class OddEven
    {
        public static void main(String []args)
        {
            System.out.print("Enter The Number To Check That Entered Number Is Odd Or Even : ");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            if(num % 2 == 0)
            {
                System.out.println("Entered Number Is Even ");
            }
            else
            {
                System.out.println("Entered Number Is Odd ");
            }
            System.out.println("Programmed By Nikhilesh Tiwari!!! ");
        }
    }
