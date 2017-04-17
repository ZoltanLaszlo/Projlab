package projlabszkeleton;

import java.awt.Color;

import org.junit.Assert;
import org.junit.Test;

public class ProgramTest {
	
	@Test
	public void testNo1() throws EndGameException{		//A vonat léptetése sima sín elemen
		//Pálya létrehozása
		Palya P1=new Palya();
		
		//Kocsik létrehozása
		Mozdony m1=new Mozdony(Color.black, "m1");
		Kocsi k1= new Kocsi(1, Color.black, "k1");
		Kocsi k2= new Kocsi(1, Color.black, "k2");
		
		//Sinek létrehozása
		Sin s1= new Sin("s1");
		Sin s2= new Sin("s2");
		Sin s3= new Sin("s3");
		Sin s4= new Sin("s4");
		
		//Kocsik és sinek pályához adása
		P1.add(s1);
		P1.add(s2);
		P1.add(s3);
		P1.add(s4);
		P1.add(m1);
		P1.add(k1);
		P1.add(k2);
		
		//Sinek összekapcsolása		s1 -> s2 -> s3 -> s4
		s2.ad(s1);
		s2.ad(s3);
		s3.ad(s2);
		s3.ad(s4);
		s4.ad(s3);
		
		//Kocsik összekapcsolása	k2 - k1 - m1
		m1.ad(k1);
		k1.ad(m1);
		k1.ad(k2);
		k2.ad(k1);
		
		//Kocsik sinekhez adása
		s3.ad(m1);
		s2.ad(k1);
		s1.ad(k2);
		
		//Sínek kocsikhoz adása
		m1.ad(s3);
		k1.ad(s2);
		k2.ad(s1);
		
		//Léptetés
		P1.leptetes();
		Assert.assertEquals("m1 s4 0", "m1 " + m1.sinem().id + " " + m1.utasokSzama);
		Assert.assertEquals("k1 s3 1", "k1 " + k1.sinem().id + " " + k1.utasokSzama);
		Assert.assertEquals("k2 s2 1", "k2 " + k2.sinem().id + " " + k2.utasokSzama);
		
	}
	
	@Test
	public void testNo2() throws EndGameException { // Vonat lépése kereszteződésen keresztül
		// Pálya létrehozása
		Palya P1 = new Palya();

		// Kocsik létrehozása
		Mozdony m1 = new Mozdony(Color.black, "m1");
		Kocsi k1 = new Kocsi(1, Color.black, "k1");
		Kocsi k2 = new Kocsi(1, Color.black, "k2");

		// Sinek létrehozása
		Sin s1 = new Sin("s1");
		Sin s2 = new Sin("s2");
		Sin s3 = new Sin("s3");
		Keresztezodes ker = new Keresztezodes("ker");
		Sin s4 = new Sin("s4");
		Sin s5 = new Sin("s5");
		Sin s6 = new Sin("s6");

		// Kocsik és sinek pályához adása
		P1.add(s1);
		P1.add(s2);
		P1.add(s3);
		P1.add(s4);
		P1.add(ker);
		P1.add(s5);
		P1.add(s6);
		P1.add(m1);
		P1.add(k1);
		P1.add(k2);

		// Sinek összekapcsolása 	s1 -> s2 -> s3 -> ker -> s4,s5,s6
		s2.ad(s1);
		s2.ad(s3);
		s3.ad(s2);
		s3.ad(ker);
		ker.ad(s3);
		ker.ad(s4);
		ker.ad(s5);
		ker.ad(s6);

		// Kocsik összekapcsolása 	k2 - k1 - m1
		m1.ad(k1);
		k1.ad(m1);
		k1.ad(k2);
		k2.ad(k1);

		// Kocsik sinekhez adása	s1,k2 -> s2,k1 -> s3,m1
		s3.ad(m1);
		s2.ad(k1);
		s1.ad(k2);

		// Sínek kocsikhoz adása
		m1.ad(s3);
		k1.ad(s2);
		k2.ad(s1);

		// Léptetés
		P1.leptetes();
		Assert.assertEquals("m1 ker 0", "m1 " + m1.sinem().id + " " + m1.utasokSzama);
		Assert.assertEquals("k1 s3 1", "k1 " + k1.sinem().id + " " + k1.utasokSzama);
		Assert.assertEquals("k2 s2 1", "k2 " + k2.sinem().id + " " + k2.utasokSzama);
		
		P1.leptetes();
		Assert.assertEquals("m1 s4 0", "m1 " + m1.sinem().id + " " + m1.utasokSzama);
		Assert.assertEquals("k1 ker 1", "k1 " + k1.sinem().id + " " + k1.utasokSzama);
		Assert.assertEquals("k2 s3 1", "k2 " + k2.sinem().id + " " + k2.utasokSzama);
	}
	
