package benison;

// program that proves strings are immutable
public class question_04 {
	public static void main(String[] args) {
		String string1 = "hello";
		String string2 = string1.concat(" world!");
		System.out.println(string1);
		System.out.println(string2);
	}
}
