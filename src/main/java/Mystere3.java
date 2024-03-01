public class Mystere3 {
	public static int mystere3(int pfX) {
		int r;

		r = 0;
		if (pfX == 0 || pfX == 1) {
			r = 1;
		} else {
			r = pfX * mystere3(pfX - 1);
		}
		return r;
	}

	public static void main(String[]  argv) {

		int val, res;

		val = 2;
		res = Mystere3.mystere3(val);
		System.out.println("Pour " + val + " : " + res);
		val = 5;
		res = Mystere3.mystere3(val);
		System.out.println("Pour " + val + " : " + res);
		val = 10;
		res = Mystere3.mystere3(val);
		System.out.println("Pour " + val + " : " + res);
	}
}