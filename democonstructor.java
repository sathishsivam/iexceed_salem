

class sample
{
    sample(int x,int y)
    {
      System.out.println(x+y);
    }
    public int getdata(int x,int y)
    {
        int sum=x+y;
        return sum;
    }
}
// constructor share the same name of the class
// constructor are always called during the creation of an object or instance
// constructor doest not return any thing


public class democonstructor {
 
    public static void main(String asd[])
    {
        sample obj1=new sample(100,200);
        System.out.println(obj1.getdata(10,20));
        
        // sample obj2=new sample();
    }
}

