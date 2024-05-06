

class sample 
{
      sample()
      {
        int x=10;
        // < <= > >= == !=
      
      }
      public void relational(int x,int y)
      {
       
        // System.out.println(x<y);
        // System.out.println(x<=y);
        // System.out.println(x>y);
        // System.out.println(x>=y);
        // System.out.println(x==y);
        // System.out.println(x!=y);

      }

      public void logical()
      {
        int x=20,y=20;
        System.out.println((x>100) & (x==y)||(x<30));
      }
}


public class demooperators
 {
    public static void  main(String das[])
    {
     sample obj=new sample();
     obj.relational(100,100); 
     obj.logical();
     
    }    
}
