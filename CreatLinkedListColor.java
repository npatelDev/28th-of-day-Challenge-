import java.util.LinkedList;
import java.util.Collections;
import java.util.Iterator;

public class CreatLinkedListColor {
		

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
			 Iterator<String> list=color.iterator();
			 while(list.hasNext()) {
				 System.out.println(list.next());
			 }
				 
			 }
			 
			
		}

