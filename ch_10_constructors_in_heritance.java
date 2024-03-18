package OOPs;
class Base1{
    Base1(){
        System.out.println("Main ek constructor hoon");
    }
    Base1(int x){
        System.out.println("I am an Overloaded contructor of base1 with value of x as:"+x);
    }

}
class Derived1 extends Base1 {
    Derived1() {
       // super(0);// if we use super keyword then it loads constructor with argument other it wise loads constructor without arguments
        System.out.println("I am derived class a contructor");
    }
    Derived1(int x,int y){
        super(x);
        System.out.println("I am an Overloaded contructor of Derived1 with value of y as:"+y);
    }
}
class ChildofDerived extends Derived1{
    ChildofDerived(){
        System.out.println(" I am child of derived class constructor");
    }
    ChildofDerived(int x,int y,int z){
        super(x,y);
        System.out.println("I am an Overloaded constructor of Derived1 with value of z as:"+z);
    }
}

public class ch_10_constructors_in_heritance {
    public static void main(String[] args) {
  //  Base1 b=new Base1();
   // Derived1 d= new Derived1();
    //    Derived1 d1= new Derived1(4,9);
        ChildofDerived cd=new ChildofDerived();
      //  ChildofDerived cd=new ChildofDerived(2,3,4);
    }
}
