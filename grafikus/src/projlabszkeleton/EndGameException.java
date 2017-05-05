package projlabszkeleton;

public class EndGameException extends Exception {

	/**
	 * Az eclipse megnyugtat�sa v�gett
	 */
	private static final long serialVersionUID = 1L;

	private boolean nyert;
	

	/**
	 * Konstruktor be�ll�tja a nyert param�tert
	 * 
	 * @param  be true ha nyert false, ha vesz�tett a j�t�kos
	 */
	public EndGameException(boolean be){
		this.nyert=be;
	}
	
	/**
	 * kezel�skor kiolvashat� milyen exception t�rt�nt
	 * 
	 * @return  true ha nyert false, ha vesz�tett a j�t�kos
	 */
	public boolean result(){
		return nyert;
	}
}