	@Test
	public void testNo3() throws EndGameException{		//A vonat léptetése speciális helyen keresztül, ha nincs kapu
		//Pálya létrehozása
		Palya P1=new Palya();
		
		//Kocsik létrehozása
		Mozdony m1=new Mozdony(Color.black, "m1");
		Kocsi k1= new Kocsi(1, Color.black, "k1");
		Kocsi k2= new Kocsi(1, Color.black, "k2");
		
		//Sinek létrehozása
		Sin s1= new Sin("s1");
		Sin s2= new Sin("s2");
		Sin s3= new Sin("s3");
		Sin spec = new SpecialisHely("spec");
		Sin s4= new Sin("s4");
		
		//Kocsik és sinek pályához adása
		P1.add(s1);
		P1.add(s2);
		P1.add(s3);
		P1.add(spec);
		P1.add(s4);
		P1.add(m1);
		P1.add(k1);
		P1.add(k2);
		
		//Sinek összekapcsolása		s1 -> s2 -> s3 -> spec -> s4
		s2.ad(s1);
		s2.ad(s3);
		s3.ad(s2);
		s3.ad(spec);
		spec.ad(s3);
		spec.ad(s4);
		s4.ad(spec);
		
		//Kocsik összekapcsolása	k2 - k1 - m1
		m1.ad(k1);
		k1.ad(m1);
		k1.ad(k2);
		k2.ad(k1);
		
		//Kocsik sinekhez adása		s1,k2 -> s2,k1 -> s3,m1
		s3.ad(m1);
		s2.ad(k1);
		s1.ad(k2);
		
		//Sínek kocsikhoz adása
		m1.ad(s3);
		k1.ad(s2);
		k2.ad(s1);
		
		//Léptetés
		P1.leptetes();
		Assert.assertEquals("m1 spec 0", "m1 " + m1.sinem().id + " " + m1.utasokSzama);
		Assert.assertEquals("k1 s3 1", "k1 " + k1.sinem().id + " " + k1.utasokSzama);
		Assert.assertEquals("k2 s2 1", "k2 " + k2.sinem().id + " " + k2.utasokSzama);
		
		P1.leptetes();
		Assert.assertEquals("m1 s4 0", "m1 " + m1.sinem().id + " " + m1.utasokSzama);
		Assert.assertEquals("k1 spec 1", "k1 " + k1.sinem().id + " " + k1.utasokSzama);
		Assert.assertEquals("k2 s3 1", "k2 " + k2.sinem().id + " " + k2.utasokSzama);
	}
	@Test
	public void testNo4() throws EndGameException, TooManyKapuException{		//A vonat léptetése alagúton keresztül
		//Pálya létrehozása
		Palya P1=new Palya();
		
		//Kocsik létrehozása
		Mozdony m1=new Mozdony(Color.black, "m1");
		Kocsi k1= new Kocsi(1, Color.black, "k1");
		Kocsi k2= new Kocsi(1, Color.black, "k2");
		
		//Sinek létrehozása
		Sin s1= new Sin("s1");
		Sin s2= new Sin("s2");
		Sin s3= new Sin("s3");
		Sin spec1 = new SpecialisHely("spec1");
		Sin spec2 = new SpecialisHely("spec2");
		Sin s4= new Sin("s4");
		Sin s5= new Sin("s5");
		Sin s6= new Sin("s6");
		Sin s7= new Sin("s7");
		
		//Kocsik és sinek pályához adása
		P1.add(m1);
		P1.add(k1);
		P1.add(k2);
		P1.add(s1);
		P1.add(s2);
		P1.add(s3);
		P1.add(spec1);
		P1.add(spec2);
		P1.add(s4);
		P1.add(s5);
		P1.add(s6);
		P1.add(s7);
		
		//Sinek összekapcsolása		s1 -> s2 -> s3 -> spec -> s4, s6 -> spec2 -> s7 -> s5
		s1.ad(s2);
		s2.ad(s1);
		s2.ad(s3);
		s3.ad(s2);
		s3.ad(spec1);
		spec1.ad(s3);
		spec1.ad(s4);
		s4.ad(spec1);
		s6.ad(spec2);
		spec2.ad(s7);
		spec2.ad(s6);
		s7.ad(spec2);
		s7.ad(s5);
		s5.ad(s7);
		
		//Kocsik összekapcsolása	k2 - k1 - m1
		m1.ad(k1);
		k1.ad(m1);
		k1.ad(k2);
		k2.ad(k1);
		
		//Kocsik sinekhez adása		s1,k2 -> s2,k1 -> s3,m1
		s3.ad(m1);
		s2.ad(k1);
		s1.ad(k2);
		
		//Sínek kocsikhoz adása
		m1.ad(s3);
		k1.ad(s2);
		k2.ad(s1);
		
		//kapuk lerakása a spechelyekre
		spec1.akcio();
		spec2.akcio();
		
		//Léptetés
		P1.leptetes();
		Assert.assertEquals("m1 spec1 0", "m1 " + m1.sinem().id + " " + m1.utasokSzama);
		Assert.assertEquals("k1 s3 1", "k1 " + k1.sinem().id + " " + k1.utasokSzama);
		Assert.assertEquals("k2 s2 1", "k2 " + k2.sinem().id + " " + k2.utasokSzama);
		
		P1.leptetes(); //mozdony belép az alagútba
		P1.leptetes(); //mozdony alagutban 2. helyen
		P1.leptetes(); //mozdony alagutban 3. helyen
		P1.leptetes(); //mozdony spec2
		Assert.assertEquals("m1 spec2 0", "m1 " + m1.sinem().id + " " + m1.utasokSzama);
		P1.leptetes(); //mozdony s7
		P1.leptetes(); //mozdony s5
		
		Assert.assertEquals("m1 s5 0", "m1 " + m1.sinem().id + " " + m1.utasokSzama);
		Assert.assertEquals("k1 s7 1", "k1 " + k1.sinem().id + " " + k1.utasokSzama);
		Assert.assertEquals("k2 spec2 1", "k2 " + k2.sinem().id + " " + k2.utasokSzama);
	}
	@Test
	public void testNo5() {		//Ütközés sima Sín elemen
		//Pálya létrehozása
		Palya P1 = new Palya();
		
		//Kocsik létrehozása
		Mozdony m1 = new Mozdony(Color.black, "m1");
		Mozdony m2 = new Mozdony(Color.black, "m2");
		Kocsi k1 = new Kocsi(1, Color.black, "k1");
		Kocsi k2 = new Kocsi(1, Color.black, "k2");
		
		//Sinek létrehozása
		Sin s1 = new Sin("s1");
		Sin s2 = new Sin("s2");
		Sin s3 = new Sin("s3");
		Sin s4 = new Sin("s4");
		Sin s5 = new Sin("s5");
		
		//Kocsik és sinek pályához adása
		P1.add(s1);
		P1.add(s2);
		P1.add(s3);
		P1.add(s4);
		P1.add(s5);
		P1.add(m1);
		P1.add(m2);
		P1.add(k1);
		P1.add(k2);
		
		//Sinek összekapcsolása		s1 -> s2 -> s3 -> s4
		s2.ad(s1);
		s2.ad(s3);
		s3.ad(s2);
		s3.ad(s4);
		s4.ad(s3);
		s4.ad(s5);
		s5.ad(s4);
		
		//Kocsik összekapcsolása	k1 - m1;	k2 - m2
		m1.ad(k1);
		k1.ad(m1);
		m2.ad(k2);
		k2.ad(m2);
		
		//Kocsik sinekhez adása		s1,k1 - s2,m1 - s3 - s4,m2 - s5,k2
		try{
			s2.ad(m1);
			s1.ad(k1);
			s4.ad(m2);
			s5.ad(k2);
		}catch(EndGameException e){
			//nothing will go wrong here
		}

		
		//Sínek kocsikhoz adása
		m1.ad(s2);
		k1.ad(s1);
		m2.ad(s4);
		k2.ad(s5);
		
		//Léptetés
		try{
			P1.leptetes();
			Assert.fail("An EndGameException should be thrown");	//ha nem keletkezik kivétel -> fail
		}catch(EndGameException e){
			Assert.assertEquals(false, e.result());
		}
	}
	
