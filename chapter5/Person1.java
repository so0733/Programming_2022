package chapter5;

public class Person1 {
	String name;
	float height;
	float weight;
	
	public Person1() { } // �ڹ� �����Ϸ��� �ڵ����� �����ϴ� ����Ʈ ������
	
	public Person1(String pname) {
		name = pname;	// ��� �̸��� �Ű������� �Է¹޾� Person1 Ŭ������ �����ϴ� ������
	}
	
	public Person1(String pname, float pheight, float pweight) {
		name = pname;	// �̸�, Ű, �����Ը� �Ű������� �Է� �޴� ������
		height = pheight;
		weight = pweight;
	}
}
