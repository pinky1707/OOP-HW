package oopExam;

public class ConfiguredIphone6 extends Iphone6{
	@Override
	//void type method implemented
	public void compass() {
		System.out.println("Compass is use for nevigation and geographic orientation");

	}
@Override
//return type parameterized method-1 implemented
	public int iPhone6(int ramPrice, int cameraPrice) {
		int total1 =ramPrice + cameraPrice+5;
		System.out.println("The price is:" + total1);
		return total1;

	}
@Override
//void type parameterized methodimplemented
public void iPhone6(int cameraPrice,String ProcessorPrice) {
	int total2 =cameraPrice+Integer.parseInt(ProcessorPrice)*2;
	System.out.println("The price is:" + total2);


}
@Override
//return type parameterized method-2implemented
	public int iPhone6(int ramPrice, int cameraPrice, String ProcessorPrice,int chargerPrice) {
		int total3 = ramPrice/5+ cameraPrice + Integer.parseInt(ProcessorPrice)+ chargerPrice;
		System.out.println("The price is:" + total3);

		return total3;

}
//@Override
//public static int iPhone6(int ramPrice,String ProcessorPrice, int cameraPrice,int chargerPrice) {
//	int total4=ramPrice+Integer.parseInt(ProcessorPrice)+cameraPrice+chargerPrice;
//		System.out.println("The price is:" + total4);
//	return total4;
//			
//}

/*
 * The static method iPhone6 can't override or implemented
 * because static is a local method of a class
 * So, static method can't be override, if we remove @override it will work as
 * static method of this ConfiguedIphone class
 */


//@Override
//public final int iPhone6(String ProcessorPrice,int ramPrice, int cameraPrice,int chargerPrice ) {
//	int total5=Integer.parseInt(ProcessorPrice)+ramPrice+cameraPrice+chargerPrice;
//			System.out.println("The price is:" + total5);
//	return total5;
			
			
//}

/*
 *final type method cannot be overridden 
 * can not override the final method from Iphone6 class
 */


	
	
	
	
	
	
	
	

}
