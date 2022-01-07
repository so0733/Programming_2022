package chapter4;

public class IfExample2_2 {

	public static void main(String[] args) {
		int score = 90;
		char grade = 0;
		
		if(score < 100 && score >= 90) {
			grade = 'A';
		}
		else if(score < 90 && score >= 80) {
			grade = 'B';
		}
		else if(score < 80 && score >= 70) {
			grade = 'C';
		}		
		else if(score < 70 && score >= 60) {
			grade = 'D';
		}
		else {
			grade = 'F';
		}
		System.out.println("당신은 " + grade + " 학점입니다. ");
	}

}
