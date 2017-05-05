package projlabszkeleton;

import java.awt.*;

public class Kocsi implements Elem {

	protected Kocsi elotte;
	protected Kocsi mogotte;
	protected Color szin;
	protected int utasokSzama;
	protected boolean alagutAllapot;
	protected Sin sin;
	protected String id;
	
	
	/**
	 * Konstruktor
	 * @param utasokSzama Az adott kocsiban l�v� utasok sz�ma
	 * @param szin A kocsi sz�ne
	 * @param id A kocsi azonos�t�ja
	 */
	public Kocsi(int utasokSzama, Color szin, String id){
		this.utasokSzama = utasokSzama;
		this.szin = szin;
		elotte = null;
		mogotte = null;
		alagutAllapot = false;
		this.id=id;
	}
	
	
	@Override
	public void lep() throws EndGameException{
		//does nothing
	}

	@Override
	public Boolean akcio() {
		//does nothing
		return null;
	}

	/**
	 * Hozz�k�t egy kocsit az adott kocsihoz, el�sz�r el�re, majd h�tra.
	 * @param kocsi Az adott kocsihoz k�tend� kocsi.
	 */
	public void ad(Kocsi kocsi) {
		if(elotte != null)
			mogotte = kocsi;
		else
			elotte = kocsi;
	}

	/**
	 * Visszaadja egy adott kocsi sz�n�t.
	 * 
	 * @return Az adott kocsi sz�ne
	 */
	public Color szin() {
		return szin;
	}
	
	/**
	 * Hozz�rendel egy s�n elemet az adott kocsihoz.
	 * 
	 * @param sin A hozz�rendelend� s�n elem.
	 */
	public void ad(Sin sin) {
		this.sin = sin;
	}

	/**
	 * Visszaadja az adott kocsihoz rendelt s�nt.
	 * @return A s�n elemet amin �pp a kocsi �ll.
	 */
	public Sin sinem() {
		return sin;
	}

	/**
	 * Minden kocsi ami nem mozdony �gy l�p tov�bb arra a mez�re amire az el�tte
	 * �ll� kocsi k�ldi.
	 * 
	 * @param ide Az adott kocsi el�tt l�v� kocsi sine.
	 * 
	 * 
	 **/
	public void kocsilepj(Sin ide) throws EndGameException{	//ide: a kocsi el�tt l�v� s�n elem, ide l�ptetj�k az adott kocsit
		if(!alagutAllapot){
			sin.ad((Kocsi)null);
			if(mogotte != null){	//ha van m�g m�g�tte kocsi akkor azt r�l�ptetj�k az adott kocsi s�nj�re
				mogotte.kocsilepj(sin);
			}
			this.ad(ide);
			ide.ad(this);
		}
	}

	/**
	 * Be�ll�tja alagutAllapot-ot att�l f�gg�en, hogy a kocsi alagutban van-e.
	 * @param b true, amikor a kocsi bel�p alag�tba, false, ha kil�p onnan.
	 */
	public void alagutAllapot(boolean b) {
		alagutAllapot = b;
	}

	/**
	 * A magallo h�vja meg a kocsikon ha a sz�n megegyezik. A kocsi ekkor
	 * ellen�rzi, hogy az el�tte l�v� �sszes kocsi �res-e ha igen akkor null�ra �ll�tja
	 * az utasok sz�m�t.
	 * 
	 * @param le A meg�ll� ahova lesz�llnak az utasok
	 **/
	public void leszallas(Megallo le) {
		Kocsi next = elotte;
		
		while(next != null){
			if(!next.ures())
				return;
			next = next.elotte;
		}
		le.setUtasokszama(utasokSzama);
		setUtasokSzama(0);
	}

	/**
	 * Be�ll�tja az utasok sz�m�t az adott kocsiban.
	 * 
	 * @param utasokSzama Az utasok sz�m�nak leend� �rt�ke.
	 */
	public void setUtasokSzama(int utasokSzama) {
		this.utasokSzama = utasokSzama;
	}
	
	/**
	 * Visszat�r az adott kocsiban l�v� utasok sz�m�val.
	 * @return Az adott kocsiban l�v� utasok sz�ma.
	 */
	public int getUtasokSzama(){
		return utasokSzama;
	}

	/**
	 * Visszadja, hogy �res-e a kocsi vagy sem.
	 * @return true, ha az adott kocsi �res.
	 */
	public boolean ures() {
		if(utasokSzama == 0)
			return true;
		
		return false;
	}
	
	/**
	 * Visszat�r a kocsi azonos�t�j�val.
	 * @return A kocsi azonos�t�ja.
	 */
	public String getKocsibyID(){
		return id;
	}

}