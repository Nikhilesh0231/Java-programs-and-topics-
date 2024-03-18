package NikhileshProgrmas;
import java.util.Scanner;
class fib{
    Scanner sc = new Scanner(System.in);
    int count = sc.nextInt();
    int f1 =0,f2=1,f3;
    void fib(){


        System.out.println(f1+" "+f2);
        for(int i=1;i<=count;i++)
        {
            f3=f1+f2;

        }
        f1=f2;
        f2=f3;
    }
}public class Fibonacci {
    public static void main(String []args){
        fib ff= new fib();
        System.out.println(ff);
    }
}

