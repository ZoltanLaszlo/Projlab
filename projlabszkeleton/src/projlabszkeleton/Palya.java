package projlabszkeleton;
import java.util.ArrayList;
public class Palya {
	private ArrayList<Elem> elemek;
	
	public void start (){
		//ez az init létrehozás után kiirjuk a képernyőre hogy létre lett hozva
		Sin s1 = new Sin();
		Program.println(">>s1{Sin} Created");
		Megallo m = new Megallo();
		Program.println(">>m{Megallo} Created");
		Valto v = new Valto();
		Program.println(">>v{Valto} Created");
		Mozdony mo = new Mozdony();
		Program.println(">>mo{Mozdony} Created");
		SpecialisHely s2 = new SpecialisHely();
		Program.println(">>s2{SpecialisHely} Created");
		Kocsi k = new Kocsi();
		Program.println(">>k{Kocsi} Created");
		
		Program.println(">>palya{Palya} calls ad(v):void on s1{Sin}");
		s1.ad(v);
		Program.println(">>palya{Palya} calls ad(m):void on s1{Sin}");
		s1.ad(m);
		
		Program.println(">>palya{Palya} calls ad(s1):void on m{Megallo}");
		m.ad(s1);
		Program.println(">>palya{Palya} calls ad(v):void on m{Megallo}");
		m.ad(v);
		Program.println(">>palya{Palya} calls ad(mo):void on m{Megallo}");
		m.ad(mo);
		
		Program.println(">>palya{Palya} calls ad(m):void on mo{Mozdony}");
		mo.ad(m);
		Program.println(">>palya{Palya} calls ad(k):void on mo{Mozdony}");
		mo.ad(k);
		
		Program.println(">>palya{Palya} calls ad(m):void on v{Valto}");
		v.ad(m);
		Program.println(">>palya{Palya} calls ad(s2):void on v{Valto}");
		v.ad(s2);
		Program.println(">>palya{Palya} calls ad(s1):void on v{Valto}");
		v.ad(s1);
		Program.println(">>palya{Palya} calls ad(k):void on v{Valto}");
		//v.ad(k);
	
		Program.println(">>palya{Palya} calls ad(v):void on k{Kocsi}");
		k.ad(v);
		Program.println(">>palya{Palya} calls ad(mo):void on k{Kocsi}");
		k.ad(mo);
		
		Program.println(">>palya{Palya} calls ad(v):void on s2{SpecialisHely}");
		s2.ad(v);
		
		Program.println(">>palya{Palya} calls setUtasokSzama(0):void on mo{Mozdony}");
		mo.setUtasokSzama(0);
		
		Program.println(">>palya{Palya} calls setUtasokSzama(3):void on k{Kocsi}");
		k.setUtasokSzama(3);
		
		Program.println(">>mk{Mozdonytar} Created");
		Mozdonytar mk = new Mozdonytar();
		
		Program.println(">>palya{Palya} calls ad(mo):void on mk{Mozdonytar}");
		mk.ad(mo);
		
		Program.println(">>palya{Palya} calls add(s1):void on this{Palya}");
		this.add(s1);
		Program.println(">>palya{Palya} calls add(m):void on this{Palya}");
		this.add(m);
		Program.println(">>palya{Palya} calls add(v):void on this{Palya}");
		this.add(v);
		Program.println(">>palya{Palya} calls add(mo):void on this{Palya}");
		this.add(mo);
		Program.println(">>palya{Palya} calls add(s2):void on this{Palya}");
		this.add(s2);
		Program.println(">>palya{Palya} calls add(k):void on this{Palya}");
		this.add(k);
	}
	public void add(Elem e){
		elemek.add(e);
	}

}
