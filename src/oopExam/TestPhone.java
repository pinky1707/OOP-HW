package oopExam;

public class TestPhone {

	public static void main(String[] args) {
		System.out.println(" \n<....Regular class Iphone1 instantiated and call all the possible methods...>\n");
		Iphone1 obj = new Iphone1();
		obj.setInfo("I bought This phone in 2000");
		obj.setPrice(750);
		obj.setUser('F');
		obj.setMadeInUSA(false);
		System.out.println("Brand Name:" + obj.getInfo() + "Phone price:" + obj.getPrice() + "Phone user: "
				+ obj.getUser() + "Is it made in USA? Ans:" + obj.isMadeInUSA());

		obj.abstractClassInfo();
		obj.appleWatchInfo();
		obj.battery();
		obj.call();
		obj.camera();
		obj.digitalwatchInfo();
		obj.wakitokiInfo();
		obj.message();
		obj.pagerInfo();
		obj.watchInfo();
		obj.youtube();
		obj.regulaClassInfo();

		System.out.println(
				"\n<...........Abstract class AppleWatch instantiated & call all the possible methods........>\n");
		AppleWatch aplWatch = new Iphone1();// an abstract class cannot instantiated its need help from concrete class
		aplWatch.abstractClassInfo();
		aplWatch.appleWatchInfo();
		aplWatch.digitalwatchInfo();
		aplWatch.watchInfo();

		System.out.println("\n<.......Interface Phone instantiated & call all the possible methods......>\n");
		Phone phn = new Iphone1();// an interface cannot instantiated its need help from concrete class
		phn.battery();
		phn.call();
		phn.camera();
		phn.interfaceInfo();
		phn.message();
		phn.wakitokiInfo();

		System.out.println("\n<............Iphone6 instantiated and call all the possible methods........>\n");
		Iphone6 obj1 = new Iphone6();
		obj1.setInfo(null);
		obj1.setMadeInUSA(false);
		obj1.getPrice();
		obj1.getInfo();
		obj1.isMadeInUSA();
		obj1.camera();
		obj1.appleWatchInfo();
		obj1.call();
		obj1.message();
		obj1.digitalwatchInfo();
		obj1.getUser();
		obj1.iphone2Info();
		obj1.wakitokiInfo();
		obj1.watchInfo();
		obj1.interfaceInfo();
		obj1.pagerInfo();
		obj1.youtube();
		obj1.regulaClassInfo();
		obj1.dropbox();
		obj1.abstractClassInfo();
		obj1.iphone2Info();// 2
		obj1.photo();// 4
		obj1.email();// 5
		obj1.battery();// phone

		System.out.println("\n<........Calling methods from Iphone6 class.......\n");
		obj1.compass();//void type method initialized
		obj1.iPhone6(175, 150);//return type parameterized	method-1 initialized
		obj1.iPhone6(150, "140");//void type parameterized method initialized
		Iphone6.iPhone6(175, "140", 150, 50);// static method initialized
		obj1.iPhone6("140", 175, 150, 50);//return type parameterized	method-2 initialized
		obj1.iPhone6( "140",175,150,50);//final type method initialized

		System.out.println("\n<....Calling methods from ConfiguredIphone6.....>\n");
		ConfiguredIphone6 obj2 = new ConfiguredIphone6();
		obj2.iPhone6(175, 150);//return type parameterized	method-1 initialized
		obj2.iPhone6(150, "140");//void type parameterized method initialized
		obj2.iPhone6(175, 150, "140", 50);//return type parameterized	method-2 initialized
		obj2.compass();//void type method initialized

		/*
		 * here line 47 to line no.67 multilevel inheritance because we call the
		 * methods from Iphone1,Iphone2 and Iphone4. obj1.email(); single inheritance
		 * because Iphone6 object call this method from Iphone5 Iphone6 extends Iphone5
		 * (only one level)-single inheritance
		 * 
		 * Instantiate Iphone6 in TestPhone and show how many methods they can call in
		 * TestPhone. [points: 70] . Comment out at the end of TestPhone to inform me
		 * which is hierarchical inheritance, multilevel inheritance, and single
		 * 
		 */

	}

}
