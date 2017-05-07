package jian_zhi_offer.test11;

public class Power {

	public static void main(String args[]) {
		System.out.println(powerWithExponent(2, -3));
	}

	private static double powerWithExponent(double base, int exponent) {
		if (exponent == 0) {
			return 1;
		} else if (exponent < 0) {
			return 1.0 / powerWithUnsignedExponent(base, -exponent);
		} else {
			return powerWithUnsignedExponent(base, exponent);
		}
	}

	private static double powerWithUnsignedExponent(double base, int exponent) {
		if (exponent == 0) {
			return 1;
		}
		if (1 == exponent) {
			return base;
		}

		double result = powerWithUnsignedExponent(base, exponent >> 1);
		result *= result;

		if ((exponent & 0x1) == 1) {
			result *= base;
		}

		return result;
	}
	
}
