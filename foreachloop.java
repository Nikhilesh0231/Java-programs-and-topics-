package OOPs;

public class foreachloop {
    public static void main(String[] args) {
        int a[]={2,3,4,5,6};
        int sum=0;
        for (int i:a)
        {
            System.out.println(i);
            sum+=i;
        }
        System.out.println(sum);
    }
}
