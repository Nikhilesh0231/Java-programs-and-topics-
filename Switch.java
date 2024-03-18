import java.util.Scanner;
public class Switch {
    public static void main(String args[])
    {
       int age;
       System.out.println("Enter your age:");
       Scanner sc=new Scanner(System.in);
       age=sc.nextInt();
       switch(age)
       {
           case 18:
               System.out.println("You Are Going To Be An Adult !");
               break;
           case 23:
               System.out.println("You Are Going To Join A Job !");
               break;
           case 60:
               System.out.println("You Are Going To Retired !");
               break;
           default:
               System.out.println("ENJOY YOUR LIFE AND BE HAPPY!");
       }
        System.out.println("Thank You For Using My Java Program!");

    }
}
