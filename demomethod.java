

class sample 
{
    public void display(int x,int y)
    {
        System.out.println("x="+x);
        System.out.println("y="+y);
        System.out.println("Addition="+(x+y));
    }
}
public class demomethod {
    public static void main(String[] args)
    {
        sample obj=new sample();
        obj.display(10,10);
    }
}
