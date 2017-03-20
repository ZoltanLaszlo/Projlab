package projlabszkeleton;

public class Sin implements Elem{

	private Sin elozo, kovetkezo;
	
	
	public void ad(Sin s){
		
	}
	
	public void ad(Kocsi k){
		Program.println("<<{Sin}: ad(Kocsi) Kocsi added");
	}
	// visszadja a következő sínt az előző sín alapján
	public Sin kovetkezo(Sin elozo){
		String be=new String();
		System.out.println("? Hova lépünk? [Sin][Alagut][Megallo][Valto]");
		//Scanner scanner = new Scanner(System.in);
		be = Program.scanner.nextLine();
		if(be.equals("Sin")){
			System.out.println("<<s2{Sin} kovetkezo(s1) returned s3:Sin");
			return new Sin();
		}
		if(be.equals("Alagut")){

			System.out.println("<<s2{Sin} kovetkezo(s1) returned s3:SpecialisHely");
			return new SpecialisHely();
			
		}
		if(be.equals("Megallo")){
			System.out.println("<<s2{Sin} kovetkezo(s1) returned s3:Megallo");
			return new Megallo();
			
		}
		if(be.equals("Valto")){
			System.out.println("<<s2{Sin} kovetkezo(s1) returned s3:Valto");
			return new Valto();
			
		}

		//scanner.close();


		
		return new Sin();
	}
	
	@Override
	public void lep() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Boolean akcio() {
		// TODO Auto-generated method stub
		return null;
	}

}
