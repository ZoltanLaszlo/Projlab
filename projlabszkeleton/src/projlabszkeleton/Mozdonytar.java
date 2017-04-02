package projlabszkeleton;

import java.util.ArrayList;
public class Mozdonytar {
	private ArrayList<Mozdony> vonatok = new ArrayList<Mozdony>();
	
	public void ad (Mozdony mo){
		vonatok.add(mo);
	}
	public boolean vannemuresvonat(){
		//megkérdezzük hány vonat van és annyiszor meghívjuk egy mozdonyra az osszesures fv-t és ha valamikor false jön vissza true-t adunk adunk
		
		for (Mozdony mo : vonatok)
			if (!mo.OsszesUres()) return true;
		
		Program.println("<<mk{Mozdonytar} calls OsszesUres():boolean on all {Mozdony}");
		new Mozdony().OsszesUres();
		Program.println("<<mk{MozdonyTar}: vannemuresvonat() returned false: boolean");
		return false;
	}
}
