package ie.gmit.sw;

/**
 * 
 * Delta is a singleton. Delta can create an instance of itself or return its current instance.
 *@author Daniel Gallagher - G00360986
 *
 *
 */

public class Delta extends Delegate{

	private static Delta singleton = new Delta();
	
	private Delta(){}

	/**
	 * Is returning the delta singleton.
	 * @return Instance of Delta
	 */
	public static Delta getInstance(){
		return singleton;
	}
}