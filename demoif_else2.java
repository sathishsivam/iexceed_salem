

class sample 
{
    public void checkleap(int year)
    {
        if((year%4==0) && (year%100!=0)||(year%400==0))
        {
            System.out.println("Leap year");
        }
        else{
            System.out.println("Common year");
        }


    }
}
public class demoif_else2 {
public static void main(String asd[])
{
    sample obj=new sample();
    obj.checkleap(1900);
}    
}
