public class Driver {
	public static void main(String[] args) {
		RealNumber reala = new RealNumber(23.5);
		RealNumber realb = new RealNumber(11.75);
		RationalNumber rata = new RationalNumber(3, 4);
		RationalNumber ratb = new RationalNumber(12, 16);
		
		
		System.out.println(reala);
		System.out.println(rata);
		System.out.println(rata.equals(ratb));
		ratb.reduce();
		System.out.println(ratb);
		
	}
}