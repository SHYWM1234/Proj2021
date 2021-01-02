package month01.day02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> mp = new HashMap<>();
		mp.put(1, "zhangsan");
		mp.put(2, "lisi");
		mp.put(4, "wangwu");
		mp.put(10, "zhaoliu");
		
		System.out.println(mp.size());
		
		mp.remove(10);
		
		System.out.println(mp.size());
		
		String s = mp.get(10);
		System.out.println(s);
		
		Set<Integer> keys = mp.keySet(); // 拿到map中所有的key
		Iterator<Integer> it = keys.iterator(); //获取keys的迭代器
		while(it.hasNext()) {
			System.out.println(mp.get(it.next()));
		}
		
		
		Set<Map.Entry<Integer, String>> mpet = mp.entrySet();
		
		for(Map.Entry<Integer, String> node : mpet){
			System.out.println(node.getKey() +"-->" + node.getValue());
			
		}

	}

}
