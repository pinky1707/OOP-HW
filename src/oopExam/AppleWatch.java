
package oopExam;

/*
 * An abstract class is a superclass
 * Contains both abstract & non abstract methods
 * "Implements" & "extends" keywords are used for inheritance
 * By "extends"keyword an abstract class can inherit only one regular class or one abstract class
 * Abstract class cannot inherit an interface by "extends" keyword
 * "implements" keyword is used to inherit Interface in abstract class
 * An abstract class can inherit more than one interface by"implements"keyword
 * An abstract class can not be instantiated(can not create a object)
  */

public abstract class AppleWatch extends AppleWatchSeries5 implements Watch, DigitalWatch {

	public int price = 132;

	public AppleWatch() {
		System.out.println("This is a default contructor of abstract class AppleWatch");
		// AppleWatch obj = new AppleWatch();

	}

	/*
	 * yes we can create a variable and constructor inside Abstract Class No we can
	 * not instantiate it
	 */
	public void abstractClassInfo() {
		System.out.println("This is a non abstract method");

	}

	public abstract void appleWatchInfo();

	/*
	 * abstract method appleWatchInfo created 
	 * we can also create static method and return type method
	 */

//	public static void appleWatch() {
//		System.out.println("This is a static method");
//
//		}
//	public static int appleWatchPrice() {
//		return 0;
//	}

}
