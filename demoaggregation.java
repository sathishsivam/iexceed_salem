class student
{
    String name,dept;
    int age;
    address adr;
    student(String name,int age,String dept,address adr)
    {
        this.name=name;
        this.age=age;
        this.dept=dept;
        this.adr=adr;

    }

    public void displaystudent()
    {
        System.out.println("Name of the student="+name);
        System.out.println("Age="+age);
        System.out.println("Department="+dept);
        // adr.displayaddress();
        System.out.println("Plot no"+adr.plot);
        System.out.println("Street Name="+adr.st_name);
        System.out.println("City="+adr.city);
        System.out.println("Pincode="+adr.pin);

    }
}



class demoaggregation
{
    public static void main(String args[])
    {
        address ad1=new address(3,"Peramanur main road","Salem",636007);
        address ad2=new address(2,"car street","Trichy",623456);
        
        student s1=new student("Sivam",23,"ECE",ad1);
        student s2=new student("Raj",22,"CSE",ad2);
        
        s1.displaystudent();
        s2.displaystudent();
    }
}