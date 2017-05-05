package projlabszkeleton;

public class EndGameException extends Exception {

	/**
	 * Az eclipse megnyugtatása végett
	 */
	private static final long serialVersionUID = 1L;

	private boolean nyert;
	

	/**
	 * Konstruktor beállítja a nyert paramétert
	 * 
	 * @param  be true ha nyert false, ha veszített a játékos
	 */
	public EndGameException(boolean be){
		this.nyert=be;
	}
	
	/**
	 * kezeléskor kiolvasható milyen exception történt
	 * 
	 * @return  true ha nyert false, ha veszített a játékos
	 */
	public boolean result(){
		return nyert;
	}
}
