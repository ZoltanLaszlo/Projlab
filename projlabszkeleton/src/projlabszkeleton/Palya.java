package projlabszkeleton;
import java.util.ArrayList;
public class Palya {
	private ArrayList<Elem> elemek;
	
	public void start (){
		//ez az init l�trehoz�s ut�n kiirjuk a k�perny�re hogy l�tre lett hozva
		Sin s1 = new Sin();
		Megallo m = new Megallo();
		Valto v = new Valto();
		Mozdony mo = new Mozdony();
		SpecialisHely s2 = new SpecialisHely();
		Kocsi k = new Kocsi();
		
		s1.ad(v);
		s1.ad(m);
		
		m.ad(s1);
		m.ad(v);
		m.ad(mo);
		
		mo.ad(m);
		mo.ad(k);
		
		v.ad(m);
		v.ad(s2);
		v.ad(s1);
		v.ad(k);
	
		k.ad(v);
		k.ad(mo);
		
		s2.ad(v);
		
		mo.setUtasokSzama(0);
		
		k.setUtasokSzama(3);
		
		Mozdonytar mk = new Mozdonytar();
		
		mk.ad(mo);
		
		this.add(s1);
		this.add(m);
		this.add(v);
		this.add(mo);
		this.add(s2);
		this.add(k);
	}
	public void add(Elem e){
		
	}

}
