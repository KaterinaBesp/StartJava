public class WolfTest{
	public static void main(String[] args) {
		Wolf wolfOne = new Wolf();
		System.out.println("age - " + wolfOne.age);
		System.out.println("name -" + wolfOne.name);
		System.out.println("name - " + wolfOne.color);
		System.out.println(wolfOne.run());
		wolfOne.sit();
		wolfOne.hunt();
	}
}