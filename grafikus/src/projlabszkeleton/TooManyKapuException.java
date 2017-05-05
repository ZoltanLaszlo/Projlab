package projlabszkeleton;

public class TooManyKapuException extends Exception {

	/**
	 * for eclipse reasons
	 */
	private static final long serialVersionUID = 1L;

	public String print(){
		return "Error: Nem epithetsz harmadik kaput";
	}
}
