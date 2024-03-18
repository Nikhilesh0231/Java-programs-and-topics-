package NikhileshProgrmas;
import java.util.Scanner;
public class Program2 {
    public static void main (String args[]){
        int i=0;
       /* while (i<10){
            System.out.println("Nikhilesh Tiwari");
            i++;
        }*/
       /* do {
            System.out.println("Nikhilesh Tiwari");
            i++;
        }while(i<5);*/
       /* for(i=0;i<10;i++){

            if(i==2){
                System.out.println("Ending");
                continue;
            }
            System.out.println("Nikhilesh Tiwari"+i);
        }*/

        int arr[];
        arr=new int[10];
        for(i=0;i<arr.length;i++ ){
            System.out.println("Enter The Value Of"+ i +"Element");
            Scanner sc = new Scanner(System.in);
            arr[i]=sc.nextInt();
        }
       /* for(i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }*/
        for (int element:arr) {
            System.out.println(element);
        }
    }
}
