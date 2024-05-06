class sample 
{
    sample()
    {
        
        int age=18;
        boolean idt=true;
     

        if(age>=18)
        {
            if(idt==true)
            {
                System.out.println("He/she Eligible for voting");
            }
            else{
                System.out.println("Get verified with id card your age is matched");
            }
        }
        else{
            System.out.println("Else block is enabled");
        }

    }
}


public class demoif_else3 {
    
    public static void main(String ard[])
    {
        sample obj=new sample();
    }
}
