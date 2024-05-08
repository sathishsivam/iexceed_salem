abstract class sample 
{
    sample()
    {

    }
    abstract public void display1(String str);
    abstract public void display2();
    abstract public void display3();
    
    
} 

class sample1 extends sample
{
    sample1()
    {

    }
    @Override
    public void display1(String s)
    {
        s.toUpperCase();
        
    }
    @Override
    public void display3(){}

    @Override
    public void display2(){}

    
}


 class demoabstract {

    public static void main(String[] args) {
        sample1 obj=new sample1();
    }
}
