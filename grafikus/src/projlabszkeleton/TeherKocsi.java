package projlabszkeleton;

import java.awt.Color;

public class TeherKocsi extends Kocsi{
	
	/**
	 * Konstruktor
	 * @param szin Az adott teher kocsi sz�ne.
	 * @param id Az adott teherkocsi azonos�t�ja.
	 */
	public TeherKocsi(Color szin, String id){
		super(0, szin, id);
		elotte = null;
		mogotte = null;
		alagutAllapot = false;
	}
	
	/**
	 * Minden megh�v�skor null�ra �ll�tja a teherkocsi utasainak sz�m�t.
	 */
	@Override
	public void setUtasokSzama(int utasokSzama){
		this.utasokSzama = 0;
	}

}