package OOPs;
class Phone{
    public void Showtime(){
        System.out.println("Showing Time...");
    }

    public void on(){
        System.out.println("Turning on phone . . . ");
    }
}
class Smartphone extends Phone{
    public void music(){
        System.out.println("Playing music...");
    }
    public void on(){
        System.out.println("Turning On Smartphone");
    }
}
public class ch_10_Dyanamic_method_dispatch {
    public static void main(String[] args) {
        //Phone obj=new Phone();//allowed
        //Smartphone smobj=new Smartphone();//allowed
        //obj.name();
        Phone obj=new Smartphone();//allowed// it is dynamic method dispatch and object creating while run time
      //  Smartphone obj2=new Phone();//not allowed
    obj.Showtime();
    obj.on();
   // obj.music();// nmot allowed
    }
}
