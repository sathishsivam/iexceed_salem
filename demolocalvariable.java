class student
{
    String college;
    int x;
    student()
    {
    //     String name,city;
    //     int age;

    //     System.out.println(name);
    //     System.out.println(age);
    //     System.out.println(city);
    }
    public void display()
    {
        System.out.println(college);
        System.out.println(x);
    }
}


public class demolocalvariable {

    public static void main(String[] args) {
        student obj=new student();
        obj.display();
    }
}
