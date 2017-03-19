package projlabszkeleton;

public class Mozdony extends Kocsi{
	
	@Override
	/**
	A mozdony felel a onat léptetéséért az előző kocsi alapján megtudja ol állt az előző lépésben, majd 
	ezzel az információval lekérdezi a sín elemét, hogy mi a kovetkező elem. ezt a felhasználó mondja meg.
	Mald lépteti a kocsiját és magát. (őt nem érdekli mien Sínelemet kap)
	**/
	public void lep(){
		System.out.println(">>mo{Mozdony} calls"
				+ " sinem():Sin on "
				+ "k{Kocsi}");
		new Kocsi().sinem();
		System.out.println(">>mo{Mozdony} calls"
				+ " kovetkezo(s1):Sin on "
				+ "s2{Sin}");
		Sin s3=new Sin().kovetkezo(new Sin());
		System.out.println(">>mo{Mozdony} calls"
				+ " ad(null):void on "
				+ "s2{Sin}");
		System.out.println(">>mo{Mozdony} calls"
				+ " kocsilepj(s2):void on "
				+ "k{Kocsi}");
		new Kocsi().kocsilepj(new Sin());
		System.out.println(">>mo{Mozdony} calls"
				+ " ad(s3):void on "
				+ "mo{Mozdony}");
		this.ad(s3);
		System.out.println(">>mo{Mozdony} calls"
				+ " ad(s3):void on "
				+ "s3{Sin}");
		s3.ad(this);
		
	}
	public boolean OsszesUres(){
		//elég ezt megkérdezni a felhasználótól nem kell bele menni a részletekbe
		return true;
	}

}
