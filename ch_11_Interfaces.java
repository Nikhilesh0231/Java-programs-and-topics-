package OOPs;
interface  Bicycle{
    int a=45;
    void applyBrake(int decrement);
    void speedUp(int Increment);
}
interface  HornBicycle{
    void blowHornk3g();
    void blowHornddlj();
}
class AvonCycle implements Bicycle,HornBicycle{
    void blowHorn(){
            System.out.println("Pee Pee Poo Poo");
        }
         public void applyBrake(int decrement){//methods from interface always be defined as public
            System.out.println("Applying Break");
        }
         public void speedUp(int Increment){
            System.out.println("Applying Speed Up");
        }
    public void blowHornk3g(){
        System.out.println("Kabhi khushi kabhi gum pe pe pe");
    }
    public void blowHornddlj(){
        System.out.println("Dil wali Dulahniyan le jayengeinm po po po");
    }
}
public class ch_11_Interfaces {
    public static void main(String[] args) {
AvonCycle cycleveeru=new AvonCycle();
cycleveeru.applyBrake(1);
        System.out.println(cycleveeru.a);//we can create properties in interfaces
        //we cannot modify properties in interfaces as they are final
       // cycleveeru.a=453;//- It throws an error
       // System.out.println(cycleveeru.a);
        cycleveeru.blowHornk3g();
        cycleveeru.blowHornddlj();
    }
}
