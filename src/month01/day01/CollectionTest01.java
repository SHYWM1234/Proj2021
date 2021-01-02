package month01.day01;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTest01 {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add(100);
		c.add("1234");
		c.add(3.1415926);
		
		Iterator it = c.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			it.remove();
		}
		System.out.print(c.size());
	
		
	}
	
	
}
