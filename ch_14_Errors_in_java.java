package OOPs;
import java.util.Scanner;

public class ch_14_Errors_in_java {
    public static void main(String[] args) {
        //Syntax Error

       // int a=5 // if we terminate the line with semicolon then it shows an error wic is called as syntax error
       // System.out.println(a+b);//it also shows an error because we are not declare b anywhere so it is also called as syntax error

        //Logical Error

        //   Write a java Program to print all prime number between 1 to 10;
        System.out.println(2);
        for (int i =1;i<5;i++)
        {
            System.out.println(2*i+1);//Inthis case firestly it prints 2 and after that using for loop it prints 3,5,7,9 but 8 9 is not prime
                                           //so this type of error is logical error or a bug.
            }

        //RUNTIME ERROR OR EXCEPTIONAL ERROR
        int k;
        Scanner sc = new Scanner(System.in);
        k= sc.nextInt();
        System.out.println("Integer Part Of 1000 Divided By K Is : "+ 1000/k);
        // in this case if at run time if be enter 0 then it throws an error because it is defined in java this type of error is called as runtime error
    }
}
