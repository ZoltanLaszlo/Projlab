package projlabszkeleton;

public class Kapu implements Elem{

	private Kapu masikkapu;
	private int hossz;
	private SpecialisHely helyem;
	
	@Override
	public void lep() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Boolean akcio() {
		// TODO Auto-generated method stub
		return null;
	}
	public SpecialisHely hely() {
		System.out.println("<<helyem:SpecialisHely");
		return helyem;
	}
	public int alaguthossz(){
		System.out.println("<<hossz:int");
		return hossz;
	}
	public Kapu kapu(){
		System.out.println("<<kap:Kapu");
		return masikkapu;
	}
	
	public void ad(SpecialisHely helyem){
		Program.println("<<{Kapu}: ad(SpecialisHely)");
	}
	
	public void ad(Kapu masikkapu){
		Program.println("<<{Kapu}: ad(Kapu)");
	}
}
