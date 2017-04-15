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
	 * @param utasokSzama Az adott kocsiban lévő utasok száma
	 * @param szin A kocsi színe
	 * @param id A kocsi azonosítója
	 */
	public Kocsi(int utasokSzama, Color szin, String id){
		this.utasokSzama = utasokSzama;
		this.szin = szin;
		elotte = null;
		mogotte = null;
		alagutAllapot = false;
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
	 * Hozzáköt egy kocsit az adott kocsihoz, először előre, majd hátra.
	 * @param kocsi Az adott kocsihoz kötendő kocsi.
	 */
	public void ad(Kocsi kocsi) {
		if(elotte != null)
			mogotte = kocsi;
		else
			elotte = kocsi;
	}

	/**
	 * Visszaadja egy adott kocsi színét.
	 * 
	 * @return Az adott kocsi színe
	 */
	public Color szin() {
		return szin;
	}
	
	/**
	 * Hozzárendel egy sín elemet az adott kocsihoz.
	 * 
	 * @param sin A hozzárendelendő sín elem.
	 */
	public void ad(Sin sin) {
		this.sin = sin;
	}

	/**
	 * Visszaadja az adott kocsihoz rendelt sínt.
	 * @return A sín elemet amin épp a kocsi áll.
	 */
	public Sin sinem() {
		return sin;
	}

	/**
	 * Minden kocsi ami nem mozdony így lép tovább arra a mezőre amire az előtte
	 * álló kocsi küldi.
	 * 
	 * @param ide Az adott kocsi előtt lévő kocsi sine.
	 * 
	 * 
	 **/
	public void kocsilepj(Sin ide) throws EndGameException{	//ide: a kocsi előtt lévő sín elem, ide léptetjük az adott kocsit
		if(!alagutAllapot){
			sin.ad((Kocsi)null);
			if(mogotte != null){	//ha van még mögötte kocsi akkor azt ráléptetjük az adott kocsi sínjére
				mogotte.kocsilepj(sin);
			}
			this.ad(ide);
			ide.ad(this);
		}
	}

	/**
	 * Beállítja alagutAllapot-ot attól függően, hogy a kocsi alagutban van-e.
	 * @param b true, amikor a kocsi belép alagútba, false, ha kilép onnan.
	 */
	public void alagutAllapot(boolean b) {
		alagutAllapot = b;
	}

	/**
	 * A magallo hívja meg a kocsikon ha a szín megegyezik. A kocsi ekkor
	 * ellenőrzi, hogy az előtte lévő összes kocsi üres-e ha igen akkor nullára állítja
	 * az utasok számát.
	 * 
	 **/
	public void leszallas() {
		Kocsi next = elotte;
		
		while(next != null){
			if(!next.ures())
				return;
			next = next.elotte;
		}
		
		setUtasokSzama(0);
	}

	/**
	 * Beállítja az utasok számát az adott kocsiban.
	 * 
	 * @param utasokSzama Az utasok számának leendő értéke.
	 */
	public void setUtasokSzama(int utasokSzama) {
		this.utasokSzama = utasokSzama;
	}
	
	/**
	 * Visszatér az adott kocsiban lévő utasok számával.
	 * @return Az adott kocsiban lévő utasok száma.
	 */
	public int getUtasokSzama(){
		return utasokSzama;
	}

	/**
	 * Visszadja, hogy üres-e a kocsi vagy sem.
	 * @return true, ha az adott kocsi üres.
	 */
	public boolean ures() {
		if(utasokSzama == 0)
			return true;
		
		return false;
	}
	
	/**
	 * Visszatér a kocsi azonosítójával.
	 * @return A kocsi azonosítója.
	 */
	public String getKocsibyID(){
		return id;
	}

}
