package hello;

public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("The current local time is: ");
		Greeter greeter = new Greeter();
		System.out.println(greeter.sayHello());

		String inputPath;
		for (int i = 0; i < args.length; i++) {
			switch (i) {
				case 0:
					inputPath = args[0];
					break;
			}
		}
	}
}
