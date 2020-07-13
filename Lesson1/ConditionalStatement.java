public class ConditionalStatement  {	
    public static void main(String[] args) {
 int Age = 25;
if (Age > 20) {
System.out.println( Age + "- The age of a person older than 20 years" );
}
else if (Age < 20) {
System.out.println( Age + "- The age of a person under 20 years old" ); 
}

String Sex1 = "male";
if (Sex1 == "male") {
System.out.println( Sex1 + "- The man" );
}
if (Sex1 == "Female") {
System.out.println( Sex1 + "- The women" );
}

String Sex2 = "Female";
if (Sex2 == "male") {
System.out.println( Sex2 + "- The man" );
}
if (Sex2 == "Female") {
System.out.println( Sex2 + "- The women" );
}
/*String Name1 = "Maxim"
String Name2 = "Ivan"
String Name3 = "Olga"*/
    }
}       		