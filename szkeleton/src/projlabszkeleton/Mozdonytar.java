package projlabszkeleton;

import java.util.ArrayList;
public class Mozdonytar {
	private ArrayList<Mozdony> vonatok = new ArrayList<Mozdony>();
	
	/**
	 * Hozz�ad egy mozdonyt a mozdonyt�rhoz.
	 * @param mo A hozz�adni k�v�nt mozdony.
	 */
	public void ad (Mozdony mo){
		vonatok.add(mo);
	}
	
	/**
	 * Megmondja, hogy van-e m�g nem �res vonatunk
	 * @return true, ha m�g van nem �res vonat
	 */
	public boolean vanNemUresVonat(){
		for(Mozdony m: vonatok){
			if(!m.osszesUres())
				return true;
		}
		return false;
	}
}