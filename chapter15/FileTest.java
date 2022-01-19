package chapter15;

import java.io.File;
import java.io.IOException;

public class FileTest {
	public static void main(String[] args) throws IOException {
		File file = new File("D:\\SCH\\src\\java_project\\220106\\newFile.txt");	// 해당 경로에 File 클래스 생성
		file.createNewFile();							// 실제 파일 생성
		
		System.out.println(file.isFile());				// 파일 속성을 살펴보는 메서드 호출해 출력
		System.out.println(file.isDirectory());
		System.out.println(file.getName());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getPath());
		System.out.println(file.canRead());
		System.out.println(file.canWrite());
		
		file.delete();									// 파일 삭제
	}
}
