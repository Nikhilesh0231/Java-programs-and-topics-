package OOPs;

public class ch_14_Try_Catch_Block_in_Java {
    public static void main(String[] args) {
        int a =6000;
        int b =0;//now if we divide a by 0 then we get a error for this we rap c in try and if any comes in then catch it.
        try {
            int c = a / b;
            System.out.println("The Result Is : " + c);
        }
        catch (Exception e)
        {
            System.out.println("We Failed to Divide : Reason");
            System.out.println(e);
        }
        System.out.println("End Of The Program ");
    }
}
