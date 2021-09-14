package ch01;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;


public class DataStructureTest2 {

	public static void main(String[] args) {
		
		Map map;
		// key�� value ������ �����͸� �����Ѵ�.
		HashMap<String,	String> map1 = new HashMap<String, String>();
		
		// null ���� ������� �ʴ´�.
		Hashtable<String, String> map2 = new Hashtable<String, String>();
		
		map1.put("A01", "���ذ�������");
		map1.put("A02", "���ذ����Ĺ�");
		map1.put("A03", "���ذ��׷κ�");
		map1.put("B01", "���ذ����Ĺ�");
		map1.put("B02", "���ذ��׷κ�");
		map1.put("C01", null);
		
		System.out.println(map1);
		System.out.println(map1.get("A03")); // Ű������ Ȯ��
		
		// �������
		map1.remove("C01");
		// map1.clear();
		System.out.println(map1);
		// ������ Ȯ�ι��
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





















