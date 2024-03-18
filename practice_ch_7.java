public class practice_ch_7 {
    //Java Method To Print Multiplication Table Of n Number
  /*  static void multiplication(int n){
        for (int i=1;i<=10;i++){
            System.out.format("%d X %d = %d\n",n,i,n*i);
        }
    }*/
    //Java Method To Print Following Pattern

    /* static void patter1(int n)
     {
         for (int i=1;i<n;i++)
         {
             for (int j=1;j<i;j++)
             {
                 System.out.print("*");
             }
             System.out.println();
         }
     }*/

    //Recursive Function To Calculate Sum Of First n Natural Number
  /*  static int sumrect(int n){
        if (n==1)
        {
            return 1;
        }
        return n + sumrect(n-1);
    }*/

    //Write A Java Method To Print Following Pattern*****
//                                                  ***

   /* static void pattern2(int n){
        for (int i=n;i>0;i--){
            for (int j=i;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }*/
    //Write a function to print nth term of  fibonacci series using Recursion-0 ,1,1,2,3,5,8,13,21,34
   /* static int fib(int n)
    {
       if (n==1)
        {
            return 0;
        } else if (n==2)
        {
         return 1;
        }
       if (n==1||n==2)// we can write upper two condition like this
        {
            return n-1;
        }
        else
        {
            return fib(n-1)+fib(n-2);
        }
    }*/
        //Java Method To Print Following Pattern *
        //                                       ** like this using recursion

  /*  static void patter1_rec(int n)
    {
    if (n>0){
        patter1_rec(n-1);
        for (int i=0;i<n;i++){
            System.out.print("*");
        }
        System.out.println();
    }
        }*/

          public static void main(String[] args) {
     /*   //Write A Java Method To Print Multiplication Table Of n Number
multiplication(5);
multiplication(8);
multiplication(9);*/
        // Write A Java Method To Print Following Pattern
//patter1(10);
        //Write A Recursive Function To Calculate Sum Of First n Natural Numbers
//    int c = sumrect(11);
//              System.out.println(c);
         //Write A Java Method To Print Following Pattern*****
//                                                        ***
           //   pattern2(8);
              //Write a function to print nth term of  fibonacci series using Recursion-0 ,1,1,2,3,5,8,13,21,34
            //  int result=fib(n);// here if write the value of n theen we get the desired result
              //System.out.println(result);

        //Java Method To Print Following Pattern *
        //                                       ** like this using recursion

        //  patter1_rec(4);
    }
}