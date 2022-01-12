package chapter8;
import java.util.ArrayList;

class NewAnimal {
	public void move( ) {	// ���� Ŭ���� NewAnimal
		System.out.println("������ �����Դϴ�.");
	}
}

class NewHuman extends NewAnimal {
	public void move( ) {	// NewAnimal�� ��ӹ��� NewHuman Ŭ����
		System.out.println("����� �� �߷� �Ƚ��ϴ�.");
	}
	
	public void readBook( ) {
		System.out.println("����� å�� �н��ϴ�.");
	}
}

class NewTiger extends NewAnimal {
	public void move( ) {	// NewAnimal�� ��ӹ��� NewTiger Ŭ����
		System.out.println("ȣ���̰� �׹߷� �ݴϴ�.");
	}
	
	public void hunting( ) {
		System.out.println("ȣ���̰� ����� �մϴ�.");
	}
}

class NewEagle extends NewAnimal {
	public void move( ) {	// NewAnimal�� ��ӹ��� NewEagle Ŭ����
		System.out.println("�������� �ϴ��� ���ϴ�.");
	}
	
	public void flying( ) {
		System.out.println("�������� ������ �� ��� �ָ� ���ư��ϴ�.");
	}
}

public class AnimalTest2 {
	ArrayList<NewAnimal> aniList = new ArrayList<NewAnimal>();	// �迭�� �ڷ����� NewAnimal�� ����
	
	public static void main(String[] args) {
		AnimalTest2 aTest = new AnimalTest2();
		aTest.addAnimal();
		System.out.println("���� ������ �ٿ� ĳ����");
		aTest.testCasting();
	}
	
	public void addAnimal( ) {
		aniList.add(new NewHuman( ));	// ArrayList�� �߰��Ǹ鼭 NewAnimal������ �� ��ȯ
		aniList.add(new NewTiger( ));
		aniList.add(new NewEagle( ));
		
		for(NewAnimal ani : aniList) {	// �迭 ��Ҹ� NewAnimal������ ������ move()�� ȣ���ϸ� �����ǵ� �Լ��� ȣ���
			ani.move();
		}
	}
	
	public void testCasting( ) {
		for(int i=0; i<aniList.size(); i++) {	// ��� �迭 ��Ҹ� �ϳ��� ���鼭
			NewAnimal ani = aniList.get(i);		// NewAnimal������ ������
			if(ani instanceof NewHuman) {			// NewHuman�̸�
				NewHuman h = (NewHuman)ani;			// NewHuman������ �ٿ� ĳ����
				h.readBook();
			}
			
			else if(ani instanceof NewTiger) {
				NewTiger t = (NewTiger)ani;
				t.hunting();
			}
			
			else if(ani instanceof NewEagle) {
				NewEagle e = (NewEagle)ani;
				e.flying();
			}
			else {
				System.out.println("�������� �ʴ� ���Դϴ�.");
			}
		}
	}
	
}
