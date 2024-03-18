package NikhileshProgrmas;
import java.util.Scanner;
public class Table {
        public static void main(String []args)
        {
            System.out.print("Enter The Number Whose Table Multiplication You Want");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            for(int i =1 ; i <= 10 ; i++){
                System.out.printf("%d X %d =%d\n",num,i, num*i);
            }
            System.out.println("Nikhilesh Tiwari");
        }
    }
