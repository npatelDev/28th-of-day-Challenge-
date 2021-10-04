import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class IteratFromSpecifiedIndex {
	public static void main(String[] args) {
		
		 LinkedList<String> color=new LinkedList<String>();
		 
		 color.add("Blue");
		 color.add("Red");
		 color.add("Pink");
		 color.add("White");
		 color.add("Black");
		 color.add("Green");
		 color.add("Orange");
		 color.add("Purple");
		 
		 //iterator
		 //Iterator it = list.iterator();
		 Collections.sort(color);
		 //with listIterator we can specified index to iterate
		 Iterator<String> list=color.listIterator(3);
		 while(list.hasNext()) {
			 System.out.println(list.next());
		 }
			 
		 }
		 
}
