package Module7_Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ArrayList<String> a = new ArrayList<String>();
       a.add("Amit");
       a.add("Swaraj");
       a.add("Amit");
       a.add(null);
       
       Iterator<String> i =a.iterator();
       
       
       for(String list:a)
       {
    	   System.out.println("Demo Of ArrayList");
    	   System.out.println(" ArrayList "+list);
       }
       
       while(i.hasNext())
       {
    	   System.out.println(i.next());
    	   
       }
       
       
       
	}

}