	@Test
	public void testNo6() {		//Ütközés egy megállón
		//Pálya létrehozása
		Palya P1 = new Palya();
		
		//Kocsik létrehozása
		Mozdony m1 = new Mozdony(Color.black, "m1");
		Mozdony m2 = new Mozdony(Color.black, "m2");
		Kocsi k1 = new Kocsi(1, Color.black, "k1");
		Kocsi k2 = new Kocsi(1, Color.black, "k2");
		
		//Sinek létrehozása
		Sin s1 = new Sin("s1");
		Sin s2 = new Sin("s2");
		Sin s3 = new Megallo("s3", Color.red, 0);
		Sin s4 = new Sin("s4");
		Sin s5 = new Sin("s5");
		
		//Kocsik és sinek pályához adása
		P1.add(s1);
		P1.add(s2);
		P1.add(s3);
		P1.add(s4);
		P1.add(s5);
		P1.add(m1);
		P1.add(m2);
		P1.add(k1);
		P1.add(k2);
		
		//Sinek összekapcsolása		s1 -> s2 -> s3 -> s4
		s2.ad(s1);
		s2.ad(s3);
		s3.ad(s2);
		s3.ad(s4);
		s4.ad(s3);
		s4.ad(s5);
		s5.ad(s4);
		
		//Kocsik összekapcsolása	k1 - m1;	k2 - m2
		m1.ad(k1);
		k1.ad(m1);
		m2.ad(k2);
		k2.ad(m2);
		
		//Kocsik sinekhez adása		s1,k1 - s2,m1 - s3 - s4,m2 - s5,k2
		try{
			s2.ad(m1);
			s1.ad(k1);
			s4.ad(m2);
			s5.ad(k2);
		}catch(EndGameException e){
			//nothing will go wrong here
		}

		
		//Sínek kocsikhoz adása
		m1.ad(s2);
		k1.ad(s1);
		m2.ad(s4);
		k2.ad(s5);
		
		//Léptetés
		try{
			P1.leptetes();
			Assert.fail("An EndGameException should be thrown");	//ha nem keletkezik kivétel -> fail
		}catch(EndGameException e){
			Assert.assertEquals(false, e.result());
		}
	}
	
