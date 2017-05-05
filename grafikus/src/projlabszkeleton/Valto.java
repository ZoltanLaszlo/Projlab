package projlabszkeleton;

public class Valto extends Sin {
	private Sin sin3;
	private boolean allas=false;
	
	/**
	 * Konstruktor ami egy id-vel l�tja el a sint, hogy tudjuk kezelni
	 *
	 * @param  nev  A nev amit adni akarunk a sinnek
	 */
	public Valto(String nev){
		super(nev);
	}
	
	/**
	 * Hozz�adja a v�lt�hoz a szomsz�dait,
	 * Els� h�v�sra az elozo nevu attributum�ba rakja
	 * M�sodik h�v�sra a kovetkezo nev�be rakja
	 * 3. h�v�sra a sin3 nev�be rakja
	 * Minden tov�bbi h�v�sra nem csin�l semmit
	 * a valt� allasat�l f�gg�en elozo-b�l kovetkezo, vagy sin3 -ra l�phet a mozdony
	 * sin3-b�l �s kovetkezo-b�l pedig eloz� fel� mehet a vonat
	 *
	 * @param  s  A sin referencia amit be akarunk rakni
	 */	
	@Override
	public void ad(Sin s){
		if(elozo==null){
			elozo=s;
		} 
		else if(kovetkezo==null){
			kovetkezo=s;
		} 
		else if(sin3==null){
			sin3=s;
		}
		else {
			// ha tobbet akarunk hozz�adni nem csin�lunk semmit
		}
		
	}
	
	/**
	 * Visszaadja a kocsi el�z� Sinje alapj�n, hogy hov� kell l�pnie
	 *
	 * @param  elozo  A rajta l�v� mozdony el�z� Sin-je
	 * @return A kovetkez� Sin elem referenci�j�t adja vissza
	 */
	@Override
	public Sin kovetkezo(Sin elozo){
		if(elozo.equals(this.elozo)){
			if (allas==false){
				return kovetkezo;
			}
			else{
				return sin3;
			}
		}
		else if(elozo.equals(this.kovetkezo) || elozo.equals(sin3)){
			return this.elozo;
		}
		else {
			return null;
		}
	}

	/**
	 * V�ltja a v�lt� �ll�s�t
	 * alapb�l az �rt�ke false (vagyis elozo-b�l kovetkez� fele megy)
	 * Minden v�lt�s megcser�li az �ll�st
	 * (ha true akkor elozo-b�l sin3 fele megy
	 *
	 */
	public void valts(){
		if(allas) {
			allas=false;
		}
		else{
			allas=true;
		}
	}
	
	/**
	 * Mivel implement�lja az Elem interf�szt, meg kell val�s�tania
	 *az akcio() fv-t, ezzel �rtes�l arr�l, hogy v�ltani kell
	 *
	 *@return true mert v�ltott
	 */
	@Override
	public Boolean akcio(){
		valts();
		return true;
	}
}
