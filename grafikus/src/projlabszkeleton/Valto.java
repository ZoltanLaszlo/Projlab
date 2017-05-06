package projlabszkeleton;

public class Valto extends Sin {
	private Sin sin3;
	private boolean allas=false;
	
	/**
	 * Konstruktor ami egy id-vel látja el a sint, hogy tudjuk kezelni
	 *
	 * @param  nev  A nev amit adni akarunk a sinnek
	 */
	public Valto(String nev){
		super(nev);
	}
	
	/**
	 * Hozzáadja a váltóhoz a szomszédait,
	 * Első hívásra az elozo nevu attributumába rakja
	 * Második hívásra a kovetkezo nevűbe rakja
	 * 3. hívásra a sin3 nevűbe rakja
	 * Minden további hívásra nem csinál semmit
	 * a valtó allasatól függően elozo-ből kovetkezo, vagy sin3 -ra léphet a mozdony
	 * sin3-ból és kovetkezo-ból pedig eloző felé mehet a vonat
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
			// ha tobbet akarunk hozzáadni nem csinálunk semmit
		}
		
	}
	
	/**
	 * Visszaadja a kocsi előző Sinje alapján, hogy hová kell lépnie
	 *
	 * @param  elozo  A rajta lévő mozdony előző Sin-je
	 * @return A kovetkező Sin elem referenciáját adja vissza
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
	 * Váltja a váltó állását
	 * alapból az értéke false (vagyis elozo-ből kovetkező fele megy)
	 * Minden váltás megcseréli az állást
	 * (ha true akkor elozo-ből sin3 fele megy
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
	 * Mivel implementálja az Elem interfészt, meg kell valósítania
	 *az akcio() fv-t, ezzel értesül arról, hogy váltani kell
	 *
	 *@return true mert váltott
	 */
	@Override
	public Boolean akcio(){
		valts();
		return true;
	}
	
	public Sin getsin3(){
		return sin3;
	}
}
