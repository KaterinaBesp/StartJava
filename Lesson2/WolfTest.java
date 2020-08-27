public class WolfTest {
	public static void main(String[] args) {
		Wolf wolfOne = new Wolf();
		System.out.println("name - " + wolfOne.getName());
		System.out.println("sex - " + wolfOne.getSex());
		System.out.println("color - " + wolfOne.getColor());
		System.out.println("weight - " + wolfOne.getWeight());
		System.out.println("age - " + wolfOne.getAge());
		
		wolfOne.sit();
		wolfOne.run();
		wolfOne.hunt();
		wolfOne.howl();
		wolfOne.go();
	}
}