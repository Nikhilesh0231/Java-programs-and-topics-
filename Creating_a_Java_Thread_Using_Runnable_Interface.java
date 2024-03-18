package OOPs;
class MyThreadRunnable1 implements Runnable{
    @Override
    public void run() {
        int i=0;
        while (i<2000)
        {
        System.out.println("I Am A Thread 1 Not A Threat 1");
            i++;
        }
    }
}
class MyThreadRunnable2 implements Runnable{
    @Override
    public void run() {
        int i =0;
        while(i<2000) {
            System.out.println("I Am A Thread 2 Not A Threat 2");
        i++;
        }
        }
}
public class Creating_a_Java_Thread_Using_Runnable_Interface {
    public static void main(String[] args) {
        MyThreadRunnable1 bullet1 = new MyThreadRunnable1();
        Thread gun1 = new Thread(bullet1);
        MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
        Thread gun2 = new Thread(bullet2);
        gun1.start();
        gun2.start();


    }
}
