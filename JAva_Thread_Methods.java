package OOPs;

class MyNewThr1 extends Thread{
    @Override
    public void run() {
       // int i =0;
 while (true) {
            //   System.out.println("I Am A Thread");
            System.out.println("Thank You!!!!!!!!!");
        try {
            Thread.sleep(455);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        // i++;
        }
    }
}
class MyNewThr2 extends Thread{
    @Override
    public void run() {
        while (true) {
            //   System.out.println("I Am A Thread");
            System.out.println(" My Thank You!!!!!!!!!");
        }
    }
}
public class JAva_Thread_Methods {
    public static void main(String[] args) {
        MyNewThr1 t1 = new MyNewThr1();
        MyNewThr2 t2 = new MyNewThr2();
        t1.start();
      //  try {
      //      t1.join();
      //  }
      //  catch (Exception e){
       //     System.out.println(e);
       // }
        t2.start();

    }
}
