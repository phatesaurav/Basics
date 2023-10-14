package gfg;

public class CompeteTheSkills_7 {

	static int ca;
	static int cb;
	static long A[] = {4, 2, 7};
	static long B[] = {5, 6, 3};

	public static void main(String[] args) {
		scores(A, B);
		System.out.println(ca + " " + cb);
	}

	public static void scores(long a[], long b[]) {
		CompeteTheSkills_7.ca = 0;
		CompeteTheSkills_7.cb = 0;
		for (int i = 0; i < 3; i++) {
			if (a[i] > b[i])
				CompeteTheSkills_7.ca++;
			if (a[i] < b[i]) {
				CompeteTheSkills_7.cb++;
			}
		}
	}
}
