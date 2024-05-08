class sample
 {
    public void getdata()
    {
        System.out.println("Empty method");
    }
    public void getdata(String str)
    {
        System.out.println(str.toUpperCase());
    }
    public void getdata(int x,int y)
    {
        System.out.println("Multiplication"+(x*y));
    }

 }


public class demooverloading {
    public static void main(String[] args) {
        sample obj=new sample();
        obj.getdata();
        obj.getdata(10,20);
    }
    
}
