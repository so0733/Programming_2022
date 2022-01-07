package chapter4;

public class SwitchCase1 {

	public static void main(String[] args) {
		int ranking = 1;
		char medalColor;
		
		switch(ranking) {
		case 1: medalColor = '금';	break;
		case 2: medalColor = '은';	break;
		case 3: medalColor = '동';	break;
		default:
			medalColor = 'A';
		}
		System.out.println(ranking + "등 메달 색은 " + medalColor + " 입니다.");
	}

}
