import java.util.LinkedList;

public class linkedlist_toarray {

    public static void main(String[] args) {
         LinkedList<String> l1=new LinkedList<String>();

        l1.add("Salem");
        l1.add("Erode");
        l1.add("Nammakal");
        l1.add("Karur");
        l1.add("Madurai"); 

        String[] resarray=(String[])l1.toArray();
        for(String res:resarray)
        {
            System.out.println(res);
        }

        // l1.toArray(null)


    }
    
}
