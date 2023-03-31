package Day10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Vector;

public class MapEx1 {

	// HashMap 이랑 HashTable이랑 거의 동일하나 HashMap을 지향 한다!!!
	public void MapProcess() {
		HashMap<Integer, String> map1 = new HashMap<>();
		map1.put(1, "딸기"); // map<Key, Value> 중첩가능 key | (key | list((key|value)))
		map1.put(2, "수박"); // key || value -> 불편해서 ENTRY(Key || value) 로 묶는다
		map1.put(3, "레몬"); // ENTRY(Key || value)
		map1.put(4, "멜론"); // ENTRY(Key || value)

//		Iterator<Integer> it = map1.keySet().iterator(); // 중복X 순서X
//		while(it.hasNext()) {
//			Integer key = it.next();
//			System.out.println("key=  "+key+ "  value = " + map1.get(key));
//		}

		Iterator<Entry<Integer, String>> it = map1.entrySet().iterator(); // entry역시도 중복이 될수 있기 때문에 -> Set으로
		while (it.hasNext()) {
			Entry<Integer, String> entry = it.next();
			System.out.println(entry);
			System.out.println("key: " + entry.getKey() + "  value: " + entry.getKey());
		}

	}

	public void MapProcess2() {
		HashMap<String, Object> m1 = new HashMap<String, Object>();
		m1.put("empno", " 123");
		m1.put("name", " 123");
		m1.put("sal", " 123");

		HashMap<String, Object> m2 = new HashMap<String, Object>();
		m2.put("empno", "76413");
		m2.put("name", "76413");
		m2.put("sal", "76413");
		Vector<HashMap<String, Object>> vector = new Vector<HashMap<String, Object>>();
		vector.add(m1);
		vector.add(m2);

		Iterator<HashMap<String, Object>> vi = vector.iterator();
		while (vi.hasNext()) {
			HashMap<String, Object> node = vi.next();
			Iterator<Entry<String, Object>> ior = node.entrySet().iterator();
			while (ior.hasNext()) {
				Entry<String, Object> entry = ior.next();
				System.out.println(entry.getKey() + " " + entry.getValue());
			}
		}

	}

	// map을 너무 중첩은 X 그치만 중첩해서 사용하기
	public static void main(String[] args) {
		MapEx1 m = new MapEx1();
		m.MapProcess2();
	}

}
