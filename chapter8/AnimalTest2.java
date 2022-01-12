package chapter8;
import java.util.ArrayList;

class NewAnimal {
	public void move( ) {	// 상위 클래스 NewAnimal
		System.out.println("동물이 움직입니다.");
	}
}

class NewHuman extends NewAnimal {
	public void move( ) {	// NewAnimal을 상속받은 NewHuman 클래스
		System.out.println("사람이 두 발로 걷습니다.");
	}
	
	public void readBook( ) {
		System.out.println("사람이 책을 읽습니다.");
	}
}

class NewTiger extends NewAnimal {
	public void move( ) {	// NewAnimal을 상속받은 NewTiger 클래스
		System.out.println("호랑이가 네발로 뜁니다.");
	}
	
	public void hunting( ) {
		System.out.println("호랑이가 사냥을 합니다.");
	}
}

class NewEagle extends NewAnimal {
	public void move( ) {	// NewAnimal을 상속받은 NewEagle 클래스
		System.out.println("독수리가 하늘을 납니다.");
	}
	
	public void flying( ) {
		System.out.println("독수리가 날개를 쭉 펴고 멀리 날아갑니다.");
	}
}

public class AnimalTest2 {
	ArrayList<NewAnimal> aniList = new ArrayList<NewAnimal>();	// 배열의 자료형은 NewAnimal로 지정
	
	public static void main(String[] args) {
		AnimalTest2 aTest = new AnimalTest2();
		aTest.addAnimal();
		System.out.println("원래 형으로 다운 캐스팅");
		aTest.testCasting();
	}
	
	public void addAnimal( ) {
		aniList.add(new NewHuman( ));	// ArrayList에 추가되면서 NewAnimal형으로 형 변환
		aniList.add(new NewTiger( ));
		aniList.add(new NewEagle( ));
		
		for(NewAnimal ani : aniList) {	// 배열 요소를 NewAnimal형으로 꺼내서 move()를 호출하면 재정의된 함수가 호출됨
			ani.move();
		}
	}
	
	public void testCasting( ) {
		for(int i=0; i<aniList.size(); i++) {	// 모든 배열 요소를 하나씩 돌면서
			NewAnimal ani = aniList.get(i);		// NewAnimal형으로 가져옴
			if(ani instanceof NewHuman) {			// NewHuman이면
				NewHuman h = (NewHuman)ani;			// NewHuman형으로 다운 캐스팅
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
				System.out.println("지원되지 않는 형입니다.");
			}
		}
	}
	
}
