package OOPs;
class EkClass{
    int a;

    public int getA() {
        return a;
    }

    EkClass(int v) {
      //  a=v;
        this.a=v;//it is used refer the object in another class with help of this operator//it is used with in the class
    }
    public int returnone(){
        return 1;
    }
}
class DoClass extends EkClass{
    DoClass(int c){
        super(c);// if we not use super keyword then it show an error because control goes to EkClass and search for constructor passing one argument
        System.out.println("Main Ek Constructor hoon");
    }
}

public class ch_10_this_super {
    public static void main(String[] args) {
        EkClass e=new EkClass(5);
        DoClass d=new DoClass(5);
        System.out.println(e.getA());

    }
}
