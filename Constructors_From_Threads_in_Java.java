package OOPs;
class MyThr extends Thread{
    public MyThr(String name){
        super(name);
    }

    @Override
    public void run() {
        int i =34;
        System.out.println("Thank You!!!!!!!!!");
      //  while (true) {
         //   System.out.println("I Am A Thread");
       // }
    }
}
public class Constructors_From_Threads_in_Java {
    public static void main(String[] args) {
      MyThr t1 = new MyThr("Veeru");
        MyThr t2 = new MyThr("Nikhilesh");
      t1.start();
        t2.start();

        System.out.println("The Id Of Thread t Is : " + t1.getId());
        System.out.println("The Name Of Thread t Is : " + t1.getName());
        System.out.println("The Id Of Thread t Is : " + t2.getId());
        System.out.println("The Name Of Thread t Is : " + t2.getName());
    }
}
