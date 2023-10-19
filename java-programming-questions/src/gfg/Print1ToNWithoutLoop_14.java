package gfg;

public class Print1ToNWithoutLoop_14 {

	public static void main(String[] args) {
		Print1ToNWithoutLoop_14 refVar = new Print1ToNWithoutLoop_14();
		refVar.printNos(25);

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
