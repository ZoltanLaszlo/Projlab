package projlabszkeleton;

import java.awt.Color;

public class TeherKocsi extends Kocsi{
	
	/**
	 * Konstruktor
	 * @param szin Az adott teher kocsi színe.
	 * @param id Az adott teherkocsi azonosítója.
	 */
	public TeherKocsi(Color szin, String id){
		super(0, szin, id);
		elotte = null;
		mogotte = null;
		alagutAllapot = false;
	}
	
	/**
	 * Minden meghíváskor nullára állítja a teherkocsi utasainak számát.
	 */
	@Override
	public void setUtasokSzama(int utasokSzama){
		this.utasokSzama = 0;
	}

}