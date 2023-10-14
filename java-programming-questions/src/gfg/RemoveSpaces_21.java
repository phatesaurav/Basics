package gfg;

public class RemoveSpaces_21 {
	public static void main(String[] args) {
		RemoveSpaces_21 obj = new RemoveSpaces_21();
		System.out.println(obj.modify("geeks  for geeks"));
	}

	String modify(String S) {
		return S.replaceAll("\\s", "");
	}
}
