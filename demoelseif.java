class sample 
{
    sample()
    {
        int marks=189;
        if(marks<50)
        {
            System.out.println("He/She has to reappear");
        }
        else if((marks>=50)&&(marks<60))
        {
            System.out.println("He/She passed with minimum marks");
        }
        else if((marks>=60)&&(marks<70))
        {
            System.out.println("He/She passed with first class");
        }
        else if((marks>70)&&(marks<80))
        {
            System.out.println("A grade");
        }
        else if((marks>=80) && (marks<=100))
        {
            System.out.println("A++ grade");

        }
        else
        {
            System.out.println("Check your marks");
         }
    }
}



public class demoelseif {
    public static void main(String[] args) {
        sample obj=new sample();
    }    
}
