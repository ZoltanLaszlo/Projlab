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
	A mozdony felel a onat l�ptet�s��rt az el�z� kocsi alapj�n megtudja ol �llt az el�z� l�p�sben, majd 
	ezzel az inform�ci�val lek�rdezi a s�n elem�t, hogy mi a kovetkez� elem. ezt a felhaszn�l� mondja meg.
	Mald l�pteti a kocsij�t �s mag�t. (�t nem �rdekli mien S�nelemet kap)
	**/
	@Override
	public void lep() throws EndGameException{
		if(!alagutAllapot){
			sin.ad((Kocsi)null);		//felszabad�tja az adott s�n elemet (ha nincs a mozdony m�g� kocsi k�tve a s�n szabadd� v�lik)
			Sin sin3 = sin.kovetkezo(mogotte.sinem());
			if(mogotte != null){
				mogotte.kocsilepj(sin);		//l�pteti a mogotte l�v� kocsit a saj�t hely�re
			}
			
			ad(sin3);

			if(!alagutAllapot){
				sin3.ad(this);
			}
		}
	}
	
	/**
	 * Megmondja, hogy �res-e az adott vonat, azaz a mozdonyhoz k�t�tt �sszes kocsi
	 * 
	 * @return true, ha az adott mozdonyhoz k�t�tt �sszes kocsi �res
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
	 * Hozz�k�t egy kocsit a mozdony v�g�hez.
	 */
	@Override
	public void ad(Kocsi kocsi){
		mogotte = kocsi;
	}

}