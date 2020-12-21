package ie.gmit.sw;


/**
 * 
 * Zeta is returning an integer input to the value of 0xFF000000
 * @author Daniel Gallagher - G00360986
 *
 *
 */

public class Zeta extends Kappa{
	/**
	 * This is the main method of Zeta.
	 * @param i is an integer value.
	 * @return i and 0x000000FF
	 */
	public int zeta(int i) {
		return i & 0x000000FF;
	}

	/**
	 * Prints out the result of Zeta.
	 */
	@Override
	public void run(byte b) {
		System.out.println(zeta((int)b));
	}
}