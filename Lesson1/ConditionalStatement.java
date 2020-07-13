public class ConditionalStatement  {	
	public static void main(String[] args) {
		//ЕСЛИ(возраст > 20) {выведите какое-то сообщение}
		int age = 25;
		if (age > 20) {
		System.out.println(age + "- the age of a person older than 20 years");
		}
		else if (age < 20) {
		System.out.println(age + "- the age of a person under 20 years old"); 
		}

		//ЕСЛИ(мужскойПол) {выведите какое-то сообщение}
		String sex1 = "male";
		if (sex1 == "male") {
		System.out.println(sex1 + "- the man");
		}
		else if (sex1 == "Female") {
		System.out.println(sex1 + "- the women");
		}

		//ЕСЛИ(неМужскойПол) {выведите какое-то сообщение}
		String sex2 = "female";
		if (sex2 == "male") {
		System.out.println(sex2 + "- the man");
		}
		else if (sex2 != "male") {
		System.out.println(sex2 + "- the women");
		}

		/*ЕСЛИ(рост < 1.80) {выведите какое-то сообщение} 
		ИНАЧЕ {выведите какое-то сообщение}*/
		float height1 = 1.70f;
		if (height1 < 1.80f) {
		System.out.println(height1 + "- the average human height");
		}
		else {
		System.out.println(height1 + "- other");
		}

		/*ЕСЛИ(перваяБукваИмени == ‘M’) {выведите какое-то сообщение}
		} ИНАЧЕ ЕСЛИ(перваяБукваИмени == ‘I’) 
		{выведите какое-то сообщение} 
		ИНАЧЕ {выведите какое-то сообщение}*/
		String firstLetterName1 = "M";
		if (firstLetterName1 == "M") {
		System.out.println(firstLetterName1 + "-the first letter of the name M");
		}
		else if (firstLetterName1 == "I") {
		System.out.println(firstLetterName1 + "-the first letter of the name I");
		}
		else {
		System.out.println(firstLetterName1 + "- other");
		}

		String firstLetterName2 = "I";
		if (firstLetterName2 == "M") {
		System.out.println(firstLetterName2 + "-the first letter of the name M");
		}
		else if (firstLetterName2 == "I") {
		System.out.println(firstLetterName2 + "-the first letter of the name I");
		}
		else {
		System.out.println(firstLetterName2 + "- other");
		}

		String firstLetterName3 = "O";
		if (firstLetterName3 == "M") {
		System.out.println(firstLetterName3 + "-the first letter of the name M");
		}
		else if (firstLetterName3 == "I") {
		System.out.println(firstLetterName3 + "-the first letter of the name I");
		}
		else {
		System.out.println(firstLetterName3 + "- other");
		}
	}
}	