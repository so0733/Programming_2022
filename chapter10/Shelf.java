package chapter10;
import java.util.ArrayList;

public class Shelf {
	protected ArrayList<String> shelf;	// �ڷḦ ������� ������ ArrayList ����

	public Shelf() {					// ����Ʈ �����ڷ� Shelf Ŭ������ �����ϸ� ArrayList�� ������
		shelf = new ArrayList<String>();
	}
	
	public ArrayList<String> getShelf() {
		return shelf;
	}
	
	public int getCount() {
		return shelf.size();
	}
}
