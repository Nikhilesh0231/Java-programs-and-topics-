package NikhileshNew;
public class ArrayReversal {
    public static void main (String args[]){
        String Name  = "Nikhilesh";
        String ReverseName = "";
        for (int i = 0; i < Name.length();i++){
            ReverseName =  Name.charAt(i) + ReverseName;
        }
        System.out.println(ReverseName);
    }
}
