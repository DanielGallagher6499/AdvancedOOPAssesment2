package ie.gmit.sw;

/**
 * 
 * Gamma is reversing an integer and returning it as a byte.
 * @author Daniel Gallagher - G00360986
 *
 *
 */

public class Gamma extends Kappa{
	/**
	 * Returning an integer reversed in byte format.
	 */
	public byte gamma(byte b) {
		return (byte) (Integer.reverse(b));
	}

	/**
	 * Prints the main method of Gamma.
	 */
	@Override
	public void run(byte b) {
		System.out.println(gamma(b));
	}
}