public class Main {

	
	// The variables present within a class is called member fields
	public int number = 10;
	public static int num = 10;
	
	// member methods
	public static void main(String[] args) {
		System.out.println("Sairam");
		Main.methodStatic("Called Through Class Name");
		Main main = new Main();
		Main mainOne = new Main();
		main.method1();
		mainOne.method1();
		// This invocation is through the class Main and not its object.
		Main.methodStatic("main, " + main.hashCode());
		// This invocation is through the object of the class Main.
		mainOne.methodStatic("main, " + mainOne.hashCode());
	}
	
	public void method1() {
		System.out.println("Sairam, method1()");
		this.number = 20;
		Main.num = Main.num + 1;
		System.out.println(Main.num);
	}

	public static void methodStatic(String string) {
		System.out.println("Sairam, methodStatic() : " + string);
		Main.num = Main.num + 1;
		System.out.println(Main.num);
	}

}
