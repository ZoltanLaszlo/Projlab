package projlabszkeleton;

public class Keresztezodes extends Sin {
	private Sin sin3;
	private Sin sin4;
	
	/**
	 * Konstruktor ami egy id-vel l�tja el a sint, hogy tudjuk kezelni
	 *
	 * @param  nev  A nev amit adni akarunk a sinnek
	 */
	public Keresztezodes(String nev){
		super(nev);
	}
	/**
	 * Hozz�adja a keresztez�d�shez a szomsz�dait,
	 * Els� h�v�sra az elozo nevu attributum�ba rakja
	 * M�sodik h�v�sra a kovetkezo nev�be rakja
	 * 3. h�v�sra a sin3 4.-re sin4
	 * Minden tov�bbi h�v�sra nem csin�l semmit
	 * a keresztez�d�sen elozo-b�l kobetkez�be vagy ford�tva
	 * �s sin3-b�l sin4-be vagy ford�tva lehet menni
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
		else if(sin4==null){
			sin4=s;
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
	public Sin kovetkezo(Sin elozo){
		if (elozo.equals(this.elozo)){
			return kovetkezo;
		}
		else if(elozo.equals(this.kovetkezo)){
			return this.elozo;
		}
		if (elozo.equals(this.sin3)){
			return sin4;
		}
		else if(elozo.equals(this.sin4)){
			return this.sin3;
		}
		else {
			return null;
		}
	}

}
