public class RationalNumber extends RealNumber {
	private int numr;
	private int denomr;
	public RationalNumber(int n, int d) {
		super(0.0);
		if(d == 0) {
			numr = 0;
			denomr = 1;
		}
		else {
			numr = n;
			denomr = d;
		}
	}
	public String toString() {
		return "" + numr + " / " + denomr;
	}
	private static int gcd(int a, int b) {
		if(a == 1 || b == 1 || a == 0 || b == 0){return 1;}
		if(a == b){return a;}
		if(a > b) {
			int dd = Math.abs(a);
			int ds = Math.abs(b);
			int ph = 0;
			while(a % b != 0) {
				ph = b;
				b = a % b;
				a = ph;
			}
			return b;
		}
		if(a < b) {
			int dd = Math.abs(b);
			int ds = Math.abs(a);
			int ph = 0;
			while(b % a != 0) {
				ph = a;
				a = b % a;
				b = ph;
			}
			return a;
		}
		else{return 0;}
	}
	
	public void reduce() {
		int np = numr;
		int dp = denomr;
		numr = np / gcd(np, dp);
		denomr = dp / gcd(np, dp);
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
		RationalNumber b;
		if(numr == 0){b = new RationalNumber(0,1);}
		b = new RationalNumber(denomr, numr);
		return b;
	}
	public boolean equals(RationalNumber other) {
		return this.getValue() == other.getValue();
	}
	
	
}