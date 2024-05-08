class sample 
{
    String name;
    int age;

    sample(String name,int age)
    {
        this.name=name;
        this.age=age;
       
    }
    public void display()
    {
        System.out.println("Name"+name);
        System.out.println("Age"+age);
        System.out.println("*****"+this);
       
    }
}

public class demothis {
    public static void main(String asd[])
    {
        sample obj1=new sample("sivam",43);
        System.out.println("from main"+obj1);
        sample obj2=new sample("sathishsivam",47);
        System.out.println("from main"+obj2);
        
        
    }

}
