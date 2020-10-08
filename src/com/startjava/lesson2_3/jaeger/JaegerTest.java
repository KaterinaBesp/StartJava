package com.startjava.lesson2_3.jaeger;

public class JaegerTest {
	public static void main(String[] args) {
		Jaeger jaeger1 = new Jaeger();
		jaeger1.setModelName("Bracer Phoenix");
		jaeger1.setMark("Mark-5");
		jaeger1.setHeight(70.7f);
		jaeger1.setWeight(2.1f);
		jaeger1.setSpeed(3);
		jaeger1.setStrength(8);
		jaeger1.setArmor(6);

		Jaeger jaeger2 = new Jaeger();
		jaeger2.setModelName("Gipsy Avenger");
		jaeger2.setMark("Mark-5");
		jaeger2.setHeight(81.77f);
		jaeger2.setWeight(2.004f);
		jaeger2.setSpeed(5);
		jaeger2.setStrength(7);
		jaeger2.setArmor(5);

		System.out.println("The first jaeger name - " + jaeger1.getModelName());
		System.out.println("The second jaeger name - " + jaeger2.getModelName());
		System.out.println("Mark of the first jaeger - " + jaeger1.getMark());
		System.out.println("Mark of the second jaeger - " + jaeger2.getMark());
		System.out.println("Height of the first jaeger - " + jaeger1.getHeight());
		System.out.println("Height of the second jaeger - " + jaeger2.getHeight());
		System.out.println("Weight of the first jaeger - " + jaeger1.getWeight());
		System.out.println("Weight of the second jaeger - " + jaeger2.getWeight());
		System.out.println("Speed of the first jaeger - " + jaeger1.getSpeed());
		System.out.println("Speed of the second jaeger - " + jaeger2.getSpeed());
		System.out.println("Strength of the first jaeger - " + jaeger1.getStrength());
		System.out.println("Strength of the second jaeger - " + jaeger2.getStrength());
		System.out.println("Armor of the first jaeger - " + jaeger1.getArmor());
		System.out.println("Armor of the second jaeger - " + jaeger2.getArmor());
		jaeger1.move();
		jaeger2.run();
		jaeger1.takeGun();
		jaeger2.Fight();
	}
}