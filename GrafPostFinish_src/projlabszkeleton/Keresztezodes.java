package projlabszkeleton;

public class Keresztezodes extends Sin {
	private Sin sin3;
	private Sin sin4;
	
	/**
	 * Konstruktor ami egy id-vel látja el a sint, hogy tudjuk kezelni
	 *
	 * @param  nev  A nev amit adni akarunk a sinnek
	 */
	public Keresztezodes(String nev){
		super(nev);
	}
	/**
	 * Hozzáadja a kereszteződéshez a szomszédait,
	 * Első hívásra az elozo nevu attributumába rakja
	 * Második hívásra a kovetkezo nevűbe rakja
	 * 3. hívásra a sin3 4.-re sin4
	 * Minden további hívásra nem csinál semmit
	 * a kereszteződésen elozo-ből kobetkezőbe vagy fordítva
	 * és sin3-ból sin4-be vagy fordítva lehet menni
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
			// ha tobbet akarunk hozzáadni nem csinálunk semmit
		}
	}
	
	/**
	 * Visszaadja a kocsi előző Sinje alapján, hogy hová kell lépnie
	 *
	 * @param  elozo  A rajta lévő mozdony előző Sin-je
	 * @return A kovetkező Sin elem referenciáját adja vissza
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
	public Sin getsin3(){
		return sin3;
	}
	public Sin getsin4(){
		return sin4;
	}
}
