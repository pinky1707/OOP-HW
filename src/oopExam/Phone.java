package oopExam;

/*
 * Interface\tIs a BluePrint of class
 *An Interface is a collection of methods that are defined(declared) but not implemented
 *contains only abstract methods
 *also contain default and static method(non-abstract) from Java version 1.8
 *An Interface can inherit multiple Interfaces by "extends" keyword\nImplements keyword cannot use in interface
 *An Interface can not inherit a regular class or Abstract class
 * Interface cannot be instantiated
 */

public interface Phone extends Pager, Wakitoki {
	public String username = "Pinky Saha";
//	public Phone() {
//		
//	}
	/*
	 * variable created & we can not create a constructor inside an interface because
	 * An Interface can not have a constructor
	 */

	public void interfaceInfo();

	public void call();

	public void message();

	public void camera();

	public default void battery() {
		System.out.println("battery is a default method of Phone from Java version 1.8");

	}

	public static void wireless() {
		System.out.println("wireless is a static method of Phone from Java version 1.8");
	}

}
