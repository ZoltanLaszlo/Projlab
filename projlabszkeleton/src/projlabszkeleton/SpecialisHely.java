package projlabszkeleton;

import java.util.Scanner;

public class SpecialisHely extends Sin{
	private Kapu kapum;
	
	@Override
	public Boolean akcio(){
		Program.println("<<{SpecialisHely} akcio():");
		System.out.println("Kaput felvenni vagy lerakni szeretnél?");
		Program.println("? Kapu [felvetel]: 1 [lerakás]: 2");
		int line;
		line = Program.menupontValasztas("Kaput felvenni vagy lerakni szeretnél?", 1, 2);
		Scanner scn = new Scanner(System.in);
		//String line = scn.nextLine();
		if(line == 2){				//ha lerakás
			if(Program.menupontValasztas("van már lerakva kapu?")){
				Program.println("<<kap1{Kapu} Created");
				Program.println("<<s4{SpecialisHely} calls ad(kap1: Kapu) on s4{SpecialisHely}");
				new SpecialisHely().ad(new Kapu());
				Program.println("<<s4{SpecialisHely} calls ad(s4: SpecialisHely) on kap1{Kapu}");
				new Kapu().ad(new SpecialisHely());
				Program.println("<<s4{SpecialisHely}: akcio() returned true: boolean");
				scn.close();
				return true;
			} else if(!Program.menupontValasztas("van már lerakva kapu?")){
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
				scn.close();
				return true;
			}
			

		}
		else if(line == 1){
			Program.println("<<s4{SpecialisHely} calls ad(null: Kapu) on s4{SpecialisHely}");
		}
		
		scn.close();
	
		return false;
	}
	/**
	visszaadja van-e kapu a speciális helyen
	**/
	public boolean vankapu(){
		System.out.println("mivel azt mondtuk alagut jon ezert itt van kapu");
		System.out.println("<<s3{SpecialisHely} vankapu() returned true:boolean");
		return true;
	}
	public Kapu kapu(){
		return kapum;
	}
	
	public void ad(Kapu kapum){
		Program.println("{SpecialisHely}: ad(Kapu)");
	}
	
	@Override
	/**
	visszaadja mi a következő elem figyelembe véve hogy a vonat jöhetett alagútból és mehet alagútba
	**/
	public Sin kovetkezo(Sin elozo){
		System.out.println(">>s3{SpecialisHely} calls"
				+ " kapu():Kapu on "
				+ "kap1{Kapu}");
		new Kapu().kapu();
		System.out.println(">>s3{SpecialisHely} calls"
				+ " hely():SpecialisHely on "
				+ "kap2{Kapu}");
		new Kapu().hely();
		System.out.println(">>s3{SpecialisHely} calls"
				+ " kovetkezo(s3):Sin on "
				+ "s4{SpecialisHely}");
		System.out.println("<<s4{SpecialisHely} kovetkezo(s3) returned s5:Sin");
		System.out.println("<<s3{SpecialisHely} kovetkezo(s2) returned s5:Sin");
		
		return new Sin();
	}
	/**
	 ha rálép egy kocsi figyelembe veszi hogy van rajta alagút és beküldi az alagútba
	**/
	@Override
	public void ad(Kocsi k){
		System.out.println(">>s3{SpecialisHely} calls"
				+ " vankapu():boolean on "
				+ "s3{SpecialisHely}");
		vankapu();
		System.out.println(">>s3{SpecialisHely} calls"
				+ " alagutallapot(true):void on "
				+ "mo{Mozdony}");
		k.alagutAllapot(true);
		System.out.println(">>s3{SpecialisHely} calls"
				+ " belep(mo):void on "
				+ "kap1{Kapu}");
		new Kapu().belep(k);
	}
}
