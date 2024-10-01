public class LargestOfThree {
  public static int findLargest(int a , int  b, int c){
    if(a>b && a>c){
      return a;
    }
    else if(b>a && b>c){
      return b;
    }
    else{
      return c;
    }
  }
  public static void main (String args[]){
    int num1 = 112, num2 = 45,num3 = 143;
    LargestOfThree l1 = new LargestOfThree();
    System.out.println("The largest number is: "+l1.findLargest(num1,num2,num3));
  }  
}
