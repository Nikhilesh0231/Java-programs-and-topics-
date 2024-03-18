package OOPs;
class Practice13 extends Thread{
    public void run(){
        while(true){
            System.out.println("Good Morning");
        }
    }
}
class Practice13B extends Thread{
    public void run(){
        while(true){
            try {
                Thread.sleep(200);
            }
            catch (Exception e){
                System.out.println(e);
            }
            System.out.println("Welcome");
        }
    }
}
public class Ch_13_Practice_Set {
    public static void main(String[] args) {
        //Question No 1.Write A Program To Print "Good Morning" And "Welcome" Continuously On The Screen in Java Using Threads .
       // Practice13 p1 =new Practice13();
       // Practice13B p2 =new Practice13B();
       // p1.start();
       // p2.start();
        //Question No 2.Add a Step method in welcome thread of Question to display its ExecutionFor 200 ms.

        //Question No 3. Demonstrate getPriority And SetPriority Methods in java Threads.
        Practice13 p1 =new Practice13();
        p1.setPriority(6);
        Practice13B p2 =new Practice13B();
        p2.setPriority(9);
        System.out.println(p1.getPriority());
        System.out.println(p2.getPriority());
        //Question No 4.How Do You Get State Of A Given Thread In Java?
        System.out.println(p2.getState());
        //Question No 5.How Do You Get Reference to the Current Thread.
        System.out.println(Thread.currentThread().getState());
    }
}
