package OOPs;
class MyMainEmployee{
    private int Id;
    private String Name;// after using privaate access modifiers we can not access the value of id or name in main function directly then we have to create the methods

    public MyMainEmployee()
    {
        Id=23501;
        Name=" Hello Nikhilesh Tiwari" ;
    }
  public MyMainEmployee(String myName, int myId)//we can also pass arguments in constructors//and it is also constructor overlaoding
  {
      Id=myId;
      Name=myName;
  }
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
public class ch_constructors {
    public static void main(String[] args) {
    // MyMainEmployee veeru=new MyMainEmployee("Helllo Nikilesh",23501);//here we an give name to argument
        MyMainEmployee veeru=new MyMainEmployee();//it call that costructor in which no argument is passed
    /* veeru.setName("Nikhilesh Tiwari");
        veeru.setId(23501);*/ //if not set name and id then it will take from the mymainemployee function because MymainEmployee is costructor which invokes on it self own
        System.out.println(veeru.getName());
        System.out.println(veeru.getId());
    }
}
