import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListInReverse {
	public static void main(String[] args) {
		
		 LinkedList<Integer> color=new LinkedList<Integer>();
		 
		 color.add(2);
		 color.add(5);
		 color.add(1);
		 color.add(24);
		 color.add(21);
		 color.add(19);
		 color.add(17);
		 color.add(16);
		 color.add(15);
		 color.add(50);
		 color.add(12);
		 
	
		 color.add(5,200);
		 color.addFirst(200);
		 color.addLast(150);
		 //first element
		 Integer first=color.getFirst();
		 System.out.println(first);
		 
		 Integer last=color.getLast();
		 System.out.println(last);
		 //iterator
		 //Iterator it = list.iterator();
		 Collections.shuffle(color);
		 //with listIterator we can specified index to iterate
		 Iterator<Integer> list=color.iterator();
		 while(list.hasNext()) {
			 System.out.println(list.next());
		 }
			 
		 }
}
