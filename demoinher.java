class student   // super class
{
    String name,college;
    int age;

    student(String name,int age,String college)
    {
        this.name=name;
        this.age=age;
        this.college=college;
        
    }
    public void displaystudent()
    {
      System.out.println("Studentname"+name);
      System.out.println("Age"+age);
      System.out.println("College"+college);

    }
}

class teacher extends student  // derived class
{
  int salary;
  teacher(String name,int age,String college,int salary)
  {
    super(name,age,college);
    this.salary=salary;
    
  }
  public void displayteacher()
  {
    System.out.println("Salary"+salary);
  }
}

public class demoinher {

    public static void main(String[] args) {
        teacher obj=new teacher("sivam",21,"irtt",120000);
        obj.displaystudent();
        obj.displayteacher();
        
    }
    
}
