package chapter12;

public class GenericPrinterTest {

	public static void main(String[] args) {
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();	// Powder������ GenericPrinter Ŭ���� ����
		
		powderPrinter.setMaterial(new Powder());
		Powder powder = powderPrinter.getMaterial();
		System.out.println(powderPrinter);
		
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();	// Plastic������ GenericPrinter Ŭ���� ����
		
		plasticPrinter.setMaterial(new Plastic());
		Plastic Plastic = plasticPrinter.getMaterial();
		System.out.println(plasticPrinter);
	}

}
