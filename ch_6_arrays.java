public class ch_6_arrays {
    public static void main(String args[]){
        /* Classroom of 10 Students-You Have to Store Marks Of These 500 Students
        You Have two Options
        1.Create 500 Variables
        2.use arrays(recommended)
         */
        //it is declaration +memory allocation


/*        int[] marks=new int[10];
        marks[0]=92;
        marks[1]=93;
        marks[2]=98;
        marks[3]=96;
        marks[4]=97;
        marks[5]=90;
        marks[6]=91;
        marks[7]=99;
        marks[8]=95;
        marks[9]=94;
       // marks[10]=82;-Throws an error
        System.out.println(marks[3]);*/


        //declare +intialize


      /*  int[] marks={12,34,23,45,67,89};
        System.out.println(marks[2]);*/

        //fist declaration
        //after memory allocation


     /*   int[]marks;
        marks=new int[2];
        marks[0]=12;
        marks[1]=23;
       // marks[2]=34;-It throws an error
        System.out.println(marks[0]);*/

        //Finding Length Of An Array Using -'marks.length'


      /*  int[] marks={12,34,23,45,67,89};//for int data type
        System.out.println(marks.length);*/

     /*   float[] marks={12.1f,34.2f,23.0f,45.9f,67.7f,89.4f};//for float data type
        System.out.println(marks[1]);*/

      /*  String[] Students={"Nikhilesh","Veeru","Suraj","Neelesh"};//For String Data Type
        System.out.println(Students[1]);*/

        //Diplaying An Array(for loop)


     /*   int[] marks={12,34,23,45,67,89};
        for(int i=0;i< marks.length;i++)
        {
            System.out.println(marks[i]);//It is array traversal.
        }*/

        //Question:Write A Java Program To Print The Elements Of Array In Reverse Order.

      /*  int[] marks={12,34,23,45,67,89};
        for(int i=marks.length-1;i>=0;i--)
        {
            System.out.println(marks[i]);//It is array traversal.
        }*/

        //Diplaying An Array(for each  loop)


       /* System.out.println("Printing Using For Each Loop:");
        int[] marks={12,34,23,45,67,89};
        for(int element:marks){
            System.out.println(element);
        }*/



      /*  int[] marks;  //1-D array
        int [][]flats; //2-D Array
        flats =new int[3][4];
        flats[0][0]=101;
        flats[0][1]=102;
        flats[0][2]=103;
        flats[0][3]=104;
        flats[1][0]=201;
        flats[1][1]=202;
        flats[1][2]=203;
        flats[1][3]=204;
        flats[2][0]=301;
        flats[2][1]=302;
        flats[2][2]=303;
        flats[2][3]=304;
        //Displaying The Array(for loop)
        System.out.println("Printing A 2-D Array Using For Loop");
        for(int i=0;i<flats.length;i++)
        {
            for(int j=0;j<flats[i].length;j++)//Nested Loop
            {
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }

    */


    }
}
