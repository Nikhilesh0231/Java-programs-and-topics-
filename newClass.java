package NikhileshProgrmas;
import java.util.Scanner;
public class newClass {
        public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
          //  int  x = sc.nextInt();
           /* if (x>0)
            {
                System.out.println("Number Is Positive");
            }
            else if(x<0)
            {
                System.out.println("Number Is Negative");
            }
            else
            {
                System.out.println("Number Is Zero");
            }
            System.out.println("NIKHILESH TIWARI");
        */
         /*   switch(x)
            {
                case 11 :
                    System.out.println("Number is Greater Than 10");
                    break;
                case 2 :
                    System.out.println("Number is less Than 10");
                    break;
                case 10 :
                    System.out.println("Number is 10");
                    break;
                default:
                    System.out.println("Invalid Entry ");
            }*/
            String name1,name2 ;
            name1 = new String ("Nikhilesh Tiwari");
            name2=new String ("Hello!! How Are You");
            System.out.println(name1 + name2);
            System.out.println(name1.length());
            System.out.println(name2.toLowerCase());
            int marks[]=new int[2];
            marks[0]=100;
            marks[1]=90;
            for (int n:marks){
                System.out.println(n);
            }
            for(int i =0;i<marks.length;i++){
                System.out.println(marks[i]);
            }
        }
}
