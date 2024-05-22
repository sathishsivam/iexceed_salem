

 abstract class student
 {
    abstract public void displayme();
 }


public class demoanony {
    public static void main(String[] args) 
    {
        student obj=new student(){
            public void displayme()
            {
                System.out.println("Welcome to the anonymous class");
            }

        };
        obj.displayme();

    }
}
