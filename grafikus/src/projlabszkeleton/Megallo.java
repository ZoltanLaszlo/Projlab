package projlabszkeleton;

import java.awt.*;

public class Megallo extends Sin{
	private Color szin;
	protected int utasokszama;
	
	/**
	 * Konstruktor ami egy id-vel l�tja el a sint, hogy tudjuk kezelni
	 *
	 * @param  nev  A nev amit adni akarunk a sinnek
	 * @param  szin  A meg�ll� sz�ne
	 * @param  utasokszama a meg�ll�n �ll� utasok sz�ma
	 */
	public Megallo(String nev, Color szin, int utasokszama){
		super(nev);
		this.szin=szin;
		this.utasokszama=utasokszama;
	}
	
	/**
	 * Amikor r�l�p a kocsi, ellen�rzi, hogy megegyeznek-e a szinek
	 * ha igen akkor kezdem�nyezi a lesz�ll�st a kocsin�l
	 * Persze az �tk�z�st neki is ellen�rizni kell
	 *
	 * @param  k  A kocsi referenci�ja amelyik r�l�p
	 */	
	@Override
	public void ad(Kocsi k) throws EndGameException{
		if(kocsi!=null && k!=null){
			throw new EndGameException(false);
		}
		else if(k != null){	//m�dos�t�s szimpla else-r�l
			kocsi=k;
			if(kocsi.szin().equals(this.szin)){
				if(kocsi.ures()){
					if(utasokszama!=0){
						kocsi.setUtasokSzama(utasokszama);
						this.utasokszama-=kocsi.utasokSzama;
					}
				}
				else{
					kocsi.leszallas(this);
				}
			}
		}else		//addition
			kocsi = k;
	}
	
	/**
	 * Be�ll�that� h�nyan legyenek a meg�ll�ban
	 *
	 * @param utasok A be�ll�tand� utasok sz�ma
	 */	
	public void setUtasokszama(int utasok){
	this.utasokszama+=utasok;	
	}
	public Color szin(){
		return this.szin;
	}
}
