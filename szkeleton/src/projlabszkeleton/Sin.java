package projlabszkeleton;

public class Sin implements Elem{

	protected Sin elozo, kovetkezo;
	protected Kocsi kocsi;
	public String id;

	/**
	 * Konstruktor ami egy id-vel látja el a sint, hogy tudjuk kezelni
	 *
	 * @param  nev  A nev amit adni akarunk a sinnek
	 */
	public Sin(String nev){
		this.id=nev;
	}
	
	/**
	 * Hozzáadja a sínhez a szomszédait,
	 * Első hívásra az elozo nevu attributumába rakja
	 * Második hívásra a kovetkezo nevűbe rakja
	 * Minden további hívásra nem csinál semmit
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
			// ha tobbet akarunk hozzáadni nem csinálunk semmit
		}
	}
	
	/**
	 * Hozzáadja a sínhez a Kocsit, ami rálép,
	 * ha mar van kocsi a sinen kivételt dob
	 *
	 * @param  k  A Kocsi referencia amit a Sinre akarunk rakni
	 * @throws EndGameException Ha ütközés történt
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
	 * Visszaadja a kocsi előző Sinje alapján, hogy hová kell lépnie
	 *
	 * @param  elozo  A rajta lévő mozdony előző Sin-je
	 * @return A kovetkező Sin elem referenciáját adja vissza
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
	 * Mivel implementálja az Elem interfészt, meg kell valósítania
	 *a lep() fv-t, de mivel nem csinál semmit egyszerűen üresen hagyjuk
	 *
	 */
	@Override
	public void lep() throws EndGameException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * Mivel implementálja az Elem interfészt, meg kell valósítania
	 *az akcio() fv-t, de mivel nem csinál semmit egyszerűen üresen hagyjuk
	 *
	 *@return null /mert nem csinál semmit
	 */
	@Override
	public Boolean akcio() throws TooManyKapuException {
		// TODO Auto-generated method stub
		return null;
	}

}

