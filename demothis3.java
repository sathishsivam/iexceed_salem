
class employee
{
    String emp_name,desig;  // instance variables
    int emp_id;

    employee(String emp_name,int emp_id,String desig)
    {
        this.emp_name=emp_name;
        this.emp_id=emp_id;
        this.desig=desig;

    }

    public void display()
    {
        System.out.println("Employee Name"+emp_name);
        System.out.println("Emp_id"+emp_id);
        System.out.println("Designation"+desig);
        displaymail();
    }

    public void displaymail()
    {
        System.out.println("E-mail"+emp_name+desig+"@"+"gmail.com");
    }


}


public class demothis3 {

    public static void main(String[] args) {
        employee obj=new employee("sivam", 1, "Trainer");
        obj.display();
        
    }
}


// this keyword is also used to call the current class method
