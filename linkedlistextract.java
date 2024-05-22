import java.util.LinkedList;

public class linkedlistextract {
    public static void main(String[] args) {
        LinkedList l1=new LinkedList<>();
   
        l1.add("Salem");
        l1.add("Erode");
        l1.add("Nammakal");
        l1.add("Karur");
        l1.add("Madurai");

        System.out.println("No. of elemenets"+l1.size());

        // System.out.println("Element present at the ijndex 1 is"+l1.get(1));

        System.out.println("Element present at last"+l1.element());

         
        
    }
    

}


/*
public E get(int);
public E getFirst();
public E getLast();
public E peekFirst();
public E peekLast();
public E element();

      )
 */