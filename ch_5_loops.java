import java.util.Scanner;
public class ch_5_loops {
    public static void main(String[] args) {
        //while loop


       /*int i=1;
        while (i<=10) {
            System.out.println(i);
            i++;
        }*/


        // question: write a program to print 100 to 200
        //    int i=100;
        //  while(i<=200)//In while loop first the condition is checked after that loop will execute.Or checks the codition then execute the code.
        //  {
        //    System.out.print(i);
        //  System.out.print(",");
        // i++;
        //     }


        // Do while loop
        //  int b=0;
        //do{
        //  System.out.println(b);   // In do while loop firstly loop is executed after that condition will checked.OR Execute the code then checks the condition.
        //   b++;
        // }while(b<5);


        //QUESTION:WRITE A PROGRAM TO PRINT 'N' NATURAL NUMBERS.

        //  System.out.println("Enter The Natural Numbers Till Where You Want To Print The Numbers:");
        //   Scanner sc=new Scanner(System.in);
        //   int b = sc.nextInt();
        //   int a=0;
        //   do{
        //       System.out.print(a);
        //       System.out.print(",");
        //       a++;
        //   }
        //   while(a<=b);


        //FOR LOOP
     /*   for(int i=1;i<=15;i++)      //printing numbers in increasing order
        {
            System.out.print(i);
            System.out.print(",");
        }
        System.out.println();//using it to just change the line
        for (int i=20;i>=1;i--)//printing numbers in decreasing order
        {
            System.out.print(i);
            System.out.print(",");
        }*/

        //Question:write a program to print 'n' natural odd numbers.

     /*   System.out.println("Enter The Natural Numbers Till Where You Want To Print The Odd Natural Numbers:");
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=0;2*i+1<n;i++)//Increment for loop
        {
            System.out.print(2*i+1);
            System.out.print(",");
        } */



     /*   for(int i=10;i>=1;i--)     //Decrement for loop
        {
            System.out.println(i);
        }*/


        //QUESTION : Write A program to print first 'n' natural numbers in reverse order.

       /* System.out.println("Enter The Natural Numbers Till Where You Want To Print The Numbers In Reverse Order:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        do
        {
            System.out.print(n);
            System.out.println(",");
            n--;
        }while(n>=0);*/

        //Question :Print Star Triangle


      /*  System.out.println("Enter The Numbers Of rows want to print:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(" *");
            }
            System.out.println();
        }*/



        //program for breaking the loop
     /*   int i;
        for(i=1;i<=10;i++)
        {
            System.out.println("Great day");

            if (i == 5)
            {
                System.out.println("Ending the loop");
                break;
            }
        }*/


//program for continue

   /* int i;
    for(i=1;i<=20;i++)
    {
        if(i==5)
        {
            System.out.println("Ending te loop");
            continue;
        }
        System.out.println(i);
        System.out.println("Great work");
    }*/



    }
}

