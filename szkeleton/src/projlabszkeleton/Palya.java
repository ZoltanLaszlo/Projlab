package projlabszkeleton;
import java.util.ArrayList;
public class Palya {
	private ArrayList<Elem> elemek;
	private Mozdonytar mozdonytar;

	/**
	 * Konstruktor létrehozza az üres tárat
	 */	
	public Palya (){
		elemek=new ArrayList<Elem>();
		mozdonytar = new Mozdonytar();
	}
	
	/**
	 * Itt lesz generálva a pálya, de most a felhasználó teszi 
	 * úgyhogy egyenlőre üres marad
	 * 
	 * @param a hozzáadandó elem
	 */	
	public void start (){
	}

	/**
	 * hozzáad egy elemet a Pályához
	 * 
	 * @param a hozzáadandó elem
	 */	
	public void add(Elem e){
		elemek.add(e);
	}
	
	/**
	 * Hozzáad egy elemet a Pályához és a mozdonytárhoz.
	 * @param m A hozzáadadndó mozdony.
	 */
	public void add(Mozdony m){
		elemek.add(m);
		mozdonytar.ad(m);
	}
	
	/**
	 * lépteti az összes elemet a pályán
	 */
	public void leptetes() throws EndGameException{
		for(Elem e: elemek){
			e.lep();
		}
		if(!mozdonytar.vanNemUresVonat())
			throw new EndGameException(true);
	}

}
