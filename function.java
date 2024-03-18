package NikhileshProgrmas;

public class function {
    int sum(int a , int b)
    {
        int c;
        c=a+b;
        return c;
    }
    int sum (int a, int b , int c){
        int d=a+b+c;
        return d;
    }
    public static void main (String args []){
        function obj= new function();
        System.out.println(  obj.sum(4,5));
        System.out.println(  obj.sum(4,5,10));

    }
}