	@Test
	public void testNo7() {		//Ütközés váltón
		//Pálya létrehozása
		Palya P1 = new Palya();
		
		//Kocsik létrehozása
		Mozdony m1 = new Mozdony(Color.black, "m1");
		Mozdony m2 = new Mozdony(Color.black, "m2");
		Kocsi k1 = new Kocsi(1, Color.black, "k1");
		Kocsi k2 = new Kocsi(1, Color.black, "k2");
		
		//Sinek létrehozása
		Sin s1 = new Sin("s1");
		Sin s2 = new Sin("s2");
		Sin s3 = new Sin("s3");
		Sin valt = new Valto("valt");
		Sin s4 = new Sin("s4");
		Sin s5 = new Sin("s5");
		
		//Kocsik és sinek pályához adása
		P1.add(s1);
		P1.add(s2);
		P1.add(s3);
		P1.add(valt);
		P1.add(s4);
		P1.add(s5);
		P1.add(m1);
		P1.add(m2);
		P1.add(k1);
		P1.add(k2);
		
		//Sinek összekapcsolása		s1 - valt - s2 - s3
		//							 		  - s4 - s5
		valt.ad(s1);
		valt.ad(s2);
		valt.ad(s4);
		s2.ad(valt);
		s2.ad(s3);
		s3.ad(s2);
		s4.ad(valt);
		s4.ad(s5);
		s5.ad(s4);
		
		//Kocsik összekapcsolása	k1 - m1;	k2 - m2
		m1.ad(k1);
		k1.ad(m1);
		m2.ad(k2);
		k2.ad(m2);
		
		//Kocsik sinekhez adása		s1 - valt - s2,m1 - s3,k1
		//									  - s4,m2 - s5,k2
		try{
			s2.ad(m1);
			s3.ad(k1);
			s4.ad(m2);
			s5.ad(k2);
		}catch(EndGameException e){
			//nothing will go wrong here
		}

		
		//Sínek kocsikhoz adása
		m1.ad(s2);
		k1.ad(s3);
		m2.ad(s4);
		k2.ad(s5);
		
		//Léptetés
		try{
			P1.leptetes();
			Assert.fail("An EndGameException should be thrown");	//ha nem keletkezik kivétel -> fail
		}catch(EndGameException e){
			Assert.assertEquals(false, e.result());
		}
	}
	
	@Test
	public void testNo8() {		//Ütközés egy kereszteződésben
		//Pálya létrehozása
		Palya P1 = new Palya();
		
		//Kocsik létrehozása
		Mozdony m1 = new Mozdony(Color.black, "m1");
		Mozdony m2 = new Mozdony(Color.black, "m2");
		Kocsi k1 = new Kocsi(1, Color.black, "k1");
		Kocsi k2 = new Kocsi(1, Color.black, "k2");
		
		//Sinek létrehozása
		Sin s1 = new Sin("s1");
		Sin s2 = new Sin("s2");
		Sin s3 = new Sin("s3");
		Sin ker = new Keresztezodes("ker");
		Sin s4 = new Sin("s4");
		Sin s5 = new Sin("s5");
		Sin s6 = new Sin("s6");
		
		//Kocsik és sinek pályához adása
		P1.add(s1);
		P1.add(s2);
		P1.add(s3);
		P1.add(ker);
		P1.add(s4);
		P1.add(s5);
		P1.add(s6);
		P1.add(m1);
		P1.add(m2);
		P1.add(k1);
		P1.add(k2);
		//									 - s2 - s3
		//Sinek összekapcsolása		s1 - ker - s6 
		//							 		 - s4 - s5
		ker.ad(s1);
		ker.ad(s6);
		ker.ad(s2);
		ker.ad(s4);
		s2.ad(ker);
		s2.ad(s3);
		s3.ad(s2);
		s4.ad(ker);
		s4.ad(s5);
		s5.ad(s4);
		s6.ad(ker);
		
		//Kocsik összekapcsolása	k1 - m1;	k2 - m2
		m1.ad(k1);
		k1.ad(m1);
		m2.ad(k2);
		k2.ad(m2);
		//		 							 - s2,m1 - s3,k1
		//Kocsik sinekhez adása		s1 - ker - s6
		//							 		 - s4,m2 - s5,k2
		try{
			s2.ad(m1);
			s3.ad(k1);
			s4.ad(m2);
			s5.ad(k2);
		}catch(EndGameException e){
			//nothing will go wrong here
		}

		
		//Sínek kocsikhoz adása
		m1.ad(s2);
		k1.ad(s3);
		m2.ad(s4);
		k2.ad(s5);
		
		//Léptetés
		try{
			P1.leptetes();
			Assert.fail("An EndGameException should be thrown");	//ha nem keletkezik kivétel -> fail
		}catch(EndGameException e){
			Assert.assertEquals(false, e.result());
		}
	}
	
