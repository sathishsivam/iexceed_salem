public class democonsover {
 public static void main(String[] args) {
    new sample(10,20);
 }   
}

class sample
 {
    sample()
    {
        System.out.println("Empty constructor");
    }
    sample(String str)
    {
        System.out.println(str.toUpperCase());
    }
    sample(int x,int y)
    {
        System.out.println("Multiplication"+(x*y));
    }

 }

