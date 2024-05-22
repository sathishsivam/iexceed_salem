
abstract class student
{
    abstract public void getdata(int x,int y);
}

public class demoanony2 {

    public static void main(String[] args) {
        new Thread(){
            public void run()
            {
                for(int i=0;i<10;i++)
                {
                    System.out.println(i);
                }
            }
        }.start();

        student o=new student(){
            public void getdata(int x,int y)
            {
                System.out.println(x+y);
            }
        };
        o.getdata(10,20);

    }
    
}
