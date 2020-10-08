public class Wolf {

	private String name;
	private String sex;
	private String color;
	private float weight;
	private int age;

	public String getName() {
		return name;
	}

	public void setNam(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}	

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}	

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
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