package projlabszkeleton;

public class Sin implements Elem{

	protected Sin elozo, kovetkezo;
	protected Kocsi kocsi;
	public String id;

	/**
	 * Konstruktor ami egy id-vel l�tja el a sint, hogy tudjuk kezelni
	 *
	 * @param  nev  A nev amit adni akarunk a sinnek
	 */
	public Sin(String nev){
		this.id=nev;
	}
	
	/**
	 * Hozz�adja a s�nhez a szomsz�dait,
	 * Els� h�v�sra az elozo nevu attributum�ba rakja
	 * M�sodik h�v�sra a kovetkezo nev�be rakja
	 * Minden tov�bbi h�v�sra nem csin�l semmit
	 *
	 * @param  s  A sin referencia amit be akarunk rakni
	 */
	public void ad(Sin s){
		if(elozo==null){
			elozo=s;
		} 
		else if(kovetkezo==null){
			kovetkezo=s;
		}
		else {
			// ha tobbet akarunk hozz�adni nem csin�lunk semmit
		}
	}
	
	/**
	 * Hozz�adja a s�nhez a Kocsit, ami r�l�p,
	 * ha mar van kocsi a sinen kiv�telt dob
	 *
	 * @param  k  A Kocsi referencia amit a Sinre akarunk rakni
	 * @throws EndGameException Ha �tk�z�s t�rt�nt
	 */
	public void ad(Kocsi k) throws EndGameException{
		if(kocsi!=null && k!=null){
			throw new EndGameException(false);
		}
		else {
			kocsi=k;
		}
	}
	
	/**
	 * Visszaadja a kocsi el�z� Sinje alapj�n, hogy hov� kell l�pnie
	 *
	 * @param  elozo  A rajta l�v� mozdony el�z� Sin-je
	 * @return A kovetkez� Sin elem referenci�j�t adja vissza
	 */
	public Sin kovetkezo(Sin elozo) throws EndGameException{
		if (elozo.equals(this.elozo)){
			return kovetkezo;
		}
		else if(elozo.equals(this.kovetkezo)){
			return this.elozo;
		}
		else {
			return null;
		}
	}

	/**
	 * Mivel implement�lja az Elem interf�szt, meg kell val�s�tania
	 *a lep() fv-t, de mivel nem csin�l semmit egyszer�en �resen hagyjuk
	 *
	 */
	@Override
	public void lep() throws EndGameException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * Mivel implement�lja az Elem interf�szt, meg kell val�s�tania
	 *az akcio() fv-t, de mivel nem csin�l semmit egyszer�en �resen hagyjuk
	 *
	 *@return null /mert nem csin�l semmit
	 */
	@Override
	public Boolean akcio() throws TooManyKapuException {
		// TODO Auto-generated method stub
		return null;
	}

}
