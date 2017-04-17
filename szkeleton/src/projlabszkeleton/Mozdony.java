package projlabszkeleton;

import java.awt.Color;

public class Mozdony extends Kocsi{
	
	public Mozdony(Color szin, String id){
		super(0, szin, id);
		elotte = null;
		mogotte = null;
		alagutAllapot = false;
	}
	
	/**
	A mozdony felel a onat léptetéséért az előző kocsi alapján megtudja ol állt az előző lépésben, majd 
	ezzel az információval lekérdezi a sín elemét, hogy mi a kovetkező elem. ezt a felhasználó mondja meg.
	Mald lépteti a kocsiját és magát. (őt nem érdekli mien Sínelemet kap)
	**/
	public void lep() throws EndGameException{
		if(!alagutAllapot){
			Sin sin3 = sin.kovetkezo(mogotte.sinem());
			sin.ad((Kocsi)null);		//felszabadítja az adott sín elemet (ha nincs a mozdony mögé kocsi kötve a sín szabaddá válik)
			if(mogotte != null && sin3 != null){		//módosítás && sin3 != null
					mogotte.kocsilepj(sin);		//lépteti a mogotte lévő kocsit a saját helyére
			}
			if(sin3 != null)
				ad(sin3);

			if(!alagutAllapot && sin3 != null){				//módosítás && sin3 != null
				sin3.ad(this);
			}
		}
	}
	
	/**
	 * Megmondja, hogy üres-e az adott vonat, azaz a mozdonyhoz kötött összes kocsi
	 * 
	 * @return true, ha az adott mozdonyhoz kötött összes kocsi üres
	 */
	public boolean osszesUres(){
		Kocsi next = mogotte;
		
		while(next != null){
			if(!next.ures())
				return false;
			next = next.mogotte;
		}
		return true;
	}
	
	/**
	 * Hozzáköt egy kocsit a mozdony végéhez.
	 */
	@Override
	public void ad(Kocsi kocsi){
		mogotte = kocsi;
	}

}
