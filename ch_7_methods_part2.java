// Variable Arguments
public class ch_7_methods_part2 {
 /*   static int sum(int a, int b)//instead writing method to different times we use varargs
    {
        return a + b;
    }
    static int sum(int a, int b,int c)
    {
        return a + b+c;
    }
    static int sum(int a, int b,int c,int d)
    {
        return a + b+c+d;
    }*/
//    static  int sum(int...arr)//it is used in the  place of writing different methods we use this
    //instead of writing upper if we write this line then we have to enter atleast one value
 /* static int sum(int x,int...arr)
    {
        //available as int[]arr
       // int result=0;
       int result=x;
        for (int a:arr)
        {
            result+=a;
        }
        return result;
    }

    public static void main(String[] args)
    {
        System.out.println("WELOCOME TO VARARGS");
     //   System.out.println("Sum Of Nothing Is :"+sum());// in this case output will show as 0 it is because if we not passing any value then array  has 0 value
        System.out.println("The Sum Of 1 Is :"+sum(1));//now if writing varargs line if intialized an variable x then this line will execute above line can't be execute
        System.out.println("The Sum Of 5 And 6 Is :" + sum(5, 6));
        System.out.println("The Sum Is Of 4,5 And 6 Is:"+sum(4,5,6));
        System.out.println("The Sum Of 4,5,6 And 7 Is:"+sum(4,5,6,7));
    }*/

    //Recursion

    static int factorial(int n) {
        //factorial(n)= n*n-1*n-2....

//factorial(n)=n*(n-1)
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    static int factorial_iterative(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            int product = 1;
            for (int i = 1; i <= n; i++) {
                product *= i;
            }
            return product;
        }
    }


   public static void main(String[] args) {
       int n=10;
       System.out.println("The Value Of Factorial n IS :"+factorial(n));
       System.out.println("The Value Of Factorial n IS :"+factorial_iterative(n));

    }
}
