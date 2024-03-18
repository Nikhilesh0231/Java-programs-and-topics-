package OOPs;

//import java.util.Scanner;//it ia built in package Which imports Scanner
//import java.util.*;//it imports all from java.util//We Can Do Same In Another Way See Line No 8
public class ch_12_packages {
    public static void main(String[] args) {
       // Scanner sc = new Scanner(System.in);
        java.util.Scanner sc = new java.util.Scanner(System.in);//In This Way
        System.out.println("This Is My Scanner");
        int a = sc.nextInt();
        System.out.println("This Is My Scanner Taking Inout As : "+ a);
    }
}
