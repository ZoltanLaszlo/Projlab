package projlabszkeleton;

import java.awt.Color;

import org.junit.Assert;
import org.junit.Before;
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
	public void testNo2() throws EndGameException { // Vonat lépése keresztezõdésen keresztül
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
			Assert.fail("An EndGameException should be thrown");
		}catch(EndGameException e){
			Assert.assertEquals(false, e.result());
		}
	}
	
}
