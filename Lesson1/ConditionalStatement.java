public class ConditionalStatement  {	
	public static void main(String[] args) {
		//TODO: ЕСЛИ(возраст > 20) {выведите какое-то сообщение}
		int age = 25;
		if (age > 20) {
			System.out.println(age + "- возраст человека старше 20 лет");
		}

		//TODO: ЕСЛИ(мужскойПол) {выведите какое-то сообщение} ЕСЛИ(неМужскойПол) { выведите какое-то сообщение}
		String sex = "мужскойПол";
		boolean isMen = sex == "мужскойПол";
		if (isMen) {
			System.out.println(sex + "- выражение истино");
		} if (!isMen) {
			System.out.println(sex + "- ошибка");
		}

		//TODO: ЕСЛИ(рост < 1.80) {выведите какое-то сообщение} ИНАЧЕ { выведите какое-то сообщение}
		float height = 1.70f;
		if (height < 1.80f) {
			System.out.println(height + "- рост человека ниже 1.80");
		} else {
			System.out.println(height + "- рост человека ниже 1.80");
		}

		//TODO: ЕСЛИ(перваяБукваИмени == ‘M’) { выведите какое-то сообщение} ИНАЧЕ ЕСЛИ(перваяБукваИмени == ‘I’) { выведите какое-то сообщение} ИНАЧЕ {выведите какое-то сообщение}
		String firstLetterName = "M";
		if (firstLetterName == "M") {
			System.out.println(firstLetterName + "-первая буква имени M");
		} else if (firstLetterName == "I") {
			System.out.println(firstLetterName + "-первая буква имени I");
		} else {
			System.out.println(firstLetterName + "- первая буква имени отличная от M и I");
		}
	}
}	