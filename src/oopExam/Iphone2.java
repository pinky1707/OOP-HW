package oopExam;

public class Iphone2 extends Iphone1 {
	public char userOfIphone2 = 'F';

	public Iphone2() {
		super();
		super.getInfo();
		super.color = "Grey";
		System.out.println("The Iphone2 color is : " + color);
		System.out.println("This is a default constructor of Iphone2");

	}

	public Iphone2(char userOfIphone2) {
		System.out.println("This is a parameterized constructor of Iphone2 ");
	}

	public void iphone2Info() {
		System.out.println("This a void type method of Iphone2");

	}

	public void iphone2Info(char userOfIphone2) {
		System.out.println("This is a parameterized method of Iphone2");
	}

	public void dropbox() {
		System.out.println("In dropbox you can store and share files");

	}

}
