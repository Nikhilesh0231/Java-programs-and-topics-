package OOPs;
// If We Write public class employee here then we can see error because in a java programe only one public class czn be written
class employee{
    int Id;
    String name;
    int salary;
    public void printDetails()
    {
        System.out.println("My Id Is :"+Id);
        System.out.println("My Name Is :"+name);
       // System.out.println("My Salary Is :"+salary);//instead of create a method
    }

    public int getSalary() {
        return salary;
    }
}
public class custom_class {
    public static void main(String[] args) {
        System.out.println("This Is Our Custom Class");
        employee veeru=new employee();//insatantiating a new employee Object
        employee nikhilesh=new employee();
        // setting Attributes for veeru
        veeru.Id=23501;
        veeru.name="NIkhilesh Tiwari";
        veeru.salary=125000;
        // setting Attributes for Nikhilesh
        nikhilesh.Id=23502;
        nikhilesh.name="veeru";
        nikhilesh.salary=230000;

        //printing the attributes
        veeru.printDetails();
        int salary1= veeru.getSalary();
        System.out.println("My salary Is:"+salary1);
        nikhilesh.printDetails();
        int salary2= nikhilesh.getSalary();
        System.out.println("My salary Is:"+salary2);
       // System.out.println(veeru.Id);
        //System.out.println(veeru.name);
    }
}
