package gfg;

public class Print1ToNWithoutLoop_14 {

	public static void main(String[] args) {
		Print1ToNWithoutLoop_14 print1ToNWithoutLoop_14 = new Print1ToNWithoutLoop_14();
		print1ToNWithoutLoop_14.printNos(10);

	}

	public void printNos(int N) {
		int i = 1;
		printResult(i, N);

	}

	public void printResult(int i, int N) {
		if (i <= N) {
			System.out.print(i + " ");
			i++;
			printResult(i, N);
		}
	}

}
