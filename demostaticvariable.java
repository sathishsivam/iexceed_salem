
class student
 {
    String name,dept;
    int age;
    static String college="KEC";  // static variable
    student(String name,int age,String dept)
     {  
        this.name=name;
        this.age=age;
        this.dept=dept;
      
     }

     public void display()
     {
        System.out.println("Name"+name);
        System.out.println("Age"+age);
        System.out.println("Department"+dept);
        System.out.println("College"+student.college);
        
     }

 }

public class demostaticvariable {
    public static void main(String[] args) {
        student s1=new student("Harish",22,"CSE");
        student s2=new student("Kiruba",21,"ECE");
        s1.display();
        s2.display();

    }
}
