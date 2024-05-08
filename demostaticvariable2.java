
class sample
  {
   static int count=0;
       sample()
       {
          
          count++;
          System.out.println("No of counts"+count);
       }
  }

public class demostaticvariable2 {
    public static void main(String[] args) {
        sample obj1=new sample();
        sample obj2=new sample();
        sample obj3=new sample();
        
    }
}
