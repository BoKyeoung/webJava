package ch13;

public class GateWay {
	
	public static int zealotCount;
	
	private int gateWayId;
	private String name;
	 
	 public GateWay(int id) {
		 this.gateWayId = id;
		 name = "����Ʈ����";
	 }

	 // �޼��� ���� Ÿ������ ��ü�� ����
	 // ������ �����ϱ� 
	 // public ����Ÿ�� creatUnit(); {} 
	 
	 // �Ű����� 1. ����
	 // �Ű����� 2. ���
	 // �Ű����� 3. ��ũ���÷�
	 public Unit creatUnit() {
		 zealotCount++;
		 System.out.println("������ �����մϴ�.");
		 int target = 0;
		if(target == 1) {
			 return new Zealot("����" + zealotCount);
		 }else if (target == 2) {
			 return new Dragon("���");
		 }else {
			 return new DarkTempler("��ũ ���÷�");
		 }
		 
	 }
}
