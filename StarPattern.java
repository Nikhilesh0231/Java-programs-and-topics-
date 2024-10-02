package NikhileshNew;
import java.util.Scanner;
public class StarPattern {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height of the pattern : ");
        int count = sc.nextInt();
        System.out.println("First Pattern");
        for(int i = 1; i <= count ; i++){
            for(int j =i ;j<=count;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Second Pattern");
        for(int i =1;i<=count;i++){
            for(int j =1 ; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
   }
}
