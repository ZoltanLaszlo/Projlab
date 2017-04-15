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
	A mozdony felel a onat léptetéséért az elõzõ kocsi alapján megtudja ol állt az elõzõ lépésben, majd 
	ezzel az információval lekérdezi a sín elemét, hogy mi a kovetkezõ elem. ezt a felhasználó mondja meg.
	Mald lépteti a kocsiját és magát. (õt nem érdekli mien Sínelemet kap)
	**/
	@Override
	public void lep() throws EndGameException{
		if(!alagutAllapot){
			sin.ad((Kocsi)null);		//felszabadítja az adott sín elemet (ha nincs a mozdony mögé kocsi kötve a sín szabaddá válik)
			Sin sin3 = sin.kovetkezo(mogotte.sinem());
			if(mogotte != null){
				mogotte.kocsilepj(sin);		//lépteti a mogotte lévõ kocsit a saját helyére
			}
			
			ad(sin3);

			if(!alagutAllapot){
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