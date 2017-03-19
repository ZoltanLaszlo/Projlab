package projlabszkeleton;

public class SpecialisHely extends Sin{
	private Kapu kapum;
	
	@Override
	public Boolean akcio(){
		Program.println("<<{SpecialisHely} akcio():");
		System.out.println("Kaput felvenni vagy lerakni szeretnél?");
		Program.println("? Kapu [felvetel]: 1 [lerakás]: 2");
		Scanner scn = new Scanner(System.in);
		String line = scn.nextLine();
		if(line.equals("2")){				//ha lerakás
			System.out.println("van már lerakva kapu? i/n");
			line = scn.nextLine();
			if(line.equals("n")){		//lerakás és még nincs másik kapu
				Program.println("<<kap1{Kapu} Created");
				Program.println("<<s4{SpecialisHely} calls ad(kap1: Kapu) on s4{SpecialisHely}");
				new SpecialisHely().ad(new Kapu());
				Program.println("<<s4{SpecialisHely} calls ad(s4: SpecialisHely) on kap1{Kapu}");
				new Kapu().ad(new SpecialisHely());
				Program.println("<<s4{SpecialisHely}: akcio() returned true: boolean");
				return true;
			} else if(line.equals("i")){		//lerakás és már van másik kapu
				Program.println("<<kap2{Kapu} Created");
				Program.println("<<s5{SpecialisHely} calls ad(kap2: Kapu) on kap1{Kapu}");
				new Kapu().ad(new Kapu());
				Program.println("<<s5{SpecialisHely} calls ad(kap1: Kapu) on kap2{Kapu}");
				new Kapu().ad(new Kapu());
				Program.println("<<s5{SpecialisHely} calls ad(kap2: Kapu) on s5{SpecialisHely}");
				new SpecialisHely().ad(new Kapu());
				Program.println("<<s5{SpecialisHely} calls ad(s5: SpecialisHely) on kap2{Kapu}");
				new SpecialisHely().ad(new Kapu());
				Program.println("<<s5{SpecialisHely}: akcio() returned true: boolean");
				return true;
			}
			

		}
		else if(line.equals("1")){		//ha felvétel
			Program.println("<<s4{SpecialisHely} calls ad(null: Kapu) on s4{SpecialisHely}");
		}
		
		scn.close();
	
		return false;
	}
	
	public boolean vankapu(){
		//meg kell kérdezni a felhasználótól és azt visszaadni amit õ mond
		return true;
	}
	public Kapu kapu(){
		return kapum;
	}
	
	public void ad(Kapu kapum){
		Program.println("{SpecialisHely}: ad(Kapu)");
	}
	
	@Override
	public Sin kovetkezo(Sin elozo){
		return new Sin();
	}
}
