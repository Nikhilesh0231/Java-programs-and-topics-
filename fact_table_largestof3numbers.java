import  java.util.Scanner;
public class fact_table_largestof3numbers {
   public static void main(String[] args) {

       //factorial program
    /*    Scanner sc=new Scanner(System.in);
        System.out.print("Enter The Number :");
        int a=sc.nextInt();
        int fact=1;
        for (int i=1;i<=a;i++)
        {
            fact=fact*i;
        }
        System.out.print("The Factorial Of The Given Number Is :");
        System.out.print(fact);*/

       //table program

   /*  System.out.print("Enter The Number Of Which Table You Want To Print:");
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
        for(int i=1;i<=10;i++)
    {
        System.out.printf("%d * %d =%d\n",n,i, n*i );
    }
*/
       //largest of three number
       int p=0;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter The Size Of Array");
       int x =sc.nextInt();
       int a[]=new int[x];
       System.out.println("Enter Values in Array");
       for (int i=0;i<x;i++)
       {
           a[i]=sc.nextInt();
       }
       System.out.println("Elements In Array :");
       for (int i=0;i<x;i++)
       {
           System.out.println(a[i]);
       }
       for (int i=0;i<x;i++)
       {
           if (a[i]>p)
               p=a[i];
       }
       System.out.println("Largest Element In Array Is:"+p);
       int t=a[0];
       for (int i=0;i<x;i++)
       {
           if (a[i]<t)
               t=a[i];
       }
       System.out.println("Smallest Element In Array Is:"+t);
    }
}
