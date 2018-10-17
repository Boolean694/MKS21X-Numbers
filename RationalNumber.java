public class RationalNumber extends RealNumber {
	private int numr;
	private int denomr;
	public RationalNumber(int n, int d) {
		super(n / d);
		numr = n;
		denomr = d;
	}
	public String toString() {
		return "Ratio = " + numr + " / " + denomr;
	}
	public int getNumerator() {
		return numr;
	}
	public int getDenominator() {
		return denomr;
	}
	public double getValue() {
		return numr / denomr;
	}
	public void changeNumr(int nn) {
		numr = nn;
	}
	public void changeDenomr(int nd) {
		denomr = nd;
	}
	public RationalNumber reciprocal() {
		RationalNumber b = new RationalNumber(denomr, numr);
		return b;
	}
	public boolean equals(RationalNumber other) {
		return this.getValue == other.getValue;
	}
	
	private static int gcd(int a, int b) {
		if(a == 1 || b == 1 || a == 0 || b == 0){return 1;}
		if(a == b){return a;}
		if(a > b) {
			int dd = a;
			int ds = b;
			int ph = 0;
			while(a % b != 0) {
				ph = b;
				b = a % b;
				a = ph;
			}
			return b;
		}
		if(a < b) {
			int dd = b;
			int ds = a;
			int ph = 0;
			while(b % a != 0) {
				ph = a;
				a = b % a;
				b = ph;
			}
			return a;
		}
	}
	
	public void reduce() {
		numr = numr / gcd(numr, denomr);
		denomr = denomr / gcd(numr, denomr);
	}
}