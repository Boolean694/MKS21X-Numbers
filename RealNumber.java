public class RealNumber {
	private double val;
	public RealNumber(double value) {
		val = value;
	}
	public String toString() {
		return "Value = " + val;
	}
	public double getVal() {
		return val;
	}
	public void changeVal(double nv) {
		val = nv;
	}
}