public class practice_ch_6
{
    public static void main(String[] args)
    {
      //1.Create An Array Of Five Floats And Calculate Their Sum


     /*   float[]Num;
        Num=new float[5];
        Num[0]=23.8f;
        Num[1]=33.9f;
        Num[2]=43.6f;
        Num[3]=53.4f;
        Num[4]=63.7f;
        float sum=0.0f;
        for(float element:Num)//Using For Each loop
        {
           sum=sum+element;
        }
        System.out.print("The Sum Of Num Is:");
        System.out.println(sum);*/


        //2.Write A Program To Find Out Whether A Given Integer Is present Or Not.


     /*   float[]Num;
        Num=new float[5];
        Num[0]=23.8f;
        Num[1]=33.9f;
        Num[2]=43.6f;
        Num[3]=53.4f;
        Num[4]=63.7f;
        float num=33.99f;//here we can write the vaue which is present then it shows present and we write the value which is not in the array yhen it shows not present.
        boolean isInArray=false;//we can said here that value is not in arrray
        for(float element:Num) {
            if (num == element) {
                isInArray = true;
                break;
            }
        }
        if(isInArray)
        {
            System.out.println("The Value Is Present In The Array");
        }
        else
        {
            System.out.println("The Value Is Not Present In The Array");
        }*/

        //3.Calculate The Average Marks From An Array Containing Marks Of All Students In Physics Using for-each loop.

      /*
        float[]Num;
        Num=new float[5];
        Num[0]=23.8f;
        Num[1]=33.9f;
        Num[2]=43.6f;
        Num[3]=53.4f;
        Num[4]=63.7f;
        float sum=0.0f;
        for(float element:Num)//Using For Each loop
        {
            sum=sum+element;
        }
        System.out.print("The Average Value Of Num Is:");
        System.out.println(sum/ Num.length);
       */

        //4.Create A Java Program To Add Two Matrices Of Order 23.


       /* int[][]mat1={{1,2,3},
                     {4,5,6}};
        int[][]mat2={{2,2,13},
                     {14,5,16}};
        int[][]result={{0,0,0},
                       {0,0,0}};
        for (int i=0;i< mat1.length;i++)//Row Number Of Times
        {
            for (int j = 0; j < mat1[i].length; j++)//Coloumn Number Of Times
            {

                result[i][j]=mat1[i][j]+mat2[i][j];
                System.out.print(result[i][j]+" ");
            }
            System.out.println("");
        } */


        //5.Write A Java Program To Reverse An Array.

      /*
        int[]arr={2,4,6,8,10,12};
        int l=arr.length;
        int n=Math.floorDiv(l,2);
        int temp;//it is temporary box Which helps in swapping
        for (int i=0;i<n;i++)
        {
          //swap a[i] and a[l-1-i]
            temp = arr[i];
            arr[i]=arr[l-1-i];
            arr[l-1-i]=temp;
        }
          for (int element:arr)
        {
            System.out.print(element+" ,");
        }

       */


        //6.Write A Java Program To Find The Maximum Element In Array


/*
        int[]arr={2,40,-6,800,10,120};
        int max=Integer.MIN_VALUE;
        for (int element:arr)
        {
            if(element>max)
            {
                max=element;
            }
        }
        System.out.println("The Valu Of Maximum Element In This Array Is:"+max);

 */
      //7.Write A Java Program To Find The Minimum Element In Array

       /* int[]arr={2,40,-6,800,10,120};
        int min=Integer.MAX_VALUE;
        for (int element:arr)
        {
            if(element<min)
            {
                min=element;
            }
        }
        System.out.println("The Value Of Minimum Element In This Array Is:"+min);

        */

        // Write A Java Program To Find WhetherAn Array Is Sorted Or Not.


      /*  int[]arr={2,40,79,800,1000,1200};// if array is sorted here then it shows output as sorted other wise not.
        boolean isSorted=true;
        for (int i=0;i<arr.length-1;i++)
        {
            if (arr[i]>arr[i+1])
            {
                isSorted=false;
                break;
            }
        }
        if (isSorted)
        {
            System.out.println("The Array Is Sorted");
        }
        else
        {
            System.out.println("The Array Is Not Sorted");
        }

       */


    }
}
