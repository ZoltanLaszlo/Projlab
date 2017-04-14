package projlabszkeleton;

import java.util.ArrayList;
public class Mozdonytar {
	private ArrayList<Mozdony> vonatok = new ArrayList<Mozdony>();
	
	/**
	 * Hozzáad egy mozdonyt a mozdonytárhoz.
	 * @param mo A hozzáadni kívánt mozdony.
	 */
	public void ad (Mozdony mo){
		vonatok.add(mo);
	}
	
	/**
	 * Megmondja, hogy van-e még nem üres vonatunk
	 * @return true, ha még van nem üres vonat
	 */
	public boolean vanNemUresVonat(){
		for(Mozdony m: vonatok){
			if(!m.osszesUres())
				return true;
		}
		return false;
	}
}
