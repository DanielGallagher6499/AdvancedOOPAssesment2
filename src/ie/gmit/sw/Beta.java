package ie.gmit.sw;

/**
 * 
 * Beta is returning a byte input to the value of ^ 0xFFFFFFFF
 * Beta extends Kappa.
 * @author Daniel Gallagher - G00360986
 *
 *
 */

public class Beta extends Kappa{ 
	/**
	 * The action method of Beta
	 * @param b Byte value.
	 * @return (byte) (i ^ 0xFFFFFFFF)
	 */
	public byte beta(byte b)  {
		int i = b;
		return (byte) (i ^ 0xFFFFFFFF);
	}

	/**
	 * Prints the return value of beta().
	 */
	@Override
	public void run(byte b) {
		System.out.println(beta(b));
	}
}