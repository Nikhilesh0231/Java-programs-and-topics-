public class ch_7_methods {
  /*  static int logic(int x,int y)   //if we dont use static then we have to create an object in method
    {                                  //in static we dont have to create an object
        int z;
        if (x>y)
        {
            z=x+y;
        }
        else
        {
            z=(x+y)*5;
        }
        return z;
    }
    public static void main(String[] args) {

        int a=5;
        int b=7;
        int c;
        c=logic(a,b);
        int a1=2;
        int b1=1;
        int c1=logic(a1,b1);
        System.out.println(c);
        System.out.println(c1);*/

 //here we are going to call the method by making an object

    /*int logic(int x,int y)   //if we dont use static then we have to create an object in method
  {
      int z;
      if (x>y)
      {
          z=x+y;
      }
      else
      {
          z=(x+y)*5;
      }
      return z;
  }
    public static void main(String[] args) {

        int a=5;
        int b=7;
        int c;
        //Method Invocation Using Object Creation
        ch_7_methods obj = new ch_7_methods();//Ceating object
        c=obj.logic(a,b);//calling obect
        int a1=2;
        int b1=1;
        int c1=obj.logic(a1,b1);
        System.out.println(c);
        System.out.println(c1);*/

  /*  static void telljoke()
    {
        System.out.println("I ate a sock yesterday. It was very time-consuming.");
    }
    public static void main(String args[]){
        telljoke();*/
    // case 1:Changing integer
   /* static void change(int a)//in this case change will not occur
    {
        a=98;
    }
    public static void main(String args[])
    {
        int x=45;
        change(x);
        System.out.println("The value of x after running change is:"+x);
    }*/

    // Case 2:In case of array change will occur it passes by refrence
  /*  static void change(int []arr)//in this case change will occur As refrence is passed
    {
        arr[0]=98;
    }
    public static void main(String args[])
    {
        int []marks={45,35,46,47,33,44};
        change(marks);
        System.out.println("The value of x after running change is:"+marks[0]);
    }*/

    // Method Overloading
    // OVER LOADING IS DONE BY CHANGING PARAMETERS NOT BY CHANGING RETURN TYPE
 /*   static void foo()// this method is as in below but there is no argument passing
    {
        System.out.println("Good Morning Veeru Sir");
    }
    static void foo(int a)// this method is as in above but there is argument passing here a is parameter but
            //if value a is passed main function then actual value is argument
    {
        System.out.println("Good Morning  "+a+"  Veeru Sir");
    }
    static void foo(int a,int b)
    {
        System.out.println("Good Morning  "+a+"  Veeru Sir");
        System.out.println("Good Morning  "+b+"  Veeru Sir");
    }
    public static void main(String args[])
    {
        foo();
        foo(887441);
        foo(3000,4000);// arguments are actual
    }*/
}
