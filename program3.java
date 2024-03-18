package NikhileshProgrmas;
class animal{
    void eat (){
        System.out.println("The Animal Eats Food. ");
    }
    void sleep (){
        System.out.println("Animal Sleeps In Night. ");
    }
}
class dog extends animal {
 void bark(){
     System.out.println(" The Dog Barks On Strangers.");
 }
 @Override
 void eat(){
     System.out.println("Dog Eats Bone .");
 }
}
public class program3 {
    public static void main (String args[])
    {
        dog d = new dog();
        d.eat();
        d.sleep();
        d.bark();
    }
}
