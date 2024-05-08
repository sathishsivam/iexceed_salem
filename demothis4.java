class student
{
    student()
    {
        this(10,20);
        System.out.println("empty constuctor");
        
    }

    student(int x,int y)
    {
        System.out.println("addition"+(x+y));
    }
}


public class demothis4 {

    public static void main(String[] args) {
        student obj=new student();
        

    }
    
}
