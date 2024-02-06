package PAP;

public class ArmstrongNumber {
	public void armstrong(int n) {
		{
			int s = n, c = 0;
			int store = n;
			while (s > 0) {
				s = s / 10;
				c++;
			}
			int sum = 0;
			while (n > 0) {
				int d = n % 10;
				sum = (int) (sum + Math.pow((double) d, (double) c));
				n = n / 10;
			}
			if (store == sum)
				System.out.println("true");
			else
				System.out.println("false");
		}
	}

}