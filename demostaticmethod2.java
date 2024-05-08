class sample 
{
    static int x=10;
    static int y=20;
    
   static  public void display(int x,int y)
    {
        x=x;
        y=y;
        displayme();
    }

   static public void displayme()
    {
        System.out.println("x"+x);
        System.out.println("y"+y);
    }
}



public class demostaticmethod2 {

    public static void main(String[] args) {
        // sample obj=new sample();
       sample.display(10,100);
       
    }
    
}
