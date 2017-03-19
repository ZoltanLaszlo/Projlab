package projlabszkeleton;

public class SpecialisHely extends Sin{
	private Kapu kapum;
	
	@Override
	public Boolean akcio(){
		System.out.println("{SpecialisHely} akcio():");
		System.out.println("\tkap1{Kapu} Created");
		System.out.println("\ts4{SpecialisHely} calls ad(kap1: Kapu) on s4{SpecialisHely}");
		new SpecialisHely().ad(new Kapu());
		System.out.println("\ts4{SpecialisHely} calls ad(s4: SpecialisHely) on kap1{Kapu}");
		new Kapu().ad(new SpecialisHely());
		System.out.println("\tkap2{Kapu} Created");
		System.out.println("\ts5{SpecialisHely} calls ad(kap2: Kapu) on kap1{Kapu}");
		new Kapu().ad(new Kapu());
		System.out.println("\ts5{SpecialisHely} calls ad(kap1: Kapu) on kap2{Kapu}");
		new Kapu().ad(new Kapu());
		System.out.println("s4{SpecialisHely}: akcio() returned true: boolean");
	}
	
	public boolean vankapu(){
		//meg kell kérdezni a felhasználótól és azt visszaadni amit õ mond
		return true;
	}
	public Kapu kapu(){
		return kapum;
	}
	
	public void ad(Kapu kapum){
		System.out.println("\t{SpecialisHely}: ad(Kapu)");
	}
	
	@Override
	public Sin kovetkezo(Sin elozo){
		return new Sin();
	}
}
