package projlabszkeleton;
import java.awt.Color;
import java.util.ArrayList;
public class Palya {
	private ArrayList<Elem> elemek;
	private Mozdonytar mozdonytar;
	private Palya_Rajzolo rajzolo;

	/**
	 * Konstruktor létrehozza az üres tárat
	 */	
	public Palya (Palya_Rajzolo pr){
		elemek=new ArrayList<Elem>();
		mozdonytar = new Mozdonytar();
		rajzolo=pr;
	}
	public Palya (){
		elemek=new ArrayList<Elem>();
		mozdonytar = new Mozdonytar();
		rajzolo=null;
	}
	
	/**
	 * Itt lesz generálva a pálya, de most a felhasználó teszi 
	 * úgyhogy egyenlõre üres marad
	 * 
	 * @param a hozzáadandó elem
	 */	
	public void start (){
		if(rajzolo==null) return;
		
		//Kocsik létrehozása
				Mozdony m1=new Mozdony(Color.black, "m1");
				Kocsi k1= new Kocsi(0, Color.black, "k1");
				Kocsi k2= new Kocsi(0, Color.blue, "k2");
				Kocsi k3= new Kocsi(0, Color.gray, "k2");
				Kocsi k4= new Kocsi(0, Color.green, "k2");
				Kocsi k5= new Kocsi(0, Color.cyan, "k2");
				Kocsi k6= new Kocsi(0, Color.pink, "k2");
				Kocsi k7= new Kocsi(0, Color.red, "k2");
				Kocsi k8= new Kocsi(0, Color.white, "k2");
				Kocsi k9= new Kocsi(0, Color.yellow, "k2");
				TeherKocsi k10= new TeherKocsi(Color.black, "th");
				
				Mozdony m2=new Mozdony(Color.black, "m1");
				Kocsi k11= new Kocsi(1, Color.black, "k1");
				Kocsi k12= new Kocsi(1, Color.white, "k1");
				Kocsi k13= new Kocsi(1, Color.yellow, "k1");
				
				Mozdony m3=new Mozdony(Color.black, "m1");
				Kocsi k14= new Kocsi(1, Color.pink, "k1");
				
				Mozdony m4=new Mozdony(Color.black, "m1");
				TeherKocsi k15= new TeherKocsi(Color.black, "th");

				Mozdony m5=new Mozdony(Color.black, "m1");
				TeherKocsi k16= new TeherKocsi(Color.black, "th");

				Mozdony m6=new Mozdony(Color.black, "m1");
				TeherKocsi k17= new TeherKocsi(Color.black, "th");
				
				Mozdony m7=new Mozdony(Color.black, "m1");
				TeherKocsi k18= new TeherKocsi(Color.black, "th");
				
				//Sinek létrehozása
				Sin s1= new Sin("s1");
				Sin s2= new Sin("s2");
				Sin s3= new Sin("s3");
				Sin s4= new Sin("s4");
				Sin s5= new Sin("s4");
				Sin s6= new Sin("s4");
				Sin s7= new Sin("s4");
				Sin s8= new Sin("s4");
				Sin s9= new Sin("s4");
				Sin s10= new Sin("s4");
				Sin s11= new Sin("s4");
				Sin s12= new Sin("s4");
				Sin s13= new Sin("s4");
				Sin s14= new Sin("s4");
				Sin s15= new Sin("s4");
				Sin s16= new Sin("s4");
				Sin s17= new Sin("s4");
				Sin s18= new Sin("s4");
				Sin s19= new Sin("s4");
				Sin s20= new Sin("s4");
				Sin s21= new Sin("s4");
				Sin s22= new Sin("s4");
				Sin s23= new Sin("s4");
				Sin s24= new Sin("s4");
				Sin s25= new Sin("s4");
				Sin s26= new Sin("s4");
				Sin s27= new Sin("s4");
				Sin s28= new Sin("s4");
				

				Sin s29= new Sin("s4");
				Megallo s30= new Megallo("s4", Color.black, 0);
				Megallo s31= new Megallo("s4", Color.red, 0);
				Keresztezodes s32= new Keresztezodes("s4");
				Megallo s33= new Megallo("s4", Color.green, 0);
				Megallo s34= new Megallo("s4", Color.gray, 0);
				Sin s35= new Sin("s4");
				Megallo s36= new Megallo("s4", Color.green, 0);
				Megallo s37= new Megallo("s4", Color.gray, 0);
				Sin s38= new Sin("s4");
				Megallo s39= new Megallo("s4", Color.blue, 0);
				Megallo s40= new Megallo("s4", Color.cyan, 0);
				Sin s41= new Sin("s4");
				Megallo s42= new Megallo("s4", Color.blue, 0);
				Megallo s43= new Megallo("s4", Color.cyan, 0);

				Megallo s44= new Megallo("s4", Color.black, 0);
				Megallo s45= new Megallo("s4", Color.red, 0);
				Sin s46= new Sin("s4");
				Megallo s47= new Megallo("s4", Color.white, 0);
				Megallo s48= new Megallo("s4", Color.yellow, 0);
				Sin s49= new Sin("s4");
				Megallo s50= new Megallo("s4", Color.white, 0);
				Megallo s51= new Megallo("s4", Color.yellow, 0);
				
				
				Sin s52= new Sin("s4");
				Sin s53= new Sin("s4");
				Valto s54= new Valto("s4");
				Sin s55= new Sin("s4");
				Sin s56= new Sin("s4");
				Sin s57= new Sin("s4");
				
				Valto s58= new Valto("s4");
				Sin s59= new Sin("s4");
				Sin s60= new Sin("s4");
				Sin s61= new Sin("s4");
				Sin s62= new Sin("s4");
				Sin s63= new Sin("s4");
				

				Sin s64= new Sin("s4");
				SpecialisHely s65= new SpecialisHely("s4");
				Sin s66= new Sin("s4");
				Sin s67= new Sin("s4");
				SpecialisHely s68= new SpecialisHely("s4");
				Sin s69= new Sin("s4");
				
				
				Sin s70= new Sin("s4");
				Sin s71= new Sin("s4");
				SpecialisHely s72= new SpecialisHely("s4");
				Sin s73= new Sin("s4");
				Sin s74= new Sin("s4");
				SpecialisHely s75= new SpecialisHely("s4");
				
				
				Sin s76= new Sin("s4");
				Sin s77= new Sin("s4");
				Valto s78= new Valto("s4");
				Sin s79= new Sin("s4");
				Valto s80= new Valto("s4");
				Keresztezodes s81= new Keresztezodes("s4");
				Sin s82= new Sin("s4");
				Sin s83= new Sin("s4");
				Sin s84= new Sin("s4");
				Sin s85= new Sin("s4");
				Sin s86= new Sin("s4");
				Sin s87= new Sin("s4");

				Valto s88= new Valto("s4");
				Sin s89= new Sin("s4");
				Valto s90= new Valto("s4");
				Sin s91= new Sin("s4");
				Sin s92= new Sin("s4");
				Sin s93= new Sin("s4");
				Megallo s94= new Megallo("m", Color.pink, 1);
				
				
				Sin s95= new Sin("s4");
				Megallo s96= new Megallo("m", Color.pink, 1);
				Sin s97= new Sin("s4");
				Sin s98= new Sin("s4");
				Valto s99= new Valto("s4");
				Sin s100= new Sin("s4");

				Valto s101= new Valto("s4");
				Sin s102= new Sin("s4");
				Sin s103= new Sin("s4");
				Sin s104= new Sin("s4");
				Sin s105= new Sin("s4");
				Sin s106= new Sin("s4");
				
				//Kocsik és sinek pályához adása
				add(s1);
				add(s2);
				add(s3);
				add(s4);
				add(s5);
				add(s6);
				add(s7);
				add(s8);
				add(s9);
				add(s10);
				add(s11);
				add(s12);
				add(s13);
				add(s14);
				add(s15);
				add(s16);
				add(s17);
				add(s18);
				add(s19);
				add(s20);
				add(s21);
				add(s22);
				add(s23);
				add(s24);
				add(s25);
				add(s26);
				add(s27);
				add(s28);
				add(s29);
				add(s30);
				add(s31);
				add(s32);
				add(s33);
				add(s34);
				add(s35);
				add(s36);
				add(s37);
				add(s38);
				add(s39);
				add(s40);
				add(s41);
				add(s42);
				add(s43);
				add(s44);
				add(s45);
				add(s46);
				add(s47);
				add(s48);
				add(s49);
				add(s50);
				add(s51);
				add(s52);
				add(s53);
				add(s54);
				add(s55);
				add(s56);
				add(s57);
				add(s58);
				add(s59);
				add(s60);
				add(s61);
				add(s62);
				add(s63);
				add(s64);
				add(s65);
				add(s66);
				add(s67);
				add(s68);
				add(s69);
				add(s70);
				add(s71);
				add(s72);
				add(s73);
				add(s74);
				add(s75);
				add(s76);
				add(s77);
				add(s78);
				add(s79);
				add(s80);
				add(s81);
				add(s82);
				add(s83);
				add(s84);
				add(s85);
				add(s86);
				add(s87);
				add(s88);
				add(s89);
				add(s90);
				add(s91);
				add(s92);
				add(s93);
				add(s94);
				add(s95);
				add(s96);
				add(s97);
				add(s98);
				add(s99);
				add(s100);
				add(s101);
				add(s102);
				add(s103);
				add(s104);
				add(s105);
				add(s106);
				add(m1);
				add(k1);
				add(k2);
				add(k3);
				add(k4);
				add(k5);
				add(k6);
				add(k7);
				add(k8);
				add(k9);
				add(k10);
				add(m2);
				add(k11);
				add(k12);
				add(k13);
				add(m3);
				add(k14);
				add(m4);
				add(k15);
				add(m5);
				add(k16);
				add(m6);
				add(k17);
				add(m7);
				add(k18);
				
				//Sinek összekapcsolása		

				s31.ad(s32);
				this.sinutkapcsolas(new Sin[]{s31,s30,s29,s51, s50, s49, s48, s47, s46, s45, s44});
				s44.ad(s32);
				s43.ad(s32);
				this.sinutkapcsolas(new Sin[]{s43, s42, s41, s40, s39, s38, s37, s36, s35, s34, s33});
				s33.ad(s32);
				s32.ad(s31);
				s32.ad(s33);
				s32.ad(s43);
				s32.ad(s44);
				
				s64.ad(s69);
				s64.ad(s65);
				s65.ad(s66);
				s65.ad(s64);
				s66.ad(s65);
				s66.ad(s67);
				s67.ad(s66);
				s67.ad(s68);
				s68.ad(s69);
				s68.ad(s67);
				s69.ad(s68);
				s69.ad(s64);
				
				this.sinkorbekapcsolas(new Sin[]{s70,s71,s72,s73,s74,s75});
				
				Sin[] egykor=new Sin[]{s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11,s12,s13,s14,s15,s16,s17,s18,s19,s20,s21,s22,s23,s24,s25,s26,s27,s28};
				this.sinkorbekapcsolas(egykor);
				
				s53.ad(s54);
				this.sinutkapcsolas(new Sin[]{s53, s52, s57, s56, s55});
				s55.ad(s54);
				s54.ad(s53);
				s54.ad(s55);
				s54.ad(s58);
				s59.ad(s58);
				this.sinutkapcsolas(new Sin[]{s59, s60, s61, s62, s63});
				s63.ad(s58);
				s58.ad(s59);
				s58.ad(s63);
				s58.ad(s54);
				
				
				s77.ad(s78);
				this.sinutkapcsolas(new Sin[]{s77, s76, s87, s86, s85, s84, s83, s82});
				s82.ad(s81);
				s79.ad(s78);
				s79.ad(s80);
				s78.ad(s79);
				s78.ad(s77);
				s78.ad(s88);
				s80.ad(s81);
				s80.ad(s79);
				s80.ad(s88);
				s81.ad(s80);
				s81.ad(s93);
				s81.ad(s94);
				s81.ad(s82);
				s88.ad(s80);
				s88.ad(s89);
				s88.ad(s78);
				s89.ad(s88);
				s89.ad(s90);
				s90.ad(s89);
				s90.ad(s91);
				s90.ad(s94);
				s91.ad(s90);
				this.sinutkapcsolas(new Sin[]{s91, s92, s93});
				s93.ad(s81);
				s94.ad(s90);
				s94.ad(s81);
				
				this.sinkorbekapcsolas(new Sin[]{s95, s96, s97, s98,s99, s100});
				this.sinkorbekapcsolas(new Sin[]{s101, s102, s103, s104, s105, s106});
				s99.ad(s101);
				s101.ad(s99);
				
				//Kocsik összekapcsolása	
				this.vonatkotes(new Kocsi[]{m1, k1, k2, k3, k4, k5, k6, k7, k8, k9, k10});
				this.vonatkotes(new Kocsi[]{m2, k11, k12, k13});
				this.vonatkotes(new Kocsi[]{m3, k14});
				this.vonatkotes(new Kocsi[]{m4, k15});
				this.vonatkotes(new Kocsi[]{m5, k16});
				this.vonatkotes(new Kocsi[]{m6, k17});
				this.vonatkotes(new Kocsi[]{m7, k18});
				
				//Kocsik sinekhez adása, Sínek kocsikhoz adása
				try{
					this.vonatlerakas(new Kocsi []{m2, k11, k12, k13}, new Sin[]{s50, s49, s48, s47});
					this.vonatlerakas(new Kocsi []{m3, k14}, new Sin[]{s105, s104});
					this.vonatlerakas(new Kocsi []{m4, k15}, new Sin[]{s57, s56});
					this.vonatlerakas(new Kocsi []{m5, k16}, new Sin[]{s66, s67});
					this.vonatlerakas(new Kocsi []{m6, k17}, new Sin[]{s92, s91});
					this.vonatlerakas(new Kocsi []{m7, k18}, new Sin[]{s61, s62});
					this.vonatlerakas(new Kocsi []{m1, k1, k2, k3, k4, k5, k6, k7, k8, k9, k10}, new Sin[]{s3, s2, s1, s28, s27, s26, s25, s24, s23, s22, s21});
				}
				catch (EndGameException e){
					//no worries
				}
		
		rajzolo.adSin(s1, 1, 1, "JL");
		rajzolo.adSin(s2, 1, 2, "BJ");
		rajzolo.adSin(s3, 1, 3, "BJ");
		rajzolo.adSin(s4, 1, 4, "LB");
		rajzolo.adSin(s5, 2, 4, "BF");
		rajzolo.adSin(s6, 2, 3, "BJ");
		rajzolo.adSin(s7, 2, 2, "JL");
		rajzolo.adSin(s8, 3, 2, "FJ");
		rajzolo.adSin(s9, 3, 3, "BJ");
		rajzolo.adSin(s10, 3, 4, "BJ");
		rajzolo.adSin(s11, 3, 5, "BJ");
		rajzolo.adSin(s12, 3, 6, "BF");
		rajzolo.adSin(s13, 2, 6, "LB");
		rajzolo.adSin(s14, 2, 5, "FJ");
		rajzolo.adSin(s15, 1, 5, "JL");
		rajzolo.adSin(s16, 1, 6, "BJ");
		rajzolo.adSin(s17, 1, 7, "LB");
		rajzolo.adSin(s18, 2, 7, "FL");
		rajzolo.adSin(s19, 3, 7, "FL");
		rajzolo.adSin(s20, 4, 7, "BF");
		rajzolo.adSin(s21, 4, 6, "BJ");
		rajzolo.adSin(s22, 4, 5, "BJ");
		rajzolo.adSin(s23, 4, 4, "BJ");
		rajzolo.adSin(s24, 4, 3, "BJ");
		rajzolo.adSin(s25, 4, 2, "BJ");
		rajzolo.adSin(s26, 4, 1, "FJ");
		rajzolo.adSin(s27, 3, 1, "FL");
		rajzolo.adSin(s28, 2, 1, "FL");	

		rajzolo.adSin(s29, 4, 8, "JL");
		rajzolo.adMegallo(s30, 4, 9, "BJ");
		rajzolo.adMegallo(s31, 4, 10, "BJ");
		rajzolo.adKeresztezodes(s32, 4, 11);
		rajzolo.adMegallo(s33, 4, 12, "BJ");
		rajzolo.adMegallo(s34, 4, 13, "BJ");
		rajzolo.adSin(s35, 4, 14, "BF");
		rajzolo.adMegallo(s36, 3, 14, "FL");
		rajzolo.adMegallo(s37, 2, 14, "FL");
		rajzolo.adSin(s38, 1, 14, "LB");
		rajzolo.adMegallo(s39, 1, 13, "BJ");
		rajzolo.adMegallo(s40, 1, 12, "BJ");
		rajzolo.adSin(s41, 1, 11, "JL");
		rajzolo.adMegallo(s42, 2, 11, "FL");
		rajzolo.adMegallo(s43, 3, 11, "FL");
		rajzolo.adMegallo(s44, 5, 11, "FL");
		rajzolo.adMegallo(s45, 6, 11, "FL");
		rajzolo.adSin(s46, 7, 11, "BF");
		rajzolo.adMegallo(s47, 7, 10, "BJ");
		rajzolo.adMegallo(s48, 7, 9, "BJ");
		rajzolo.adSin(s49, 7, 8, "FJ");
		rajzolo.adMegallo(s50, 6, 8, "FL");
		rajzolo.adMegallo(s51, 5, 8, "FL");

		rajzolo.adSin(s52, 1, 15, "JL");	
		rajzolo.adSin(s53, 1, 16, "LB");
		rajzolo.adValto(s54, 2, 16, "FLJ");
		rajzolo.adSin(s55, 3, 16, "BF");
		rajzolo.adSin(s56, 3, 15, "FJ");
		rajzolo.adSin(s57, 2, 15, "FL");
		rajzolo.adValto(s58, 2, 17, "FLB");
		rajzolo.adSin(s59, 1, 17, "JL");
		rajzolo.adSin(s60, 1, 18, "LB");
		rajzolo.adSin(s61, 2, 18, "FL");
		rajzolo.adSin(s62, 3, 18, "BF");
		rajzolo.adSin(s63, 3, 17, "FJ");
		
		rajzolo.adSin(s64, 1, 8, "JL");
		rajzolo.adSpecialisHely(s65, 1, 9, "JB");
		rajzolo.adSin(s66, 1, 10, "LB");
		rajzolo.adSin(s67, 2, 10, "BF");
		rajzolo.adSpecialisHely(s68, 2, 9, "BJ");
		rajzolo.adSin(s69, 2, 8, "FJ");
		
		rajzolo.adSin(s70, 1, 19, "JL");
		rajzolo.adSin(s71, 1, 20, "LB");
		rajzolo.adSpecialisHely(s72, 2, 20, "FL");
		rajzolo.adSin(s73, 3, 20, "BF");
		rajzolo.adSin(s74, 3, 19, "FJ");
		rajzolo.adSpecialisHely(s75, 2, 19, "LF");
		
		rajzolo.adSin(s76, 5, 1, "JL");
		rajzolo.adSin(s77, 5, 2, "LB");
		rajzolo.adValto(s78, 6, 2, "LFJ");
		rajzolo.adSin(s79, 7, 2, "FJ");
		rajzolo.adValto(s80, 7, 3, "JBF");
		rajzolo.adKeresztezodes(s81, 7, 4);
		rajzolo.adSin(s82, 8, 4, "BF");
		rajzolo.adSin(s83, 8, 3, "BJ");
		rajzolo.adSin(s84, 8, 2, "BJ");
		rajzolo.adSin(s85, 8, 1, "FJ");
		rajzolo.adSin(s86, 7, 1, "FL");
		rajzolo.adSin(s87, 6, 1, "FL");
		rajzolo.adValto(s88, 6, 3, "LFB");
		rajzolo.adSin(s89, 5, 3, "JL");
		rajzolo.adValto(s90, 5, 4, "BJL");
		rajzolo.adSin(s91, 5, 5, "LB");
		rajzolo.adSin(s92, 6, 5, "FL");
		rajzolo.adSin(s93, 7, 5, "BF");
		rajzolo.adMegallo(s94, 6, 4, "FL");

		rajzolo.adSin(s95, 10, 17, "JL");
		rajzolo.adMegallo(s96, 10, 18, "BJ");
		rajzolo.adSin(s97, 10, 19, "LB");
		rajzolo.adSin(s98, 11, 19, "BF");
		rajzolo.adValto(s99, 11, 18, "JBL");
		rajzolo.adSin(s100, 11, 17, "FJ");
		rajzolo.adValto(s101, 12, 18, "BJF");
		rajzolo.adSin(s102, 12, 19, "LB");
		rajzolo.adSin(s103, 13, 19, "BF");
		rajzolo.adSin(s104, 13, 18, "BJ");
		rajzolo.adSin(s105, 13, 17, "FJ");
		rajzolo.adSin(s106, 12, 17, "JL");
	}

