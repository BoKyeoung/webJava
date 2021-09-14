package ch01;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;


public class DataStructureTest2 {

	public static void main(String[] args) {
		
		Map map;
		// key와 value 구조로 데이터를 저장한다.
		HashMap<String,	String> map1 = new HashMap<String, String>();
		
		// null 값을 허용하지 않는다.
		Hashtable<String, String> map2 = new Hashtable<String, String>();
		
		map1.put("A01", "김해공항정문");
		map1.put("A02", "김해공항후문");
		map1.put("A03", "김해공항로비");
		map1.put("B01", "김해공항후문");
		map1.put("B02", "김해공항로비");
		map1.put("C01", null);
		
		System.out.println(map1);
		System.out.println(map1.get("A03")); // 키값으로 확인
		
		// 삭제방법
		map1.remove("C01");
		// map1.clear();
		System.out.println(map1);
		// 사이즈 확인방법
		System.out.println(map1.size());
		
		System.out.println("===================");
		
		//
		for(Entry <String, String> entry : map1.entrySet()) {
			System.out.println("[Key]" + entry.getKey() + "[value]" + entry.getValue());
		}
		
		System.out.println("===================");
		
		for (String key : map1.keySet()) {
			System.out.println(key + " : " + map1.get(key));
		}
		
	}

}





















