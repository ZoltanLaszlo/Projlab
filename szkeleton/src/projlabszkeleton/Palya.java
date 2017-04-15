package projlabszkeleton;
import java.util.ArrayList;
public class Palya {
	private ArrayList<Elem> elemek;

	/**
	 * Konstruktor l�trehozza az �res t�rat
	 */	
	public Palya (){
		elemek=new ArrayList<Elem>();
	}
	
	/**
	 * Itt lesz gener�lva a p�lya, de most a felhaszn�l� teszi 
	 * �gyhogy egyenl�re �res marad
	 * 
	 * @param a hozz�adand� elem
	 */	
	public void start (){
	}

	/**
	 * hozz�ad egy elemet a P�ly�hoz
	 * 
	 * @param a hozz�adand� elem
	 */	
	public void add(Elem e){
		elemek.add(e);
	}
	
	/**
	 * l�pteti az �sszes elemet a p�ly�n
	 */
	public void leptetes() throws EndGameException{
		for(Elem e: elemek){
			e.lep();
		}
	}

}
