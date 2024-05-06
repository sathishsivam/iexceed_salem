

class sample 
 {
     public void checkmyvoting(int age)
     {
       
        if(age>=18)
        {
            System.out.println("He/She eligible to vote");
        }
        else
        {
            System.out.println("Not eligible to vote");
        }

     }
     
 }

public class demoif2 {
public static void main(String asd[])
{
    sample obj=new sample();
    obj.checkmyvoting(23);
}    
}
