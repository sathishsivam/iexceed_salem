class student
{
    String name,city;
    int age;

    student(String name,int age,String city)
    {
        // this.name=name;
        // this.age=age;
        // this.city=city;

        
    }

    public void display()
    {
        System.out.println("Name="+name);
        System.out.println("Age="+age);
        System.out.println("City="+city);


    }
}


public class demothis2 {

    public static void main(String[] args) {
        student obj=new student("Sivam",23,"Salem");
        obj.display();
    }
    
}
