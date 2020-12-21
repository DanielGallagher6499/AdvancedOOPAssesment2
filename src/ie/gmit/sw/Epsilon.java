package ie.gmit.sw;

/**
 * 
 * Epsilon is returning an integer input and the value of 0xFF000000
 * @author Daniel Gallagher - G00360986
 *
 *
 */
public class Epsilon extends Kappa{
	/**
	 * 
	 * @param i Integer value.
	 * @return i and the value of 0xFF000000
	 */
	public int epsilon(int i) {
		return i & 0xFF000000;
	}

	
	/**
	 * Prints the main method of Epsilon.
	 */
	@Override
	public void run(byte b) {
		System.out.println(epsilon((int)b));
	}
}
