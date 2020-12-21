package ie.gmit.sw;

/**
 * 
 * Alpha contains status and gets the status.
 * Alpha extends Delegate.
 * @author Daniel Gallagher - G00360986
 *
 *
 */

public class Alpha extends Delegate{

	private Status status;
	
	/**
	 * Constructor for the Alpha Class
	 * @param status Status Enum
	 */
	
	public Alpha(Status status) {
		this.status = status;
	}
	
	/**
	 * Gets the status.
	 * @return status Returns status enum of alpha class.
	 */
	public Status getStatus() {
		return status;
	}
}