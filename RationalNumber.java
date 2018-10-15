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
	public int getNumr() {
		return numr;
	}
	public int getDenomr() {
		return denomr;
	}
	public double getVal() {
		return numr / denomr;
	}
	public void changeNumr(int nn) {
		numr = nn;
	}
	public void changeDenomr(int nd) {
		denomr = nd;
	}
}