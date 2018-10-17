public class RealNumber {
	private double val;
	public RealNumber(double value) {
		val = value;
	}
	public String toString() {
		return "" + val;
	}
	public double getValue() {
		return val;
	}
	public void changeValue(double nv) {
		val = nv;
	}
	public double add(RealNumber other) {
		return val + other.getValue();
	}
	public double multiply(RealNumber other) {
		return val * other.getValue();
	}
	public double divide(RealNumber other) {
		return val / other.getValue();
	}
	public double subtract(RealNumber other) {
		return val - other.getValue();
	}
}