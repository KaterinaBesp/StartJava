public class Wolf{

	String name = "Polkan";
	String sex = "Male";
	String color = "gray";
	float weight = 50f;
	int age = 7;

	boolean run () {
		System.out.println("The wolf is running");
		return true;
	}

	void sit () {
		System.out.println("The wolf is sit down");
	}

	String hunt () {
		return "The wolf is hunt";
	}

	void howl () {
	}
	
	void go () {
		System.out.println("The wolf goes");
	}
}	