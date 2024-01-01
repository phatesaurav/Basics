package prepinsta;

// Print the given string in reverse order
public class string_09 {

	public static void main(String[] args) {
		String s = "Prepinsta";
		method1(s);
		method2(s);
	}

	public static void method1(String s) {
		StringBuilder sb = new StringBuilder();
		sb.append(s);
		System.out.println("String is : " + sb);
		sb.reverse();
		System.out.println("Reversed string is : " + sb);
	}

	public static void method2(String s) {
		String rev = "";

		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		System.out.println(rev);
	}
}
