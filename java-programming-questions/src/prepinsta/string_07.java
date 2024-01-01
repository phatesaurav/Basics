package prepinsta;

// Remove the vowels from a String
public class string_07 {
	public static void main(String[] args) {

		String s = "prepinsta";
		String s1 = "";
		s1 = s.replaceAll("[aeiou]", "");
		System.out.println("String after removing vowel : " + s1);
	}
}
