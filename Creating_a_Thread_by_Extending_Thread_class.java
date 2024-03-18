package OOPs;
class MyThread1 extends Thread{
    @Override
    public void run(){
        int i=0;
        while (i<4000){
            System.out.println("My Thread Is Running");
            System.out.println("I Am Happy");
            i++;
        }
    }
}
class MyThread2 extends Thread{

    @Override
    public void run(){
        int i=0;
        while (i<4000){
            System.out.println("My Thread2 Is Good");
            System.out.println("I Am sad");
        i++;
        }
    }
}
public class Creating_a_Thread_by_Extending_Thread_class {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();

    }
}
