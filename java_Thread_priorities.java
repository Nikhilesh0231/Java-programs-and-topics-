package OOPs;
class MyThr1 extends Thread{
    public MyThr1(String name){
        super(name);
    }

    @Override
    public void run() {
        int i =34;
       // System.out.println("Thank You!!!!!!!!!"+this.getName());
         while (true) {
        //   System.out.println("I Am A Thread");
        System.out.println("Thank You!!!!!!!!!"+this.getName());
         }
    }
}
public class java_Thread_priorities {
    public static void main(String[] args) {
//ready queue:T1,T2,T3,T4,T5
        MyThr1 t1 = new MyThr1("veeru1");
        MyThr1 t2 = new MyThr1("veeru2");
        MyThr1 t3 = new MyThr1("veeru3");
        MyThr1 t4 = new MyThr1("veeru4");
        MyThr1 t5 = new MyThr1("veeru5(hello)");
        t5.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }
}