	@Test
	public void testNo9() {		//Győzelem
		//Pálya létrehozása
		Palya P1 = new Palya();
		
		//Kocsik létrehozása
		Mozdony m1 = new Mozdony(Color.black, "m1");
		Kocsi k1 = new Kocsi(1, Color.red, "k1");

		//Sinek létrehozása
		Sin s1 = new Sin("s1");
		Sin s2 = new Sin("s2");
		Sin megallo = new Megallo("megallo", Color.red, 0);
		Sin s3 = new Sin("s3");
		Sin s4 = new Sin("s4");
		
		//Kocsik és sinek pályához adása
		P1.add(s1);
		P1.add(s2);
		P1.add(megallo);
		P1.add(s3);
		P1.add(s4);
		P1.add(m1);
		P1.add(k1);

		
		//Sinek összekapcsolása		s1 -> s2 -> megallo -> s3 -> s4
		s2.ad(s1);
		s2.ad(megallo);
		megallo.ad(s2);
		megallo.ad(s3);
		s3.ad(megallo);
		s3.ad(s4);
		s4.ad(s3);
		
		//Kocsik összekapcsolása	k1 - m1
		m1.ad(k1);
		k1.ad(m1);
		
		//Kocsik sinekhez adása		s1,k1 -> s2,m1 -> megallo -> s3 -> s4
		try{
			s1.ad(k1);
			s2.ad(m1);
		}catch(EndGameException e){
			//nothing will go wrong here
		}
		
		//Sínek kocsikhoz adása
		m1.ad(s2);
		k1.ad(s1);
		
		//Léptetés
		try{
			P1.leptetes();
			P1.leptetes();
			P1.leptetes();
			Assert.fail("An EndGameException should be thrown");	//ha nem keletkezik kivétel -> fail
		}catch(EndGameException e){
			Assert.assertEquals(true, e.result());
		}
	}
	@Test
	public void testNo10() throws EndGameException, TooManyKapuException{		//Kapu felvétele
		//Pálya létrehozása
		Palya P1=new Palya();
		
		//Kocsik létrehozása
		Mozdony m1=new Mozdony(Color.black, "m1");
		Kocsi k1= new Kocsi(1, Color.black, "k1");
		
		//Sinek létrehozása
		Sin s1= new Sin("s1");
		Sin s2= new Sin("s2");
		SpecialisHely spec1 = new SpecialisHely("spec1");
		SpecialisHely spec2 = new SpecialisHely("spec2");
		SpecialisHely spec3 = new SpecialisHely("spec3");
		
		//Kocsik és sinek pályához adása
		P1.add(m1);
		P1.add(k1);
		P1.add(s1);
		P1.add(s2);
		P1.add(spec1);
		P1.add(spec2);
		P1.add(spec3);
		
		//Sinek összekapcsolása		s1 -> s2 -> spec1 -> spec2 -> spec3
		s1.ad(s2);
		s2.ad(s1);
		s2.ad(spec1);
		spec1.ad(s2);
		spec1.ad(spec2);
		spec2.ad(spec1);
		spec2.ad(spec3);
		spec3.ad(spec2);
		
		//Kocsik összekapcsolása	k1 - m1
		m1.ad(k1);
		k1.ad(m1);
		
		//Kocsik sinekhez adása		
		s2.ad(m1);
		s1.ad(k1);
		
		//Sínek kocsikhoz adása
		m1.ad(s2);
		k1.ad(s1);
		
		//kapuk lerakása a spechelyre , majd felvétele
		spec1.akcio();
		spec1.akcio();
		
		//Léptetés
		Assert.assertEquals("spec1 false",  spec1.id + " " + spec1.vankapu());
		Assert.assertEquals("spec2 false",  spec2.id + " " + spec2.vankapu());
		Assert.assertEquals("spec3 false",  spec3.id + " " + spec3.vankapu());
	}	
	@Test
	public void testNo11() throws EndGameException{		//Kapu lerakasa
		//Pálya létrehozása
		Palya P1=new Palya();
		
		//Kocsik létrehozása
		Mozdony m1=new Mozdony(Color.black, "m1");
		Kocsi k1= new Kocsi(1, Color.black, "k1");
		
		//Sinek létrehozása
		Sin s1= new Sin("s1");
		Sin s2= new Sin("s2");
		SpecialisHely spec1 = new SpecialisHely("spec1");
		SpecialisHely spec2 = new SpecialisHely("spec2");
		SpecialisHely spec3 = new SpecialisHely("spec3");
		
		//Kocsik és sinek pályához adása
		P1.add(m1);
		P1.add(k1);
		P1.add(s1);
		P1.add(s2);
		P1.add(spec1);
		P1.add(spec2);
		P1.add(spec3);
		
		//Sinek összekapcsolása		s1 -> s2 -> spec1 -> spec2 -> spec3
		s1.ad(s2);
		s2.ad(s1);
		s2.ad(spec1);
		spec1.ad(s2);
		spec1.ad(spec2);
		spec2.ad(spec1);
		spec2.ad(spec3);
		spec3.ad(spec2);
		
		//Kocsik összekapcsolása	k1 - m1
		m1.ad(k1);
		k1.ad(m1);
		
		//Kocsik sinekhez adása		
		s2.ad(m1);
		s1.ad(k1);
		
		//Sínek kocsikhoz adása
		m1.ad(s2);
		k1.ad(s1);
		
		//kapuk lerakása a spechelyekre
		try{
		spec1.akcio();
		spec2.akcio();
		Assert.assertEquals("spec1 true",  spec1.id + " " + spec1.vankapu());
		Assert.assertEquals("spec2 true",  spec2.id + " " + spec2.vankapu());
		Assert.assertEquals("spec3 false",  spec3.id + " " + spec3.vankapu());
		Assert.assertNotEquals(null, spec1.kapu());
		Assert.assertNotEquals(null, spec2.kapu());
		Assert.assertEquals(null, spec3.kapu());
		
			P1.leptetes();
			P1.leptetes();
			P1.leptetes();
			spec3.akcio();
			Assert.fail("A TooManyKapuException should be thrown");	//ha nem keletkezik kivétel -> fail
			
		}catch(TooManyKapuException e){
			Assert.assertEquals("Error: Nem epithetsz harmadik kaput", e.print());
		}
		
	}
	
