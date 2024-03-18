package OOPs;
 abstract class Parent2{// if we are making an abstract method then our class should also be abstract
    public Parent2(){
        System.out.println("I Am A Constructor Of Base2");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
     abstract public void greet2();

 }
class Child2 extends Parent2{
    @Override
    public void greet() {
        System.out.println("Good Morning");
    }
    @Override
    public void greet2() {
        System.out.println("Good Afternoon");
    }
}
abstract class child3 extends Parent2{
     public void th(){
         System.out.println("I Am Good");
     }
}
public class Ch_11_Abstract {
    public static void main(String[] args) {
      Child2 c= new Child2();
     // Parent2 p=new Parent2();//We Cannot create Instance Of abstract class
      // child3 c1=new Child3(); //We Cannot create Instance Of abstract class
    }
}
