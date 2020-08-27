public class WolfTest {
	public static void main(String[] args) {
		Wolf wolfOne = new Wolf();
		wolfOne.setNam("Polkan");
		System.out.println("name - " + wolfOne.getName());
		wolfOne.setSex("Male");
		System.out.println("sex - " + wolfOne.getSex());
		wolfOne.setColor("gray");
		System.out.println("color - " + wolfOne.getColor());
		wolfOne.setWeight(50f);
		System.out.println("weight - " + wolfOne.getWeight());
		wolfOne.setAge(7);
		System.out.println("age - " + wolfOne.getAge());

		wolfOne.sit();
		wolfOne.run();
		wolfOne.hunt();
		wolfOne.howl();
		wolfOne.go();
	}
}