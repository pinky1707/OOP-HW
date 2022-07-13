package oopExam;

/*
 * Class is a blueprint from which individual objects are created
 * "Implements" & "extends" keywords are used for inheritance
 * By "extends"keyword a regular class can inherit only one regular class or one abstract class
 * a regular cannot inherit an interface by "extends" keyword
 * "implements" keyword is used to inherit Interface in regular class
 * a regular class can inherit more than one interface by"implements"keyword
 * a regular class cannot inherit a regular class or abstract class by "implements"keyword
 */

public class Iphone1 extends AppleWatch implements Phone {

	private String Info;
	private int price;
	private char user;
	private boolean madeInUSA;
	public String color;

	public Iphone1() {
		System.out.println("This is the default constructor of Iphone1");

	}

	public Iphone1(String name, String Info, int price, char user, boolean madeInUSA) {
		System.out.println("This is the parameterized constructor of Iphone1");

	}

	public String getInfo() {
		return Info;
	}

	public void setInfo(String info) {
		Info = info;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public char getUser() {
		return user;
	}

	public void setUser(char user) {
		this.user = user;
	}

	public boolean isMadeInUSA() {
		return madeInUSA;
	}

	public void setMadeInUSA(boolean madeInUSA) {
		this.madeInUSA = madeInUSA;
	}

	@Override
	public void wakitokiInfo() {
		// TODO Auto-generated method stub

	}

	@Override
	public void watchInfo() {
		// TODO Auto-generated method stub

	}

	@Override
	public void digitalwatchInfo() {
		// TODO Auto-generated method stub

	}

	@Override
	public void interfaceInfo() {
		// TODO Auto-generated method stub

	}

	@Override
	public void call() {
		// TODO Auto-generated method stub

	}

	@Override
	public void message() {
		// TODO Auto-generated method stub

	}

	@Override
	public void camera() {
		// TODO Auto-generated method stub

	}

	@Override
	public void appleWatchInfo() {
		// TODO Auto-generated method stub

	}

	@Override
	public void abstractClassInfo() {
		System.out.println("This is a non abstract method");

	}

	@Override
	public void pagerInfo() {
		// TODO Auto-generated method stub

	}

	public void regulaClassInfo() {
		System.out.println("A regular class can instantiated." + "\nAbstract class & Interface cannot be instantiated "
				+ "They need help of concreate class(regular class) to instantiated"
				+ "\nContains only non-abstract methods"
				+ "\nextends and implements keywords are used for inheritance");
	}

	public void youtube() {
		System.out.println("American online vedio & social media platform");
	}

}
