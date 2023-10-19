package iprogrammer;

public class CheckIf4PointsFormSquare_2 {

	public static void main(String[] args) {
		point a = new point(0, 0);
		point b = new point(1, 0);
		point c = new point(1, 1);
		point d = new point(0, 1);

		System.out.println("Is square? " + checkSquare(a, b, c, d));
	}

	public static boolean checkSquare(point a, point b, point c, point d) {
		double distance1 = findDistance(a, b);
		double distance2 = findDistance(b, c);
		double distance3 = findDistance(c, d);
		double distance4 = findDistance(a, d);

		if (distance1 == distance2 && distance2 == distance3 && distance3 == distance4 && distance1 == distance4)
			return true;
		return false;
	}

	public static double findDistance(point d1, point d2) {
		return Math.sqrt(((d2.x - d1.x) * (d2.x - d1.x)) + ((d2.y - d1.y) * (d2.y - d1.y)));
	}

}

class point {
	double x;
	double y;

	public point(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

}