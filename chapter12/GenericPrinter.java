package chapter12;

public class GenericPrinter <T extends Material> {	// extends ������ ����� �� �ִ� �ڷ����� ������ ��
	private T material;				// T �ڷ������� ������ ����
	
	public void setMaterial(T material) {
		this.material = material;
	}
	
	public T getMaterial( ) {		// T �ڷ��� ���� material�� ��ȯ�ϴ� ���׸� �޼���
		return material;
	}
	
	public String toString( ) {
		return material.toString();
	}
	
	public void printing( ) {
		material.doPrinting();		// ���� Ŭ���� Material�� �޼��� ȣ��
	}
}
