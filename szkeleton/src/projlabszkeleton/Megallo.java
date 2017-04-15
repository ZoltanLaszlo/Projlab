package projlabszkeleton;

import java.awt.*;

public class Megallo extends Sin{
	private Color szin;
	private int utasokszama;
	
	/**
	 * Konstruktor ami egy id-vel látja el a sint, hogy tudjuk kezelni
	 *
	 * @param  nev  A nev amit adni akarunk a sinnek
	 * @param  szin  A megálló színe
	 * @param  utasokszama a megállón álló utasok száma
	 */
	public Megallo(String nev, Color szin, int utasokszama){
		super(nev);
		this.szin=szin;
		this.utasokszama=utasokszama;
	}
	
	/**
	 * Amikor rálép a kocsi, ellenõrzi, hogy megegyeznek-e a szinek
	 * ha igen akkor kezdeményezi a leszállást a kocsinál
	 * Persze az ütközést neki is ellenõrizni kell
	 *
	 * @param  k  A kocsi referenciája amelyik rálép
	 */	
	@Override
	public void ad(Kocsi k) throws EndGameException{
		if(kocsi!=null && k!=null){
			throw new EndGameException(false);
		}
		else {
			kocsi=k;
			if(kocsi.szin().equals(this.szin)){
				if(kocsi.ures()){
					if(utasokszama!=0){
						kocsi.setUtasokSzama(utasokszama);
					}
				}
				else{
					kocsi.leszallas();
				}
			}
		}
	}
	/**
	 * Beállítható hányan legyenek a megállóban
	 *
	 * @param utasok A beállítandó utasok száma
	 */	
	public void setUtasokszama(int utasok){
	this.utasokszama=utasok;	
	}
}
