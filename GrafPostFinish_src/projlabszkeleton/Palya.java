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
	public Palya(Palya_Rajzolo pr) {
		elemek = new ArrayList<Elem>();
		mozdonytar = new Mozdonytar();
		rajzolo = pr;
	}

	public Palya() {
		elemek = new ArrayList<Elem>();
		mozdonytar = new Mozdonytar();
		rajzolo = null;
	}

	/**
	 * Az elsõ "gyakorló" pálya
	 */
	public void start() {
		if (rajzolo == null)
			return;

		// Kocsik létrehozása
		Mozdony m1 = new Mozdony(Color.magenta, "m1");
		Kocsi k1 = new Kocsi(0, Color.black, "k1");
		Kocsi k2 = new Kocsi(0, Color.blue, "k2");
		Kocsi k3 = new Kocsi(0, Color.gray, "k2");
		Kocsi k4 = new Kocsi(0, Color.green, "k2");
		Kocsi k5 = new Kocsi(0, Color.cyan, "k2");
		Kocsi k6 = new Kocsi(0, Color.pink, "k2");
		Kocsi k7 = new Kocsi(0, Color.red, "k2");
		Kocsi k8 = new Kocsi(0, Color.white, "k2");
		Kocsi k9 = new Kocsi(0, Color.yellow, "k2");
		TeherKocsi k10 = new TeherKocsi(Color.black, "th");

		Mozdony m2 = new Mozdony(Color.magenta, "m1");
		Kocsi k11 = new Kocsi(1, Color.black, "k1");
		Kocsi k12 = new Kocsi(1, Color.yellow, "k1");
		Kocsi k13 = new Kocsi(1, Color.gray, "k1");

		Mozdony m3 = new Mozdony(Color.magenta, "m1");
		Kocsi k14 = new Kocsi(1, Color.pink, "k1");

		Mozdony m4 = new Mozdony(Color.magenta, "m1");
		TeherKocsi k15 = new TeherKocsi(Color.black, "th");

		Mozdony m5 = new Mozdony(Color.magenta, "m1");
		TeherKocsi k16 = new TeherKocsi(Color.black, "th");

		Mozdony m6 = new Mozdony(Color.magenta, "m1");
		TeherKocsi k17 = new TeherKocsi(Color.black, "th");

		Mozdony m7 = new Mozdony(Color.magenta, "m1");
		TeherKocsi k18 = new TeherKocsi(Color.black, "th");

		// Sinek létrehozása
		Sin s1 = new Sin("s1");
		Sin s2 = new Sin("s2");
		Sin s3 = new Sin("s3");
		Sin s4 = new Sin("s4");
		Sin s5 = new Sin("s4");
		Sin s6 = new Sin("s4");
		Sin s7 = new Sin("s4");
		Sin s8 = new Sin("s4");
		Sin s9 = new Sin("s4");
		Sin s10 = new Sin("s4");
		Sin s11 = new Sin("s4");
		Sin s12 = new Sin("s4");
		Sin s13 = new Sin("s4");
		Sin s14 = new Sin("s4");
		Sin s15 = new Sin("s4");
		Sin s16 = new Sin("s4");
		Sin s17 = new Sin("s4");
		Sin s18 = new Sin("s4");
		Sin s19 = new Sin("s4");
		Sin s20 = new Sin("s4");
		Sin s21 = new Sin("s4");
		Sin s22 = new Sin("s4");
		Sin s23 = new Sin("s4");
		Sin s24 = new Sin("s4");
		Sin s25 = new Sin("s4");
		Sin s26 = new Sin("s4");
		Sin s27 = new Sin("s4");
		Sin s28 = new Sin("s4");

		Sin s29 = new Sin("s4");
		Megallo s30 = new Megallo("s4", Color.black, 0);
		Megallo s31 = new Megallo("s4", Color.red, 0);
		Keresztezodes s32 = new Keresztezodes("s4");
		Megallo s33 = new Megallo("s4", Color.green, 0);
		Megallo s34 = new Megallo("s4", Color.gray, 0);
		Sin s35 = new Sin("s4");
		Megallo s36 = new Megallo("s4", Color.green, 0);
		Megallo s37 = new Megallo("s4", Color.gray, 0);
		Sin s38 = new Sin("s4");
		Megallo s39 = new Megallo("s4", Color.blue, 0);
		Megallo s40 = new Megallo("s4", Color.cyan, 0);
		Sin s41 = new Sin("s4");
		Megallo s42 = new Megallo("s4", Color.blue, 0);
		Megallo s43 = new Megallo("s4", Color.cyan, 0);

		Megallo s44 = new Megallo("s4", Color.black, 0);
		Megallo s45 = new Megallo("s4", Color.red, 0);
		Sin s46 = new Sin("s4");
		Megallo s47 = new Megallo("s4", Color.white, 0);
		Megallo s48 = new Megallo("s4", Color.yellow, 0);
		Sin s49 = new Sin("s4");
		Megallo s50 = new Megallo("s4", Color.white, 0);
		Megallo s51 = new Megallo("s4", Color.yellow, 0);

		Sin s52 = new Sin("s4");
		Sin s53 = new Sin("s4");
		Valto s54 = new Valto("s4");
		Sin s55 = new Sin("s4");
		Sin s56 = new Sin("s4");
		Sin s57 = new Sin("s4");

		Valto s58 = new Valto("s4");
		Sin s59 = new Sin("s4");
		Sin s60 = new Sin("s4");
		Sin s61 = new Sin("s4");
		Sin s62 = new Sin("s4");
		Sin s63 = new Sin("s4");

		Sin s64 = new Sin("s4");
		SpecialisHely s65 = new SpecialisHely("s4");
		Sin s66 = new Sin("s4");
		Sin s67 = new Sin("s4");
		SpecialisHely s68 = new SpecialisHely("s4");
		Sin s69 = new Sin("s4");

		Sin s70 = new Sin("s4");
		Sin s71 = new Sin("s4");
		SpecialisHely s72 = new SpecialisHely("s4");
		Sin s73 = new Sin("s4");
		Sin s74 = new Sin("s4");
		SpecialisHely s75 = new SpecialisHely("s4");

		Sin s76 = new Sin("s4");
		Sin s77 = new Sin("s4");
		Valto s78 = new Valto("s4");
		Sin s79 = new Sin("s4");
		Valto s80 = new Valto("s4");
		Keresztezodes s81 = new Keresztezodes("s4");
		Sin s82 = new Sin("s4");
		Sin s83 = new Sin("s4");
		Sin s84 = new Sin("s4");
		Sin s85 = new Sin("s4");
		Sin s86 = new Sin("s4");
		Sin s87 = new Sin("s4");

		Valto s88 = new Valto("s4");
		Sin s89 = new Sin("s4");
		Valto s90 = new Valto("s4");
		Sin s91 = new Sin("s4");
		Sin s92 = new Sin("s4");
		Sin s93 = new Sin("s4");
		Megallo s94 = new Megallo("m", Color.pink, 1);

		Sin s95 = new Sin("s4");
		Megallo s96 = new Megallo("m", Color.pink, 1);
		Sin s97 = new Sin("s4");
		Sin s98 = new Sin("s4");
		Valto s99 = new Valto("s4");
		Sin s100 = new Sin("s4");

		Valto s101 = new Valto("s4");
		Sin s102 = new Sin("s4");
		Sin s103 = new Sin("s4");
		Sin s104 = new Sin("s4");
		Sin s105 = new Sin("s4");
		Sin s106 = new Sin("s4");

		// Kocsik és sinek pályához adása
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

		// Sinek összekapcsolása

		s31.ad(s32);
		this.sinutkapcsolas(new Sin[] { s31, s30, s29, s51, s50, s49, s48, s47, s46, s45, s44 });
		s44.ad(s32);
		s43.ad(s32);
		this.sinutkapcsolas(new Sin[] { s43, s42, s41, s40, s39, s38, s37, s36, s35, s34, s33 });
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

		this.sinkorbekapcsolas(new Sin[] { s70, s71, s72, s73, s74, s75 });

		Sin[] egykor = new Sin[] { s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19,
				s20, s21, s22, s23, s24, s25, s26, s27, s28 };
		this.sinkorbekapcsolas(egykor);

		s53.ad(s54);
		this.sinutkapcsolas(new Sin[] { s53, s52, s57, s56, s55 });
		s55.ad(s54);
		s54.ad(s53);
		s54.ad(s55);
		s54.ad(s58);
		s59.ad(s58);
		this.sinutkapcsolas(new Sin[] { s59, s60, s61, s62, s63 });
		s63.ad(s58);
		s58.ad(s59);
		s58.ad(s63);
		s58.ad(s54);

		s77.ad(s78);
		this.sinutkapcsolas(new Sin[] { s77, s76, s87, s86, s85, s84, s83, s82 });
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
		this.sinutkapcsolas(new Sin[] { s91, s92, s93 });
		s93.ad(s81);
		s94.ad(s90);
		s94.ad(s81);

		this.sinkorbekapcsolas(new Sin[] { s95, s96, s97, s98, s99, s100 });
		this.sinkorbekapcsolas(new Sin[] { s101, s102, s103, s104, s105, s106 });
		s99.ad(s101);
		s101.ad(s99);

		// Kocsik összekapcsolása
		this.vonatkotes(new Kocsi[] { m1, k1, k2, k3, k4, k5, k6, k7, k8, k9, k10 });
		this.vonatkotes(new Kocsi[] { m2, k11, k12, k13 });
		this.vonatkotes(new Kocsi[] { m3, k14 });
		this.vonatkotes(new Kocsi[] { m4, k15 });
		this.vonatkotes(new Kocsi[] { m5, k16 });
		this.vonatkotes(new Kocsi[] { m6, k17 });
		this.vonatkotes(new Kocsi[] { m7, k18 });

		// Kocsik sinekhez adása, Sínek kocsikhoz adása
		try {
			this.vonatlerakas(new Kocsi[] { m2, k11, k12, k13 }, new Sin[] { s50, s49, s48, s47 });
			this.vonatlerakas(new Kocsi[] { m3, k14 }, new Sin[] { s105, s104 });
			this.vonatlerakas(new Kocsi[] { m4, k15 }, new Sin[] { s55, s54 });
			this.vonatlerakas(new Kocsi[] { m5, k16 }, new Sin[] { s66, s67 });
			this.vonatlerakas(new Kocsi[] { m6, k17 }, new Sin[] { s92, s91 });
			this.vonatlerakas(new Kocsi[] { m7, k18 }, new Sin[] { s61, s62 });
			this.vonatlerakas(new Kocsi[] { m1, k1, k2, k3, k4, k5, k6, k7, k8, k9, k10 },
					new Sin[] { s3, s2, s1, s28, s27, s26, s25, s24, s23, s22, s21 });
		} catch (EndGameException e) {
			// no worries
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
	 * Az elsõ igazi (lehetetlen) pálya
	 */
	public void elsopalya() {
		// tiszta lappal kezdés
		/*
		 * rajzolo.clear(); elemek=new ArrayList<Elem>(); mozdonytar = new
		 * Mozdonytar();
		 */
		rajzolo.xy = true;

		// Sin elemek
		Sin[] ss1 = new Sin[103];
		for (int i = 0; i < 103; i++) {
			ss1[i] = new Sin("s");
		}
		Keresztezodes[] ker = new Keresztezodes[3];
		for (int i = 0; i < 3; i++) {
			ker[i] = new Keresztezodes("s");
		}
		Valto[] valtok = new Valto[21];
		for (int i = 0; i < 21; i++) {
			valtok[i] = new Valto("s");
		}
		Sin[] kulonsinek = new Sin[5];
		for (int i = 0; i < 5; i++) {
			kulonsinek[i] = new Sin("s");
		}
		/*
		 * SpecialisHely[] spechelyek =new SpecialisHely[3]; for(int i=0; i<3;
		 * i++){ ss1[i]=new SpecialisHely("s"); }
		 */
		Sin[] ss2 = new Sin[10];
		for (int i = 0; i < 2; i++) {
			ss2[i] = new Sin("s");
		}
		ss2[2] = new SpecialisHely("s");
		for (int i = 3; i < 7; i++) {
			ss2[i] = new Sin("s");
		}
		ss2[7] = new Megallo("s", Color.green, 0);
		ss2[8] = new Megallo("s", Color.gray, 0);
		ss2[9] = new Sin("s");
		Sin[] ss3 = new Sin[4];
		ss3[0] = new Sin("s");
		ss3[1] = new Megallo("s", Color.red, 0);
		ss3[2] = new Megallo("s", Color.yellow, 0);
		ss3[3] = new Megallo("s", Color.blue, 0);

		Sin[] ss4 = new Sin[12];
		for (int i = 0; i < 12; i++) {
			ss4[i] = new Sin("s");
		}

		Sin[] ss5 = new Sin[20];
		for (int i = 0; i < 10; i++) {
			ss5[i] = new Sin("s");
		}
		ss5[10] = new Megallo("s", Color.green, 0);
		ss5[11] = new Megallo("s", Color.green, 1);
		ss5[12] = new Megallo("s", Color.green, 0);
		for (int i = 13; i < 20; i++) {
			ss5[i] = new Sin("s");
		}

		Sin[] ss6 = new Sin[6];
		ss6[0] = new Megallo("s", Color.black, 0);
		ss6[1] = new Megallo("s", Color.white, 0);
		ss6[2] = new Megallo("s", Color.pink, 0);
		ss6[3] = new Megallo("s", Color.cyan, 0);
		for (int i = 4; i < 6; i++) {
			ss6[i] = new Sin("s");
		}

		Sin[] ss7 = new Sin[4];
		for (int i = 0; i < 4; i++) {
			ss7[i] = new Sin("s");
		}

		Sin[] ss8 = new Sin[3];
		for (int i = 0; i < 3; i++) {
			ss8[i] = new Sin("s");
		}

		Sin[] ss9 = new Sin[3];
		for (int i = 0; i < 3; i++) {
			ss9[i] = new Sin("s");
		}

		Sin[] ss10 = new Sin[6];
		for (int i = 0; i < 3; i++) {
			ss10[i] = new Sin("s");
		}
		ss10[3] = new Megallo("s", Color.red, 0);
		ss10[4] = new Megallo("s", Color.white, 0);
		ss10[5] = new Megallo("s", Color.green, 0);

		Sin[] ss11 = new Sin[14];
		for (int i = 0; i < 14; i++) {
			ss11[i] = new Sin("s");
		}

		Sin[] ss12 = new Sin[4];
		for (int i = 0; i < 4; i++) {
			ss12[i] = new Sin("s");
		}

		Sin[] ss13 = new Sin[5];
		for (int i = 0; i < 5; i++) {
			ss13[i] = new Sin("s");
		}

		Sin[] ss14 = new Sin[7];
		for (int i = 0; i < 3; i++) {
			ss14[i] = new Sin("s");
		}
		ss14[3] = new Megallo("s", Color.cyan, 0);
		for (int i = 4; i < 7; i++) {
			ss14[i] = new Sin("s");
		}

		Sin[] ss15 = new Sin[7];
		for (int i = 0; i < 7; i++) {
			ss15[i] = new Sin("s");
		}
		Sin[] ss16 = new Sin[8];
		for (int i = 0; i < 8; i++) {
			ss16[i] = new Sin("s");
		}
		Sin[] ss17 = new Sin[2];
		for (int i = 0; i < 2; i++) {
			ss17[i] = new Sin("s");
		}
		Sin[] ss18 = new Sin[6];
		for (int i = 0; i < 6; i++) {
			ss18[i] = new Sin("s");
		}
		Sin[] ss19 = new Sin[5];
		for (int i = 0; i < 5; i++) {
			ss19[i] = new Sin("s");
		}
		Sin[] ss20 = new Sin[8];
		for (int i = 0; i < 8; i++) {
			ss20[i] = new Sin("s");
		}
		Sin[] ss21 = new Sin[2];
		for (int i = 0; i < 2; i++) {
			ss21[i] = new Sin("s");
		}

		Sin[] ss22 = new Sin[5];
		ss22[0] = new Megallo("s", Color.black, 0);
		for (int i = 1; i < 4; i++) {
			ss22[i] = new Sin("s");
		}
		ss22[4] = new Megallo("s", Color.pink, 1);

		Sin[] ss23 = new Sin[3];
		for (int i = 0; i < 3; i++) {
			ss23[i] = new Sin("s");
		}
		Sin[] ss24 = new Sin[2];
		ss24[0] = new Megallo("s", Color.gray, 0);
		ss24[1] = new Sin("s");

		Sin[] ss25 = new Sin[8];
		for (int i = 0; i < 4; i++) {
			ss25[i] = new Sin("s");
		}
		ss25[4] = new Megallo("s", Color.red, 0);
		ss25[5] = new Megallo("s", Color.blue, 0);
		ss25[6] = new Sin("s");
		ss25[7] = new Sin("s");

		Sin[] ss26 = new Sin[3];
		ss26[0] = new Sin("s");
		ss26[1] = new Megallo("s", Color.white, 0);
		ss26[2] = new Sin("s");

		Sin[] ss27 = new Sin[3];
		for (int i = 0; i < 3; i++) {
			ss27[i] = new Sin("s");
		}

		Sin[] ss28 = new Sin[5];
		for (int i = 0; i < 3; i++) {
			ss28[i] = new Sin("s");
		}
		ss28[3] = new Megallo("s", Color.yellow, 0);
		ss28[4] = new Sin("s");

		Sin[] ss29 = new Sin[7];
		for (int i = 0; i < 5; i++) {
			ss29[i] = new Sin("s");
		}
		ss29[5] = new Megallo("s", Color.blue, 0);
		ss29[6] = new Sin("s");
		SpecialisHely spec1 = new SpecialisHely("a");
		SpecialisHely spec2 = new SpecialisHely("a");
		// sinek taroloba rakása
		add(ss1);
		add(ss2);
		add(ss3);
		add(ss4);
		add(ss5);
		add(ss6);
		add(ss7);
		add(ss8);
		add(ss9);
		add(ss10);
		add(ss11);
		add(ss12);
		add(ss13);
		add(ss14);
		add(ss15);
		add(ss16);
		add(ss17);
		add(ss18);
		add(ss19);
		add(ss20);
		add(ss21);
		add(ss22);
		add(ss23);
		add(ss24);
		add(ss25);
		add(ss26);
		add(ss27);
		add(ss28);
		add(ss29);
		add(spec1);
		add(spec2);
		add(kulonsinek);
		add(ker);
		add(valtok);

		// sinek összekötése
		this.sinutkapcsolas(ss1);
		ss1[102].ad(ker[0]);
		ker[0].ad(ss3[0]);
		ker[0].ad(valtok[0]);
		ker[0].ad(ss1[102]);
		ker[0].ad(kulonsinek[0]);
		valtok[0].ad(ker[0]);
		valtok[0].ad(ss2[0]);
		valtok[0].ad(valtok[1]);
		ss2[0].ad(valtok[0]);
		this.sinutkapcsolas(ss2);
		ss2[9].ad(valtok[1]);
		valtok[1].ad(valtok[0]);
		valtok[1].ad(valtok[2]);
		valtok[1].ad(ss2[9]);

		valtok[6].ad(kulonsinek[0]);
		valtok[6].ad(kulonsinek[1]);
		valtok[6].ad(ss5[19]);
		valtok[7].ad(kulonsinek[1]);
		valtok[7].ad(ss8[0]);
		valtok[7].ad(kulonsinek[2]);

		valtok[2].ad(valtok[1]);
		valtok[2].ad(ss7[0]);
		valtok[2].ad(ss6[0]);
		ss7[0].ad(valtok[2]);
		this.sinutkapcsolas(ss7);
		ss7[3].ad(valtok[3]);
		ss6[0].ad(valtok[2]);
		this.sinutkapcsolas(ss6);
		ss6[5].ad(valtok[3]);
		valtok[3].ad(ss7[3]);
		valtok[3].ad(ss6[5]);
		valtok[3].ad(valtok[4]);

		ss3[0].ad(ker[0]);
		this.sinutkapcsolas(ss3);
		ss3[3].ad(valtok[20]);
		valtok[20].ad(ss3[3]);
		valtok[20].ad(ss5[0]);
		valtok[20].ad(ss4[0]);
		ss4[0].ad(valtok[20]);
		this.sinutkapcsolas(ss4);
		ss4[11].ad(valtok[19]);
		ss5[0].ad(valtok[20]);
		this.sinutkapcsolas(ss5);
		ss5[19].ad(valtok[6]);

		valtok[5].ad(ss10[0]);
		valtok[5].ad(ss9[0]);
		valtok[5].ad(kulonsinek[3]);
		ss10[0].ad(valtok[5]);
		this.sinutkapcsolas(ss10);
		ss10[5].ad(valtok[10]);
		ss9[0].ad(valtok[5]);
		this.sinutkapcsolas(ss9);
		ss9[2].ad(valtok[4]);
		valtok[4].ad(ss9[2]);
		valtok[4].ad(ss11[0]);
		valtok[4].ad(valtok[3]);
		ss11[0].ad(valtok[4]);
		this.sinutkapcsolas(ss11);
		ss11[13].ad(valtok[10]);
		valtok[10].ad(ss11[13]);
		valtok[10].ad(ss10[5]);
		valtok[10].ad(ker[1]);

		valtok[8].ad(ss8[2]);
		valtok[8].ad(ss12[0]);
		valtok[8].ad(valtok[11]);
		ss8[0].ad(valtok[7]);
		this.sinutkapcsolas(ss8);
		ss8[2].ad(valtok[8]);
		ss12[0].ad(valtok[8]);
		this.sinutkapcsolas(ss12);
		ss12[3].ad(valtok[9]);
		valtok[9].ad(ss12[3]);
		valtok[9].ad(ss13[0]);
		valtok[9].ad(ss14[0]);
		ss13[0].ad(valtok[9]);
		this.sinutkapcsolas(ss13);
		ss13[4].ad(ker[1]);
		ss14[0].ad(valtok[9]);
		this.sinutkapcsolas(ss14);
		ss14[6].ad(ker[1]);
		ss15[0].ad(ker[1]);
		this.sinutkapcsolas(ss15);
		ss15[6].ad(valtok[13]);

		ker[1].ad(ss14[6]);
		ker[1].ad(valtok[10]);
		ker[1].ad(ss13[4]);
		ker[1].ad(ss15[0]);

		kulonsinek[0].ad(ker[0]);
		kulonsinek[0].ad(valtok[6]);
		kulonsinek[1].ad(valtok[6]);
		kulonsinek[1].ad(valtok[7]);
		kulonsinek[2].ad(valtok[7]);
		kulonsinek[2].ad(kulonsinek[3]);
		kulonsinek[3].ad(kulonsinek[2]);
		kulonsinek[3].ad(valtok[5]);
		kulonsinek[4].ad(valtok[17]);
		kulonsinek[4].ad(valtok[16]);

		valtok[11].ad(ss17[0]);
		valtok[11].ad(ss16[0]);
		valtok[11].ad(valtok[8]);
		ss17[0].ad(valtok[11]);
		this.sinutkapcsolas(ss17);
		ss17[1].ad(valtok[12]);
		valtok[12].ad(ss17[1]);
		valtok[12].ad(ss16[7]);
		valtok[12].ad(ss18[0]);
		ss16[0].ad(valtok[11]);
		this.sinutkapcsolas(ss16);
		ss16[7].ad(valtok[12]);

		ss18[0].ad(valtok[12]);
		this.sinutkapcsolas(ss18);
		ss18[5].ad(valtok[13]);
		valtok[13].ad(ss19[0]);
		valtok[13].ad(ss18[5]);
		valtok[13].ad(ss15[6]);
		ss19[0].ad(valtok[13]);
		this.sinutkapcsolas(ss19);
		ss19[4].ad(valtok[14]);

		valtok[19].ad(ss21[0]);
		valtok[19].ad(ss4[11]);
		valtok[19].ad(ss20[0]);
		ss20[0].ad(valtok[19]);
		this.sinutkapcsolas(ss20);
		ss20[7].ad(valtok[18]);
		ss21[0].ad(valtok[19]);
		this.sinutkapcsolas(ss21);
		ss21[1].ad(valtok[17]);
		ss22[0].ad(valtok[17]);
		this.sinutkapcsolas(ss22);
		ss22[4].ad(valtok[18]);

		valtok[17].ad(ss21[1]);
		valtok[17].ad(kulonsinek[4]);
		valtok[17].ad(ss22[0]);
		valtok[18].ad(ss20[7]);
		valtok[18].ad(ss23[0]);
		valtok[18].ad(ss22[4]);
		ss23[0].ad(valtok[18]);
		this.sinutkapcsolas(ss23);
		ss23[2].ad(valtok[14]);
		valtok[14].ad(ss23[2]);
		valtok[14].ad(valtok[15]);
		valtok[14].ad(ss19[4]);

		valtok[16].ad(kulonsinek[4]);
		valtok[16].ad(ss25[0]);
		valtok[16].ad(ss24[0]);
		ss24[0].ad(valtok[16]);
		this.sinutkapcsolas(ss24);
		ss24[1].ad(ker[2]);
		valtok[15].ad(valtok[14]);
		valtok[15].ad(ss25[7]);
		valtok[15].ad(ss26[0]);
		ss25[0].ad(valtok[16]);
		this.sinutkapcsolas(ss25);
		ss25[7].ad(valtok[15]);
		ss26[0].ad(valtok[15]);
		this.sinutkapcsolas(ss26);
		ss26[2].ad(ker[2]);
		ss27[0].ad(ker[2]);
		this.sinutkapcsolas(ss27);
		ss27[2].ad(ker[2]);
		ker[2].ad(ss27[0]);
		ker[2].ad(ss26[2]);
		ker[2].ad(ss24[1]);
		ker[2].ad(ss27[2]);

		spec1.ad(ss28[0]);
		spec1.ad(ss29[6]);
		spec2.ad(ss28[4]);
		spec2.ad(ss29[0]);
		ss28[0].ad(spec1);
		this.sinutkapcsolas(ss28);
		ss28[4].ad(spec2);
		ss29[0].ad(spec2);
		this.sinutkapcsolas(ss29);
		ss29[6].ad(spec1);

		// Kocsik létrehozása
		Mozdony m1 = new Mozdony(Color.magenta, "m");
		Kocsi k1 = new Kocsi(1, Color.yellow, "k");
		Kocsi k2 = new Kocsi(2, Color.blue, "k");
		Kocsi k3 = new Kocsi(1, Color.red, "k");

		Mozdony m2 = new Mozdony(Color.magenta, "m");
		Kocsi k4 = new Kocsi(1, Color.green, "k");
		Kocsi k5 = new Kocsi(2, Color.white, "k");
		Kocsi k6 = new Kocsi(1, Color.green, "k");

		Mozdony m3 = new Mozdony(Color.magenta, "m");
		Kocsi k7 = new Kocsi(0, Color.pink, "k");
		Kocsi k8 = new Kocsi(2, Color.cyan, "k");
		TeherKocsi k9 = new TeherKocsi(Color.magenta, "k");

		Mozdony m4 = new Mozdony(Color.magenta, "m");
		Kocsi k10 = new Kocsi(1, Color.black, "k");
		Kocsi k11 = new Kocsi(1, Color.gray, "k");
		Kocsi k12 = new Kocsi(0, Color.red, "k");
		Kocsi k13 = new Kocsi(2, Color.pink, "k");
		TeherKocsi k14 = new TeherKocsi(Color.magenta, "k");
		TeherKocsi k15 = new TeherKocsi(Color.magenta, "k");

		Mozdony m5 = new Mozdony(Color.magenta, "m");
		TeherKocsi k16 = new TeherKocsi(Color.magenta, "k");
		TeherKocsi k17 = new TeherKocsi(Color.magenta, "k");

		// kocsik összekapcsolása
		this.vonatkotes(new Kocsi[] { m1, k1, k2, k3 });
		this.vonatkotes(new Kocsi[] { m2, k4, k5, k6 });
		this.vonatkotes(new Kocsi[] { m3, k7, k8, k9 });
		this.vonatkotes(new Kocsi[] { m4, k10, k11, k12, k13, k14, k15 });
		this.vonatkotes(new Kocsi[] { m5, k16, k17 });

		// kocsik taroloba rakása
		add(new Elem[] { m1, m2, m3, m4, m5, k1, k2, k3, k4, k5, k6, k7, k8, k9, k10, k11, k12, k13, k14, k15, k16,
				k17 });
		mozdonytar.ad(m1);
		mozdonytar.ad(m2);
		mozdonytar.ad(m3);
		mozdonytar.ad(m4);
		mozdonytar.ad(m5);

		// vonatok lerakasa
		try {
			this.vonatlerakas(new Kocsi[] { m1, k1, k2, k3 }, new Sin[] { ss1[93], ss1[92], ss1[91], ss1[90] });
			this.vonatlerakas(new Kocsi[] { m2, k4, k5, k6 }, new Sin[] { ss1[83], ss1[82], ss1[81], ss1[80] });
			this.vonatlerakas(new Kocsi[] { m3, k7, k8, k9 }, new Sin[] { ss1[68], ss1[67], ss1[66], ss1[65] });
			this.vonatlerakas(new Kocsi[] { m4, k10, k11, k12, k13, k14, k15 },
					new Sin[] { ss1[39], ss1[38], ss1[37], ss1[36], ss1[35], ss1[34], ss1[33], ss1[32] });
			this.vonatlerakas(new Kocsi[] { m5, k16, k17 }, new Sin[] { ss1[2], ss1[1], ss1[0] });
		} catch (EndGameException e) {
			// no worries
			e.printStackTrace();
		}

		// rajzolóba rakás
		rajzolo.adSin(ss1[96], 20, 1, "BJ");
		rajzolo.adSin(ss1[97], 19, 1, "BJ");
		rajzolo.adSin(ss1[98], 18, 1, "BJ");
		rajzolo.adSin(ss1[99], 17, 1, "BJ");
		rajzolo.adSin(ss1[100], 16, 1, "BJ");
		rajzolo.adSin(ss1[101], 15, 1, "BJ");
		rajzolo.adSin(ss1[102], 14, 1, "JL");
		rajzolo.adKeresztezodes(ker[0], 14, 2);
		rajzolo.adValto(valtok[0], 15, 2, "BJL");
		rajzolo.adSin(ss2[0], 16, 2, "BJ");
		rajzolo.adSin(ss2[1], 17, 2, "BJ");
		rajzolo.adSpecialisHely((SpecialisHely) ss2[2], 18, 2, "BJ");
		rajzolo.adSin(ss2[3], 19, 2, "BJ");
		rajzolo.adSin(ss2[4], 20, 2, "LB");
		rajzolo.adSin(ss2[5], 20, 3, "BF");
		rajzolo.adSin(ss2[6], 19, 3, "BJ");
		rajzolo.adMegallo((Megallo) ss2[7], 18, 3, "BJ");
		rajzolo.adMegallo((Megallo) ss2[8], 17, 3, "BJ");
		rajzolo.adSin(ss2[9], 16, 3, "BJ");
		rajzolo.adValto(valtok[1], 15, 3, "FLJ");
		rajzolo.adSin(kulonsinek[0], 14, 3, "FL");
		rajzolo.adSin(ss3[0], 13, 2, "BJ");
		rajzolo.adMegallo((Megallo) ss3[1], 12, 2, "BJ");
		rajzolo.adMegallo((Megallo) ss3[2], 11, 2, "BJ");
		rajzolo.adMegallo((Megallo) ss3[3], 10, 2, "BJ");
		rajzolo.adValto(valtok[20], 9, 2, "JBF");
		rajzolo.adSin(ss4[0], 9, 1, "LB");
		rajzolo.adSin(ss4[1], 8, 1, "BJ");
		rajzolo.adSin(ss4[2], 7, 1, "BJ");
		rajzolo.adSin(ss4[3], 6, 1, "BJ");
		rajzolo.adSin(ss4[4], 5, 1, "BJ");
		rajzolo.adSin(ss4[5], 4, 1, "BJ");
		rajzolo.adSin(ss4[6], 3, 1, "BJ");
		rajzolo.adSin(ss4[7], 2, 1, "BJ");
		rajzolo.adSin(ss4[8], 1, 1, "JL");
		rajzolo.adSin(ss4[9], 1, 2, "FL");
		rajzolo.adSin(ss4[10], 1, 3, "FL");
		rajzolo.adSin(ss4[11], 1, 4, "FL");
		rajzolo.adSin(ss5[0], 8, 2, "BJ");
		rajzolo.adSin(ss5[1], 7, 2, "BJ");
		rajzolo.adSin(ss5[2], 6, 2, "BJ");
		rajzolo.adSin(ss5[3], 5, 2, "BJ");
		rajzolo.adSin(ss5[4], 4, 2, "BJ");
		rajzolo.adSin(ss5[5], 3, 2, "BJ");
		rajzolo.adSin(ss5[6], 2, 2, "JL");
		rajzolo.adSin(ss5[7], 2, 3, "FL");
		rajzolo.adSin(ss5[8], 2, 4, "FJ");
		rajzolo.adSin(ss5[9], 3, 4, "BJ");
		rajzolo.adMegallo((Megallo) ss5[10], 4, 4, "BJ");
		rajzolo.adMegallo((Megallo) ss5[11], 5, 4, "BJ");
		rajzolo.adMegallo((Megallo) ss5[12], 6, 4, "BJ");
		rajzolo.adSin(ss5[13], 7, 4, "BJ");
		rajzolo.adSin(ss5[14], 8, 4, "BJ");
		rajzolo.adSin(ss5[15], 9, 4, "BJ");
		rajzolo.adSin(ss5[16], 10, 4, "BJ");
		rajzolo.adSin(ss5[17], 11, 4, "BJ");
		rajzolo.adSin(ss5[18], 12, 4, "BJ");
		rajzolo.adSin(ss5[19], 13, 4, "BJ");
		rajzolo.adValto(valtok[6], 14, 4, "FLB");
		rajzolo.adValto(valtok[2], 15, 4, "FLJ");
		rajzolo.adMegallo((Megallo) ss6[0], 16, 4, "BJ");
		rajzolo.adMegallo((Megallo) ss6[1], 17, 4, "BJ");
		rajzolo.adMegallo((Megallo) ss6[2], 18, 4, "BJ");
		rajzolo.adMegallo((Megallo) ss6[3], 19, 4, "BJ");
		rajzolo.adSin(ss6[4], 20, 4, "LB");
		rajzolo.adSin(ss6[5], 20, 5, "BF");
		rajzolo.adValto(valtok[3], 19, 5, "BJL");
		rajzolo.adSin(ss7[0], 15, 5, "FJ");
		rajzolo.adSin(ss7[1], 16, 5, "BJ");
		rajzolo.adSin(ss7[2], 17, 5, "BJ");
		rajzolo.adSin(ss7[3], 18, 5, "BJ");
		rajzolo.adSin(kulonsinek[1], 14, 5, "FL");
		rajzolo.adValto(valtok[7], 14, 6, "FLJ");
		rajzolo.adSin(kulonsinek[2], 15, 6, "BJ");
		rajzolo.adSin(kulonsinek[3], 16, 6, "LB");
		rajzolo.adValto(valtok[5], 16, 7, "BJF");
		rajzolo.adSin(ss10[0], 15, 7, "JL");
		rajzolo.adSin(ss10[1], 15, 8, "FL");
		rajzolo.adSin(ss10[2], 15, 9, "FL");
		rajzolo.adMegallo((Megallo) ss10[3], 15, 10, "FL");
		rajzolo.adMegallo((Megallo) ss10[4], 15, 11, "FL");
		rajzolo.adMegallo((Megallo) ss10[5], 15, 12, "FL");
		rajzolo.adSin(ss9[0], 17, 7, "BJ");
		rajzolo.adSin(ss9[1], 18, 7, "BF");
		rajzolo.adSin(ss9[2], 18, 6, "JL");
		rajzolo.adValto(valtok[4], 19, 6, "BJF");
		rajzolo.adValto(valtok[10], 15, 13, "LFB");
		rajzolo.adSin(ss11[0], 20, 6, "LB");
		rajzolo.adSin(ss11[1], 20, 7, "FL");
		rajzolo.adSin(ss11[2], 20, 8, "FL");
		rajzolo.adSin(ss11[3], 20, 9, "FL");
		rajzolo.adSin(ss11[4], 20, 10, "FL");
		rajzolo.adSin(ss11[5], 20, 11, "FL");
		rajzolo.adSin(ss11[6], 20, 12, "FL");
		rajzolo.adSin(ss11[7], 20, 13, "FL");
		rajzolo.adSin(ss11[8], 20, 14, "BF");
		rajzolo.adSin(ss11[9], 19, 14, "BJ");
		rajzolo.adSin(ss11[10], 18, 14, "BJ");
		rajzolo.adSin(ss11[11], 17, 14, "BJ");
		rajzolo.adSin(ss11[12], 16, 14, "BJ");
		rajzolo.adSin(ss11[13], 15, 14, "FJ");
		rajzolo.adSin(ss8[0], 14, 7, "BF");
		rajzolo.adSin(ss8[1], 13, 7, "BJ");
		rajzolo.adSin(ss8[2], 12, 7, "BJ");
		rajzolo.adValto(valtok[8], 11, 7, "JBF");
		rajzolo.adValto(valtok[9], 12, 9, "BJL");
		rajzolo.adSin(ss12[0], 10, 7, "JL");
		rajzolo.adSin(ss12[1], 10, 8, "FL");
		rajzolo.adSin(ss12[2], 10, 9, "FJ");
		rajzolo.adSin(ss12[3], 11, 9, "BJ");
		rajzolo.adSin(ss13[0], 13, 9, "BJ");
		rajzolo.adSin(ss13[1], 14, 9, "LB");
		rajzolo.adSin(ss13[2], 14, 10, "FL");
		rajzolo.adSin(ss13[3], 14, 11, "FL");
		rajzolo.adSin(ss13[4], 14, 12, "FL");
		rajzolo.adSin(ss14[0], 12, 10, "BF");
		rajzolo.adSin(ss14[1], 11, 10, "JL");
		rajzolo.adSin(ss14[2], 11, 11, "FL");
		rajzolo.adMegallo((Megallo) ss14[3], 11, 12, "FL");
		rajzolo.adSin(ss14[4], 11, 13, "FJ");
		rajzolo.adSin(ss14[5], 12, 13, "BJ");
		rajzolo.adSin(ss14[6], 13, 13, "BJ");
		rajzolo.adKeresztezodes(ker[1], 14, 13);
		rajzolo.adSin(ss15[0], 14, 14, "BF");
		rajzolo.adSin(ss15[1], 13, 14, "BJ");
		rajzolo.adSin(ss15[2], 12, 14, "BJ");
		rajzolo.adSin(ss15[3], 11, 14, "BJ");
		rajzolo.adSin(ss15[4], 10, 14, "BJ");
		rajzolo.adSin(ss15[5], 9, 14, "FJ");
		rajzolo.adSin(ss15[6], 9, 13, "LB");
		rajzolo.adValto(valtok[11], 11, 6, "BJL");
		rajzolo.adSin(ss17[0], 10, 6, "BJ");
		rajzolo.adSin(ss17[1], 9, 6, "BJ");
		rajzolo.adValto(valtok[12], 8, 6, "JBL");
		rajzolo.adSin(ss16[0], 12, 6, "BF");
		rajzolo.adSin(ss16[1], 12, 5, "LB");
		rajzolo.adSin(ss16[2], 11, 5, "BJ");
		rajzolo.adSin(ss16[3], 10, 5, "BJ");
		rajzolo.adSin(ss16[4], 9, 5, "BJ");
		rajzolo.adSin(ss16[5], 8, 5, "BJ");
		rajzolo.adSin(ss16[6], 7, 5, "JL");
		rajzolo.adSin(ss16[7], 7, 6, "FJ");
		rajzolo.adSin(ss18[0], 8, 7, "FL");
		rajzolo.adSin(ss18[1], 8, 8, "FL");
		rajzolo.adSin(ss18[2], 8, 9, "FL");
		rajzolo.adSin(ss18[3], 8, 10, "FL");
		rajzolo.adSin(ss18[4], 8, 11, "FL");
		rajzolo.adSin(ss18[5], 8, 12, "FL");
		rajzolo.adValto(valtok[13], 8, 13, "LFJ");
		rajzolo.adSin(ss19[0], 8, 14, "BF");
		rajzolo.adSin(ss19[1], 7, 14, "FJ");
		rajzolo.adSin(ss19[2], 7, 13, "FL");
		rajzolo.adSin(ss19[3], 7, 12, "LB");
		rajzolo.adSin(ss19[4], 6, 12, "BJ");
		rajzolo.adValto(valtok[19], 1, 5, "LFJ");
		rajzolo.adSin(ss20[0], 2, 5, "BJ");
		rajzolo.adSin(ss20[1], 3, 5, "BJ");
		rajzolo.adSin(ss20[2], 4, 5, "BJ");
		rajzolo.adSin(ss20[3], 5, 5, "BJ");
		rajzolo.adSin(ss20[4], 6, 5, "LB");
		rajzolo.adSin(ss20[5], 6, 6, "FL");
		rajzolo.adSin(ss20[6], 6, 7, "FL");
		rajzolo.adSin(ss20[7], 6, 8, "FL");
		rajzolo.adSin(ss21[0], 1, 6, "FL");
		rajzolo.adSin(ss21[1], 1, 7, "FL");
		rajzolo.adMegallo((Megallo) ss22[0], 2, 8, "BJ");
		rajzolo.adSin(ss22[1], 3, 8, "BJ");
		rajzolo.adSin(ss22[2], 4, 8, "LB");
		rajzolo.adSin(ss22[3], 4, 9, "FJ");
		rajzolo.adMegallo((Megallo) ss22[4], 5, 9, "BJ");
		rajzolo.adValto(valtok[17], 1, 8, "FLJ");
		rajzolo.adValto(valtok[18], 6, 9, "FLB");
		rajzolo.adSin(kulonsinek[4], 1, 9, "FL");
		rajzolo.adSin(ss23[0], 6, 10, "FL");
		rajzolo.adSin(ss23[1], 6, 11, "BF");
		rajzolo.adSin(ss23[2], 5, 11, "JL");
		rajzolo.adValto(valtok[14], 5, 12, "FLJ");
		rajzolo.adValto(valtok[16], 1, 10, "FLJ");
		rajzolo.adMegallo((Megallo) ss24[0], 2, 10, "BJ");
		rajzolo.adSin(ss24[1], 3, 10, "LB");
		rajzolo.adValto(valtok[15], 5, 13, "FLB");
		rajzolo.adSin(ss25[0], 1, 11, "FL");
		rajzolo.adSin(ss25[1], 1, 12, "FL");
		rajzolo.adSin(ss25[2], 1, 13, "FL");
		rajzolo.adSin(ss25[3], 1, 14, "FJ");
		rajzolo.adMegallo((Megallo) ss25[4], 2, 14, "BJ");
		rajzolo.adMegallo((Megallo) ss25[5], 3, 14, "BJ");
		rajzolo.adSin(ss25[6], 4, 14, "BJ");
		rajzolo.adSin(ss25[7], 5, 14, "BF");
		rajzolo.adSin(ss26[0], 4, 13, "FJ");
		rajzolo.adMegallo((Megallo) ss26[1], 4, 12, "FL");
		rajzolo.adSin(ss26[2], 4, 11, "LB");
		rajzolo.adKeresztezodes(ker[2], 3, 11);
		rajzolo.adSin(ss27[0], 2, 11, "JL");
		rajzolo.adSin(ss27[1], 2, 12, "FJ");
		rajzolo.adSin(ss27[2], 3, 12, "BF");
		rajzolo.adSpecialisHely(spec1, 19, 9, "LF");
		rajzolo.adSpecialisHely(spec2, 17, 11, "LF");
		rajzolo.adSin(ss28[0], 19, 10, "FL");
		rajzolo.adSin(ss28[1], 19, 11, "FL");
		rajzolo.adSin(ss28[2], 19, 12, "BF");
		rajzolo.adMegallo((Megallo) ss28[3], 18, 12, "BJ");
		rajzolo.adSin(ss28[4], 17, 12, "FJ");
		rajzolo.adSin(ss29[0], 17, 10, "LB");
		rajzolo.adSin(ss29[1], 16, 10, "FJ");
		rajzolo.adSin(ss29[2], 16, 9, "JL");
		rajzolo.adSin(ss29[3], 17, 9, "BF");
		rajzolo.adSin(ss29[4], 17, 8, "JL");
		rajzolo.adMegallo((Megallo) ss29[5], 18, 8, "BJ");
		rajzolo.adSin(ss29[6], 19, 8, "LB");

	}

	/**
	 * hozzáad egy elemet a Pályához
	 * 
	 * @param a
	 *            hozzáadandó elem
	 */
	public void add(Elem e) {
		elemek.add(e);
	}

	/**
	 * hozzáad egy elem tömböt Pályához
	 * 
	 * @param a
	 *            hozzáadandó tömb
	 */
	public void add(Elem[] e) {
		for (int i = 0; i < e.length; i++) {
			this.add(e[i]);
		}
	}

	/**
	 * Hozzáad egy elemet a Pályához és a mozdonytárhoz.
	 * 
	 * @param m
	 *            A hozzáadadndó mozdony.
	 */
	public void add(Mozdony m) {
		elemek.add(m);
		mozdonytar.ad(m);
	}

	/**
	 * lépteti az összes elemet a pályán
	 */
	public void leptetes() throws EndGameException {
		for (Elem e : elemek) {
			e.lep();
		}
		// System.out.println("léptem");
		if (!mozdonytar.vanNemUresVonat())
			throw new EndGameException(true);
	}

	/**
	 * egy kör sint lehet összekapcsolni
	 * 
	 * @param tomb
	 *            az összekapcsolandó elemek tömbje
	 */
	public void sinkorbekapcsolas(Sin[] tomb) {
		tomb[0].ad(tomb[tomb.length - 1]);
		for (int i = 1; i < tomb.length; i++) {
			tomb[i - 1].ad(tomb[i]);
			tomb[i].ad(tomb[i - 1]);
		}
		tomb[tomb.length - 1].ad(tomb[0]);
	}

	/**
	 * Egy vonat kocsijait kapcsolja össze
	 * 
	 * @param tomb
	 *            az összekapcsolandó elemek tömbje
	 */
	public void vonatkotes(Kocsi[] tomb) {
		for (int i = 1; i < tomb.length; i++) {
			tomb[i - 1].ad(tomb[i]);
			tomb[i].ad(tomb[i - 1]);
		}
	}

	/**
	 * A vonat kocsijait rárakja a sinre
	 * 
	 * @param kocsik
	 *            az lerakandó kocsik tömbje
	 * @param sinek
	 *            a sinek ahova rakjuk a kocsikat
	 */
	public void vonatlerakas(Kocsi[] kocsik, Sin[] sinek) throws EndGameException {
		if (kocsik.length != sinek.length) {
			System.out.println("sinlerakas hiba");
		}
		for (int i = 0; i < kocsik.length; i++) {
			kocsik[i].ad(sinek[i]);
			sinek[i].ad(kocsik[i]);
		}
	}

	/**
	 * Egy útnyi Sint kapcsol össze
	 * 
	 * @param tomb
	 *            az összekapcsolandó elemek tömbje
	 */
	public void sinutkapcsolas(Sin[] tomb) {
		for (int i = 1; i < tomb.length; i++) {
			tomb[i - 1].ad(tomb[i]);
			tomb[i].ad(tomb[i - 1]);
		}
	}

}
