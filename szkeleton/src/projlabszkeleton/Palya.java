package projlabszkeleton;
import java.util.ArrayList;
public class Palya {
	private ArrayList<Elem> elemek;

	/**
	 * Konstruktor létrehozza az üres tárat
	 */	
	public Palya (){
		elemek=new ArrayList<Elem>();
	}
	
	/**
	 * Itt lesz generálva a pálya, de most a felhasználó teszi 
	 * úgyhogy egyenlõre üres marad
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
	 * lépteti az összes elemet a pályán
	 */
	public void leptetes() throws EndGameException{
		for(Elem e: elemek){
			e.lep();
		}
	}

}
