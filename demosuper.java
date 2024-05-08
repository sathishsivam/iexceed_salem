class classrecord
{
    int rollno=5;
    String name="sivam";
    String deg="ME";

    public void displayclassrec()
    {
        System.out.println("Roll No="+rollno);
        System.out.println("Name"+name);
        System.out.println("Class"+deg);
        this.display1();
    }
    public void display1()
    {
        System.out.println("hi from super class");
    }
}

class recordd extends classrecord   // derived class
{
    int rollno=1;
    String name="sathish";
    String deg="MCA";

    public void displayme()
    {
        super.displayclassrec();
        System.out.println("Roll No="+super.rollno);
        System.out.println("Name"+super.name);
        System.out.println("Class"+super.deg);

    }
}



public class demosuper {
    public static void main(String[] args) {
        recordd obj=new recordd();
        obj.displayme();
        
       
    }
}
