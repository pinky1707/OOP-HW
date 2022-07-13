package oopExam;

public class Iphone6 extends Iphone5 {
	
	public void compass() {
		System.out.println("One of the sensors built into mobile devices is a compass");

	}
	//return type parameterized metho-1 implemented()
	public int iPhone6(int ramPrice, int cameraPrice) {
		int total1 =ramPrice + cameraPrice;
		System.out.println("The price is:" + total1);
		return total1;

	}
	
	//void type parameterized method implemented
	public void iPhone6(int cameraPrice,String ProcessorPrice) {
		int total2 =cameraPrice+Integer.parseInt(ProcessorPrice);
		System.out.println("The price is:" + total2);


	}
	//return type parameterized method-2 implemented
	public int iPhone6(int ramPrice, int cameraPrice, String ProcessorPrice,int chargerPrice) {
		int total3 = ramPrice + cameraPrice + Integer.parseInt(ProcessorPrice)+ chargerPrice;
		System.out.println("The price is:" + total3);

		return total3;

	}
//	static type method implemented
	public static int iPhone6(int ramPrice,String ProcessorPrice, int cameraPrice,int chargerPrice) {
		int total4=ramPrice+Integer.parseInt(ProcessorPrice)+cameraPrice+chargerPrice;
			System.out.println("The price is:" + total4);
		return total4;
				
		
	}
	//final type method implemented
	public final int iPhone6(String ProcessorPrice,int ramPrice, int cameraPrice,int chargerPrice ) {
		int total5=Integer.parseInt(ProcessorPrice)+ramPrice+cameraPrice+chargerPrice;
				System.out.println("The price is:" + total5);
		return total5;
				
				
	}
/*
	 * method Overloading is also known as static binding,early binding 
	 * or compile time polymorphism
	 * different methods same name different parameter or different combination of parameter
	 * method Overloading occurs during compile time
	 * method Overriding is also known as Late binding,dynamic binding or runtime polymorphism
	 * method Overriding occurs during runtime
	 */
	
	
	
}
