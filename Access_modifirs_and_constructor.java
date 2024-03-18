package OOPs;
class MyEmployee{
   private int Id;
   private String Name;// after using privaate access modifiers we can not access the value of id or name in main function directly then we have to create the methods

    public String getName(){
        return Name;
    }
    public  void setName(String n){
        this.Name=n;
    }
     public void setId(int i)
     {
    this.Id=i;
     }
    public int getId()
    {
        return Id;
    }
}
public class Access_modifirs_and_constructor {
    public static void main(String[] args) {
    MyEmployee veeru=new MyEmployee();
   // veeru.Id=23501;
   // veeru.Name="Nikhilesh Tiwari";---throws error due to private access modifier
        veeru.setName("Nikhilesh Tiwari");
        System.out.println(veeru.getName());
        veeru.setId(23501);
        System.out.println(veeru.getId());
    }
}