	/**
	 * hozzáad egy elemet a Pályához
	 * 
	 * @param a hozzáadandó elem
	 */	
	public void add(Elem e){
		elemek.add(e);
	}
	
	/**
	 * Hozzáad egy elemet a Pályához és a mozdonytárhoz.
	 * @param m A hozzáadadndó mozdony.
	 */
	public void add(Mozdony m){
		elemek.add(m);
		mozdonytar.ad(m);
	}
	
	/**
	 * lépteti az összes elemet a pályán
	 */
	public void leptetes() throws EndGameException{
		for(Elem e: elemek){
			e.lep();
		}
		if(!mozdonytar.vanNemUresVonat())
			throw new EndGameException(true);
	}
	
	public void sinkorbekapcsolas(Sin[]tomb){
		tomb[0].ad(tomb[tomb.length-1]);
		for(int i=1;i<tomb.length;i++){
			tomb[i-1].ad(tomb[i]);
			tomb[i].ad(tomb[i-1]);
		}
		tomb[tomb.length-1].ad(tomb[0]);
	}
	
	public void vonatkotes(Kocsi[]tomb){
		for(int i=1;i<tomb.length;i++){
			tomb[i-1].ad(tomb[i]);
			tomb[i].ad(tomb[i-1]);
		}
	}

	public void vonatlerakas(Kocsi[]kocsik, Sin[]sinek) throws EndGameException{
		if(kocsik.length!=sinek.length){System.out.println("sinlerakas hiba");}
		for(int i=0;i<kocsik.length;i++){
			kocsik[i].ad(sinek[i]);
			sinek[i].ad(kocsik[i]);
		}
	}
	
	public void sinutkapcsolas(Sin[]tomb){
		for(int i=1;i<tomb.length;i++){
			tomb[i-1].ad(tomb[i]);
			tomb[i].ad(tomb[i-1]);
		}
	}

}