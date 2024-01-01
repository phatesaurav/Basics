package prepinsta;

// Remove brackets from an algebraic expression
public class string_12 {
	public static void main(String[] args) {
		String s = "(a+b)=c";
		String result = s.replaceAll("[(){}]", "");
		System.out.println("Expression without brackets : " + result);
	}
}
