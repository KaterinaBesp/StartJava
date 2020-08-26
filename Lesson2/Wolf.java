public class Wolf{

	private String name = "Polkan";
	private String sex = "Male";
	private String color = "gray";
	private float weight = 50f;
	private int age = 7;

	public String getName() {
		return name;
	}

	void setNam (String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	void setSex (String sex) {
		this.sex = sex;
	}	

	public String getColor() {
		return color;
	}

	void setColor(String color) {
		this.color = color;
	}	

	public float getWeight() {
		return weight;
	}

	void setWeight(float weight) {
		this.weight = weight;
	}

	public int getAge() {
		return age;
	}

	void setAge(int age) {
		if (age > 8) {
			System.out.println("Incorrect age");
		} else {
		this.age = age;
		}
		
	}

	public boolean run() {
		System.out.println("The wolf is running");
		return true;
	}

	public void sit() {
		System.out.println("The wolf is sit down");
	}

	public String hunt() {
		return "The wolf is hunt";
	}

	public void howl() {
	}
	
	public void go() {
		System.out.println("The wolf goes");
	}
}	