	@Test
	public void testNo12() throws EndGameException{		//utasok leszallasa
		//Pálya létrehozása
		Palya P1 = new Palya();
		
		//Kocsik létrehozása
		Mozdony m1 = new Mozdony(Color.black, "m1");
		Kocsi k1 = new Kocsi(1, Color.red, "k1");
		Kocsi k2 = new Kocsi(1, Color.green, "k2");
		
		//Sinek létrehozása
		Sin s1 = new Sin("s1");
		Sin s2 = new Sin("s2");
		Sin s3 = new Sin("s3");
		Megallo megallo = new Megallo("megallo", Color.red, 0);
		
		//Kocsik és sinek pályához adása
		P1.add(s1);
		P1.add(s2);
		P1.add(s3);
		P1.add(megallo);
		P1.add(m1);
		P1.add(k1);
		P1.add(k2);
		//Sinek összekapcsolása		s1 - megallo - s2 - s3 
		s1.ad(megallo);
		megallo.ad(s1);
		megallo.ad(s2);
		s2.ad(megallo);
		s2.ad(s3);
		s3.ad(s2);
		
		//Kocsik összekapcsolása	k2 - k1 - m1
		m1.ad(k1);
		k1.ad(m1);
		k1.ad(k2);
		k2.ad(k1);
		//Kocsik sinekhez adása
		s2.ad(m1);
		megallo.ad(k1);
		s1.ad(k2);

		
		//Sínek kocsikhoz adása
		m1.ad(s2);
		k1.ad(megallo);
		k2.ad(s1);
		
		//Léptetés
		P1.leptetes();

		Assert.assertEquals("m1 s3 0", "m1 " + m1.sinem().id + " " + m1.utasokSzama);
		Assert.assertEquals("k1 s2 0", "k1 " + k1.sinem().id + " " + k1.utasokSzama);
		Assert.assertEquals("k2 megallo 1", "k2 " + k2.sinem().id + " " + k2.utasokSzama);
		Assert.assertEquals("megallo 1", megallo.id + " " + megallo.utasokszama);
	}	
	@Test
	public void testNo13() throws EndGameException{		//utasok nem leszállása mert nem jó a szín
		//Pálya létrehozása
		Palya P1 = new Palya();
		
		//Kocsik létrehozása
		Mozdony m1 = new Mozdony(Color.black, "m1");
		Kocsi k1 = new Kocsi(1, Color.green, "k1");
		Kocsi k2 = new Kocsi(1, Color.green, "k2");
		
		//Sinek létrehozása
		Sin s1 = new Sin("s1");
		Sin s2 = new Sin("s2");
		Sin s3 = new Sin("s3");
		Megallo megallo = new Megallo("megallo", Color.red, 0);
		
		//Kocsik és sinek pályához adása
		P1.add(s1);
		P1.add(s2);
		P1.add(s3);
		P1.add(megallo);
		P1.add(m1);
		P1.add(k1);
		P1.add(k2);
		//Sinek összekapcsolása		s1 - megallo - s2 - s3 
		s1.ad(megallo);
		megallo.ad(s1);
		megallo.ad(s2);
		s2.ad(megallo);
		s2.ad(s3);
		s3.ad(s2);
		
		//Kocsik összekapcsolása	k2 - k1 - m1
		m1.ad(k1);
		k1.ad(m1);
		k1.ad(k2);
		k2.ad(k1);
		//Kocsik sinekhez adása
		s2.ad(m1);
		megallo.ad(k1);
		s1.ad(k2);

		
		//Sínek kocsikhoz adása
		m1.ad(s2);
		k1.ad(megallo);
		k2.ad(s1);
		
		//Léptetés
		P1.leptetes();

		Assert.assertEquals("m1 s3 0", "m1 " + m1.sinem().id + " " + m1.utasokSzama);
		Assert.assertEquals("k1 s2 1", "k1 " + k1.sinem().id + " " + k1.utasokSzama);
		Assert.assertEquals("k2 megallo 1", "k2 " + k2.sinem().id + " " + k2.utasokSzama);
		Assert.assertEquals("megallo 0", megallo.id + " " + megallo.utasokszama);
	}	
	@Test
	public void testNo14() throws EndGameException{		//utasok nem leszállása mert nem az első üres
		//Pálya létrehozása
		Palya P1 = new Palya();
		
		//Kocsik létrehozása
		Mozdony m1 = new Mozdony(Color.black, "m1");
		Kocsi k1 = new Kocsi(1, Color.green, "k1");
		Kocsi k2 = new Kocsi(1, Color.green, "k2");
		
		//Sinek létrehozása
		Sin s1 = new Sin("s1");
		Sin s2 = new Sin("s2");
		Sin s3 = new Sin("s3");
		Megallo megallo = new Megallo("megallo", Color.green, 0);
		
		//Kocsik és sinek pályához adása
		P1.add(s1);
		P1.add(s2);
		P1.add(s3);
		P1.add(megallo);
		P1.add(m1);
		P1.add(k1);
		P1.add(k2);
		//Sinek összekapcsolása		megallo - s1 - s2 - s3 
		megallo.ad(s1);
		s1.ad(megallo);
		s1.ad(s2);
		s2.ad(s1);
		s2.ad(s3);
		s3.ad(s2);
		
		//Kocsik összekapcsolása	k2 - k1 - m1
		m1.ad(k1);
		k1.ad(m1);
		k1.ad(k2);
		k2.ad(k1);
		
		//Kocsik sinekhez adása
		s2.ad(m1);
		s1.ad(k1);
		megallo.ad(k2);

		
		//Sínek kocsikhoz adása
		m1.ad(s2);
		k1.ad(s1);
		k2.ad(megallo);
		
		//Léptetés
		P1.leptetes();

		Assert.assertEquals("m1 s3 0", "m1 " + m1.sinem().id + " " + m1.utasokSzama);
		Assert.assertEquals("k1 s2 1", "k1 " + k1.sinem().id + " " + k1.utasokSzama);
		Assert.assertEquals("k2 s1 1", "k2 " + k2.sinem().id + " " + k2.utasokSzama);
		Assert.assertEquals("megallo 0", megallo.id + " " + megallo.utasokszama);
	}	
	@Test
	public void testNo15() throws EndGameException{		//utasok Utasok felszállása
		//Pálya létrehozása
		Palya P1 = new Palya();
		
		//Kocsik létrehozása
		Mozdony m1 = new Mozdony(Color.black, "m1");
		Kocsi k1 = new Kocsi(1, Color.green, "k1");
		Kocsi k2 = new Kocsi(0, Color.green, "k2");
		
		//Sinek létrehozása
		Sin s1 = new Sin("s1");
		Sin s2 = new Sin("s2");
		Sin s3 = new Sin("s3");
		Megallo megallo = new Megallo("megallo", Color.green, 1);
		
		//Kocsik és sinek pályához adása
		P1.add(s1);
		P1.add(s2);
		P1.add(s3);
		P1.add(megallo);
		P1.add(m1);
		P1.add(k1);
		P1.add(k2);
		//Sinek összekapcsolása		megallo - s1 - s2 - s3 
		megallo.ad(s1);
		s1.ad(megallo);
		s1.ad(s2);
		s2.ad(s1);
		s2.ad(s3);
		s3.ad(s2);
		
		//Kocsik összekapcsolása	k2 - k1 - m1
		m1.ad(k1);
		k1.ad(m1);
		k1.ad(k2);
		k2.ad(k1);
		
		//Kocsik sinekhez adása
		s2.ad(m1);
		s1.ad(k1);
		megallo.ad(k2);

		
		//Sínek kocsikhoz adása
		m1.ad(s2);
		k1.ad(s1);
		k2.ad(megallo);
		
		//Léptetés
		P1.leptetes();

		Assert.assertEquals("m1 s3 0", "m1 " + m1.sinem().id + " " + m1.utasokSzama);
		Assert.assertEquals("k1 s2 1", "k1 " + k1.sinem().id + " " + k1.utasokSzama);
		Assert.assertEquals("k2 s1 1", "k2 " + k2.sinem().id + " " + k2.utasokSzama);
		Assert.assertEquals("megallo 0", megallo.id + " " + megallo.utasokszama);
	}	
	@Test
	public void testNo16() throws EndGameException{		//utasok Utasok nem felszállása (,mert nem jó a szín)
		//Pálya létrehozása
		Palya P1 = new Palya();
		
		//Kocsik létrehozása
		Mozdony m1 = new Mozdony(Color.black, "m1");
		Kocsi k1 = new Kocsi(1, Color.green, "k1");
		Kocsi k2 = new Kocsi(0, Color.green, "k2");
		
		//Sinek létrehozása
		Sin s1 = new Sin("s1");
		Sin s2 = new Sin("s2");
		Sin s3 = new Sin("s3");
		Megallo megallo = new Megallo("megallo", Color.red, 1);
		
		//Kocsik és sinek pályához adása
		P1.add(s1);
		P1.add(s2);
		P1.add(s3);
		P1.add(megallo);
		P1.add(m1);
		P1.add(k1);
		P1.add(k2);
		//Sinek összekapcsolása		megallo - s1 - s2 - s3 
		megallo.ad(s1);
		s1.ad(megallo);
		s1.ad(s2);
		s2.ad(s1);
		s2.ad(s3);
		s3.ad(s2);
		
		//Kocsik összekapcsolása	k2 - k1 - m1
		m1.ad(k1);
		k1.ad(m1);
		k1.ad(k2);
		k2.ad(k1);
		
		//Kocsik sinekhez adása
		s2.ad(m1);
		s1.ad(k1);
		megallo.ad(k2);

		
		//Sínek kocsikhoz adása
		m1.ad(s2);
		k1.ad(s1);
		k2.ad(megallo);
		
		//Léptetés
		P1.leptetes();

		Assert.assertEquals("m1 s3 0", "m1 " + m1.sinem().id + " " + m1.utasokSzama);
		Assert.assertEquals("k1 s2 1", "k1 " + k1.sinem().id + " " + k1.utasokSzama);
		Assert.assertEquals("k2 s1 0", "k2 " + k2.sinem().id + " " + k2.utasokSzama);
		Assert.assertEquals("megallo 1", megallo.id + " " + megallo.utasokszama);
	}	
	@Test
	public void testNo17() throws EndGameException{		//utasok Utasok nem felszállása teherkocsira
		//Pálya létrehozása
		Palya P1 = new Palya();
		
		//Kocsik létrehozása
		Mozdony m1 = new Mozdony(Color.black, "m1");
		Kocsi k1 = new Kocsi(1, Color.green, "k1");
		TeherKocsi k2 = new TeherKocsi(Color.green, "k2");
		
		//Sinek létrehozása
		Sin s1 = new Sin("s1");
		Sin s2 = new Sin("s2");
		Sin s3 = new Sin("s3");
		Megallo megallo = new Megallo("megallo", Color.green, 1);
		
		//Kocsik és sinek pályához adása
		P1.add(s1);
		P1.add(s2);
		P1.add(s3);
		P1.add(megallo);
		P1.add(m1);
		P1.add(k1);
		P1.add(k2);
		//Sinek összekapcsolása		megallo - s1 - s2 - s3 
		megallo.ad(s1);
		s1.ad(megallo);
		s1.ad(s2);
		s2.ad(s1);
		s2.ad(s3);
		s3.ad(s2);
		
		//Kocsik összekapcsolása	k2 - k1 - m1
		m1.ad(k1);
		k1.ad(m1);
		k1.ad(k2);
		k2.ad(k1);
		
		//Kocsik sinekhez adása
		s2.ad(m1);
		s1.ad(k1);
		megallo.ad(k2);

		
		//Sínek kocsikhoz adása
		m1.ad(s2);
		k1.ad(s1);
		k2.ad(megallo);
		
		//Léptetés
		P1.leptetes();

		Assert.assertEquals("m1 s3 0", "m1 " + m1.sinem().id + " " + m1.utasokSzama);
		Assert.assertEquals("k1 s2 1", "k1 " + k1.sinem().id + " " + k1.utasokSzama);
		Assert.assertEquals("k2 s1 0", "k2 " + k2.sinem().id + " " + k2.utasokSzama);
		Assert.assertEquals("megallo 1", megallo.id + " " + megallo.utasokszama);
	}
	@Test
	public void testNo18() throws EndGameException{		//A váltó állítása
		//Pálya létrehozása
		Palya P1=new Palya();
		
		//Kocsik létrehozása
		Mozdony m1=new Mozdony(Color.black, "m1");
		Kocsi k1= new Kocsi(1, Color.black, "k1");
		Mozdony m2= new Mozdony(Color.black, "m2");
		Kocsi k2= new Kocsi(1, Color.black, "k2");
		
		//Sinek létrehozása
		Sin s1= new Sin("s1");
		Sin s2= new Sin("s2");
		Sin s3= new Sin("s3");
		Sin s4= new Sin("s4");
		Sin s5= new Sin("s5");
		Sin s6= new Sin("s6");
		Valto valt= new Valto("valt");
		Sin s6a1= new Sin("s6a1");
		Sin s6a2= new Sin("s6a2");
		Sin s6a3= new Sin("s6a3");
		Sin s6a4= new Sin("s6a4");
		Sin s6b1= new Sin("s6b1");
		Sin s6b2= new Sin("s6b2");
		
		//Kocsik és sinek pályához adása
		P1.add(s1);
		P1.add(s2);
		P1.add(s3);
		P1.add(s4);
		P1.add(s5);
		P1.add(s6);
		P1.add(valt);
		P1.add(s6a1);
		P1.add(s6a2);
		P1.add(s6a3);
		P1.add(s6a4);
		P1.add(s6b1);
		P1.add(s6b2);
		P1.add(m1);
		P1.add(m2);
		P1.add(k1);
		P1.add(k2);
		
		//															- s6a1 - s6a2 - s6a3 - s6a4
		//Sinek összekapcsolása		s1 - s2 - s3 - s4 - s5 - s6 - valt 
		//															- s6b1 - s6b2
		s1.ad(s2);
		s2.ad(s1);
		s2.ad(s3);
		s3.ad(s2);
		s3.ad(s4);
		s4.ad(s3);
		s4.ad(s5);
		s5.ad(s4);
		s5.ad(s6);
		s6.ad(s5);
		s6.ad(valt);
		valt.ad(s6);
		valt.ad(s6a1);
		valt.ad(s6b1);
		s6a1.ad(valt);
		s6a1.ad(s6a2);
		s6a2.ad(s6a1);
		s6a2.ad(s6a3);
		s6a3.ad(s6a2);
		s6a3.ad(s6a4);
		s6a4.ad(s6a3);
		s6b1.ad(valt);
		s6b1.ad(s6b2);
		s6b2.ad(s6b1);
		
		//Kocsik összekapcsolása	k2 -m2 ; k1 - m1
		m1.ad(k1);
		k1.ad(m1);
		m2.ad(k2);
		k2.ad(m2);
		
		//Kocsik sinekhez adása
		s6.ad(m1);
		s5.ad(k1);
		s3.ad(m2);
		s2.ad(k2);
		
		//Sínek kocsikhoz adása
		m1.ad(s6);
		k1.ad(s5);
		m2.ad(s3);
		k2.ad(s2);
		
		//Léptetés
		P1.leptetes(); //m1 valt
		P1.leptetes(); //m1 s6a1
		valt.akcio();
		P1.leptetes(); //m1 s6a2
		P1.leptetes(); //m1 s6a3
		P1.leptetes(); //m1 s6a4
		
		Assert.assertEquals("m1 s6a4 0", "m1 " + m1.sinem().id + " " + m1.utasokSzama);
		Assert.assertEquals("k1 s6a3 1", "k1 " + k1.sinem().id + " " + k1.utasokSzama);
		Assert.assertEquals("m2 s6b1 0", "m2 " + m2.sinem().id + " " + m2.utasokSzama);
		Assert.assertEquals("k2 valt 1", "k2 " + k2.sinem().id + " " + k2.utasokSzama);
		
	}
	
	
}
