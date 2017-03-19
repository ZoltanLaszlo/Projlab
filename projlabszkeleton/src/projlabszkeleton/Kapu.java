package projlabszkeleton;

public class Kapu implements Elem{

	private Kapu masikkapu;
	private int hossz;
	private SpecialisHely helyem;
	// az alagútban lévő vonatot az alagút lépteti ha kilép visszadja a sínnek
	@Override
	public void lep() {
		// TODO Auto-generated method stub
		int k=-1;
		
		while(k==-1){
			System.out.println("? kilépünk [igen][nem]");
			//Scanner scanner = new Scanner(System.in);
			String input = new Program().scanner.nextLine();
			
			if(input.equals("igen")){
				k=0;
				System.out.println(">>kap1{Kapu} calls"
						+ " alagutallapot(false):void on "
						+ "mo{Mozdony}");
				new Mozdony().alagutAllapot(false);
			}
			else{
				System.out.println(">>elso{Palya} calls"
						+ " lep():void on "
						+ "kap1{Kapu}");
			}
		}
		//scanner.close();
	}

	@Override
	public Boolean akcio() {
		// TODO Auto-generated method stub
		return null;
	}
	// visszadja a kapu helyét
	public SpecialisHely hely() {
		System.out.println("<<kap2{Kapu} hely() returned s4:SpecialisHely");
		return helyem;
	}
	public int alaguthossz(){
		System.out.println("<<hossz:int");
		return hossz;
	}
	
	// visszadja a másik kaput
	public Kapu kapu(){
		System.out.println("<<kap2{Kapu} kapu() returned kap2:Kapu");
		return masikkapu;
	}
	
	public void ad(SpecialisHely helyem){
		System.out.println("\t{Kapu}: ad(SpecialisHely)");
	}
	
	public void ad(Kapu masikkapu){
		System.out.println("\t{Kapu}: ad(Kapu)");
	}
	// belépteti a kocsit az alagútba (itt folytatjuk az alagútbejárást mivel több lépés kell
	public void belep(Kocsi k){
		new Program().alagutfolyt();
	}

}
