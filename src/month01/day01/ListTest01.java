package month01.day01;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
public class ListTest01 {
	public static void main(String[] args) {
		List myList = new ArrayList();
		myList.add("1234");
		myList.add("2356");
		for(int i =0; i<10; i++) {
			myList.add(i);
		}
		Iterator it = myList.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("*****************");
		for(int i=0; i<myList.size(); i++) {
			System.out.println(myList.get(i));
		}
		
	}
}
