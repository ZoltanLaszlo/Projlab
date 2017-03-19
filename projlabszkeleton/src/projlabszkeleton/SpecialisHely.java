package projlabszkeleton;

public class SpecialisHely extends Sin{
	private Kapu kapum;
	
	@Override
	public Boolean akcio(){
		System.out.println("<<{SpecialisHely} akcio():");
		Program.println("<<kap1{Kapu} Created");
		Program.println("<<s4{SpecialisHely} calls ad(kap1: Kapu) on s4{SpecialisHely}");
		new SpecialisHely().ad(new Kapu());
		Program.println("<<s4{SpecialisHely} calls ad(s4: SpecialisHely) on kap1{Kapu}");
		new Kapu().ad(new SpecialisHely());
		Program.println("<<kap2{Kapu} Created");
		Program.println("<<s5{SpecialisHely} calls ad(kap2: Kapu) on kap1{Kapu}");
		new Kapu().ad(new Kapu());
		Program.println("<<s5{SpecialisHely} calls ad(kap1: Kapu) on kap2{Kapu}");
		new Kapu().ad(new Kapu());
		Program.println("<<s4{SpecialisHely}: akcio() returned true: boolean");
	
		return true;
	}
	
	public boolean vankapu(){
		//meg kell kérdezni a felhasználótól és azt visszaadni amit õ mond
		return true;
	}
	public Kapu kapu(){
		return kapum;
	}
	
	public void ad(Kapu kapum){
		Program.println("<<{SpecialisHely}: ad(Kapu)");
	}
	
	@Override
	public Sin kovetkezo(Sin elozo){
		return new Sin();
	}
}
