class sample 
{
    int x=10;
    static int y=20;

    public void display()   // non static method
    {
        System.out.println("x="+x);
        System.out.println("y="+y);
    }
    static public void display1()
    {
       sample obj1=new sample();
        System.out.println(obj1.x);
    }

}



public class demostaticmethod {
    public static void main(String[] args) {
        sample obj=new sample();
        obj.display();
        sample.display1();
    }
}
