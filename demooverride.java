
class sample
{
    sample()
    {

    }
    public void display()
    {
        System.out.println("from super class");
    }
}
class sample1 extends sample
{
    sample1()
    {

    }
    @Override
    public void display()
    {
        System.out.println("from derived class");
    }
}




public class demooverride {
    public static void main(String[] args) {
        sample sobj=new sample();
        sample1 dobj=new sample1();
        sample ref;
        ref=sobj;
        ref.display();
    }
}
