package projlabszkeleton;

import java.awt.Color;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ProgramTest {
	
	@Test
	public void testNo1() throws EndGameException{		//A vonat l�ptet�se sima s�n elemen
		//P�lya l�trehoz�sa
		Palya P1=new Palya();
		
		//Kocsik l�trehoz�sa
		Mozdony m1=new Mozdony(Color.black, "m1");
		Kocsi k1= new Kocsi(1, Color.black, "k1");
		Kocsi k2= new Kocsi(1, Color.black, "k2");
		
		//Sinek l�trehoz�sa
		Sin s1= new Sin("s1");
		Sin s2= new Sin("s2");
		Sin s3= new Sin("s3");
		Sin s4= new Sin("s4");
		
		//Kocsik �s sinek p�ly�hoz ad�sa
		P1.add(s1);
		P1.add(s2);
		P1.add(s3);
		P1.add(s4);
		P1.add(m1);
		P1.add(k1);
		P1.add(k2);
		
		//Sinek �sszekapcsol�sa		s1 -> s2 -> s3 -> s4
		s2.ad(s1);
		s2.ad(s3);
		s3.ad(s2);
		s3.ad(s4);
		s4.ad(s3);
		
		//Kocsik �sszekapcsol�sa	k2 - k1 - m1
		m1.ad(k1);
		k1.ad(m1);
		k1.ad(k2);
		k2.ad(k1);
		
		//Kocsik sinekhez ad�sa
		s3.ad(m1);
		s2.ad(k1);
		s1.ad(k2);
		
		//S�nek kocsikhoz ad�sa
		m1.ad(s3);
		k1.ad(s2);
		k2.ad(s1);
		
		//L�ptet�s
		P1.leptetes();
		Assert.assertEquals("m1 s4 0", "m1 " + m1.sinem().id + " " + m1.utasokSzama);
		Assert.assertEquals("k1 s3 1", "k1 " + k1.sinem().id + " " + k1.utasokSzama);
		Assert.assertEquals("k2 s2 1", "k2 " + k2.sinem().id + " " + k2.utasokSzama);
		
	}
	
	@Test
	public void testNo2() throws EndGameException { // Vonat l�p�se keresztez�d�sen kereszt�l
		// P�lya l�trehoz�sa
		Palya P1 = new Palya();

		// Kocsik l�trehoz�sa
		Mozdony m1 = new Mozdony(Color.black, "m1");
		Kocsi k1 = new Kocsi(1, Color.black, "k1");
		Kocsi k2 = new Kocsi(1, Color.black, "k2");

		// Sinek l�trehoz�sa
		Sin s1 = new Sin("s1");
		Sin s2 = new Sin("s2");
		Sin s3 = new Sin("s3");
		Keresztezodes ker = new Keresztezodes("ker");
		Sin s4 = new Sin("s4");
		Sin s5 = new Sin("s5");
		Sin s6 = new Sin("s6");

		// Kocsik �s sinek p�ly�hoz ad�sa
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

		// Sinek �sszekapcsol�sa 	s1 -> s2 -> s3 -> ker -> s4,s5,s6
		s2.ad(s1);
		s2.ad(s3);
		s3.ad(s2);
		s3.ad(ker);
		ker.ad(s3);
		ker.ad(s4);
		ker.ad(s5);
		ker.ad(s6);

		// Kocsik �sszekapcsol�sa 	k2 - k1 - m1
		m1.ad(k1);
		k1.ad(m1);
		k1.ad(k2);
		k2.ad(k1);

		// Kocsik sinekhez ad�sa	s1,k2 -> s2,k1 -> s3,m1
		s3.ad(m1);
		s2.ad(k1);
		s1.ad(k2);

		// S�nek kocsikhoz ad�sa
		m1.ad(s3);
		k1.ad(s2);
		k2.ad(s1);

		// L�ptet�s
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
	public void testNo3() throws EndGameException{		//A vonat l�ptet�se speci�lis helyen kereszt�l, ha nincs kapu
		//P�lya l�trehoz�sa
		Palya P1=new Palya();
		
		//Kocsik l�trehoz�sa
		Mozdony m1=new Mozdony(Color.black, "m1");
		Kocsi k1= new Kocsi(1, Color.black, "k1");
		Kocsi k2= new Kocsi(1, Color.black, "k2");
		
		//Sinek l�trehoz�sa
		Sin s1= new Sin("s1");
		Sin s2= new Sin("s2");
		Sin s3= new Sin("s3");
		Sin spec = new SpecialisHely("spec");
		Sin s4= new Sin("s4");
		
		//Kocsik �s sinek p�ly�hoz ad�sa
		P1.add(s1);
		P1.add(s2);
		P1.add(s3);
		P1.add(spec);
		P1.add(s4);
		P1.add(m1);
		P1.add(k1);
		P1.add(k2);
		
		//Sinek �sszekapcsol�sa		s1 -> s2 -> s3 -> spec -> s4
		s2.ad(s1);
		s2.ad(s3);
		s3.ad(s2);
		s3.ad(spec);
		spec.ad(s3);
		spec.ad(s4);
		s4.ad(spec);
		
		//Kocsik �sszekapcsol�sa	k2 - k1 - m1
		m1.ad(k1);
		k1.ad(m1);
		k1.ad(k2);
		k2.ad(k1);
		
		//Kocsik sinekhez ad�sa		s1,k2 -> s2,k1 -> s3,m1
		s3.ad(m1);
		s2.ad(k1);
		s1.ad(k2);
		
		//S�nek kocsikhoz ad�sa
		m1.ad(s3);
		k1.ad(s2);
		k2.ad(s1);
		
		//L�ptet�s
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
	public void testNo5() {		//�tk�z�s sima S�n elemen
		//P�lya l�trehoz�sa
		Palya P1 = new Palya();
		
		//Kocsik l�trehoz�sa
		Mozdony m1 = new Mozdony(Color.black, "m1");
		Mozdony m2 = new Mozdony(Color.black, "m2");
		Kocsi k1 = new Kocsi(1, Color.black, "k1");
		Kocsi k2 = new Kocsi(1, Color.black, "k2");
		
		//Sinek l�trehoz�sa
		Sin s1 = new Sin("s1");
		Sin s2 = new Sin("s2");
		Sin s3 = new Sin("s3");
		Sin s4 = new Sin("s4");
		Sin s5 = new Sin("s5");
		
		//Kocsik �s sinek p�ly�hoz ad�sa
		P1.add(s1);
		P1.add(s2);
		P1.add(s3);
		P1.add(s4);
		P1.add(s5);
		P1.add(m1);
		P1.add(m2);
		P1.add(k1);
		P1.add(k2);
		
		//Sinek �sszekapcsol�sa		s1 -> s2 -> s3 -> s4
		s2.ad(s1);
		s2.ad(s3);
		s3.ad(s2);
		s3.ad(s4);
		s4.ad(s3);
		s4.ad(s5);
		s5.ad(s4);
		
		//Kocsik �sszekapcsol�sa	k1 - m1;	k2 - m2
		m1.ad(k1);
		k1.ad(m1);
		m2.ad(k2);
		k2.ad(m2);
		
		//Kocsik sinekhez ad�sa		s1,k1 - s2,m1 - s3 - s4,m2 - s5,k2
		try{
			s2.ad(m1);
			s1.ad(k1);
			s4.ad(m2);
			s5.ad(k2);
		}catch(EndGameException e){
			//nothing will go wrong here
		}

		
		//S�nek kocsikhoz ad�sa
		m1.ad(s2);
		k1.ad(s1);
		m2.ad(s4);
		k2.ad(s5);
		
		//L�ptet�s
		try{
			P1.leptetes();
			Assert.fail("An EndGameException should be thrown");	//ha nem keletkezik kiv�tel -> fail
		}catch(EndGameException e){
			Assert.assertEquals(false, e.result());
		}
	}
	
	@Test
	public void testNo6() {		//�tk�z�s egy meg�ll�n
		//P�lya l�trehoz�sa
		Palya P1 = new Palya();
		
		//Kocsik l�trehoz�sa
		Mozdony m1 = new Mozdony(Color.black, "m1");
		Mozdony m2 = new Mozdony(Color.black, "m2");
		Kocsi k1 = new Kocsi(1, Color.black, "k1");
		Kocsi k2 = new Kocsi(1, Color.black, "k2");
		
		//Sinek l�trehoz�sa
		Sin s1 = new Sin("s1");
		Sin s2 = new Sin("s2");
		Sin s3 = new Megallo("s3", Color.red, 0);
		Sin s4 = new Sin("s4");
		Sin s5 = new Sin("s5");
		
		//Kocsik �s sinek p�ly�hoz ad�sa
		P1.add(s1);
		P1.add(s2);
		P1.add(s3);
		P1.add(s4);
		P1.add(s5);
		P1.add(m1);
		P1.add(m2);
		P1.add(k1);
		P1.add(k2);
		
		//Sinek �sszekapcsol�sa		s1 -> s2 -> s3 -> s4
		s2.ad(s1);
		s2.ad(s3);
		s3.ad(s2);
		s3.ad(s4);
		s4.ad(s3);
		s4.ad(s5);
		s5.ad(s4);
		
		//Kocsik �sszekapcsol�sa	k1 - m1;	k2 - m2
		m1.ad(k1);
		k1.ad(m1);
		m2.ad(k2);
		k2.ad(m2);
		
		//Kocsik sinekhez ad�sa		s1,k1 - s2,m1 - s3 - s4,m2 - s5,k2
		try{
			s2.ad(m1);
			s1.ad(k1);
			s4.ad(m2);
			s5.ad(k2);
		}catch(EndGameException e){
			//nothing will go wrong here
		}

		
		//S�nek kocsikhoz ad�sa
		m1.ad(s2);
		k1.ad(s1);
		m2.ad(s4);
		k2.ad(s5);
		
		//L�ptet�s
		try{
			P1.leptetes();
			Assert.fail("An EndGameException should be thrown");	//ha nem keletkezik kiv�tel -> fail
		}catch(EndGameException e){
			Assert.assertEquals(false, e.result());
		}
	}
	
	@Test
	public void testNo7() {		//�tk�z�s v�lt�n
		//P�lya l�trehoz�sa
		Palya P1 = new Palya();
		
		//Kocsik l�trehoz�sa
		Mozdony m1 = new Mozdony(Color.black, "m1");
		Mozdony m2 = new Mozdony(Color.black, "m2");
		Kocsi k1 = new Kocsi(1, Color.black, "k1");
		Kocsi k2 = new Kocsi(1, Color.black, "k2");
		
		//Sinek l�trehoz�sa
		Sin s1 = new Sin("s1");
		Sin s2 = new Sin("s2");
		Sin s3 = new Sin("s3");
		Sin valt = new Valto("valt");
		Sin s4 = new Sin("s4");
		Sin s5 = new Sin("s5");
		
		//Kocsik �s sinek p�ly�hoz ad�sa
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
		
		//Sinek �sszekapcsol�sa		s1 - valt - s2 - s3
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
		
		//Kocsik �sszekapcsol�sa	k1 - m1;	k2 - m2
		m1.ad(k1);
		k1.ad(m1);
		m2.ad(k2);
		k2.ad(m2);
		
		//Kocsik sinekhez ad�sa		s1 - valt - s2,m1 - s3,k1
		//									  - s4,m2 - s5,k2
		try{
			s2.ad(m1);
			s3.ad(k1);
			s4.ad(m2);
			s5.ad(k2);
		}catch(EndGameException e){
			//nothing will go wrong here
		}

		
		//S�nek kocsikhoz ad�sa
		m1.ad(s2);
		k1.ad(s3);
		m2.ad(s4);
		k2.ad(s5);
		
		//L�ptet�s
		try{
			P1.leptetes();
			Assert.fail("An EndGameException should be thrown");	//ha nem keletkezik kiv�tel -> fail
		}catch(EndGameException e){
			Assert.assertEquals(false, e.result());
		}
	}
	
	@Test
	public void testNo8() {		//�tk�z�s egy keresztez�d�sben
		//P�lya l�trehoz�sa
		Palya P1 = new Palya();
		
		//Kocsik l�trehoz�sa
		Mozdony m1 = new Mozdony(Color.black, "m1");
		Mozdony m2 = new Mozdony(Color.black, "m2");
		Kocsi k1 = new Kocsi(1, Color.black, "k1");
		Kocsi k2 = new Kocsi(1, Color.black, "k2");
		
		//Sinek l�trehoz�sa
		Sin s1 = new Sin("s1");
		Sin s2 = new Sin("s2");
		Sin s3 = new Sin("s3");
		Sin ker = new Keresztezodes("ker");
		Sin s4 = new Sin("s4");
		Sin s5 = new Sin("s5");
		Sin s6 = new Sin("s6");
		
		//Kocsik �s sinek p�ly�hoz ad�sa
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
		//Sinek �sszekapcsol�sa		s1 - ker - s6 
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
		
		//Kocsik �sszekapcsol�sa	k1 - m1;	k2 - m2
		m1.ad(k1);
		k1.ad(m1);
		m2.ad(k2);
		k2.ad(m2);
		//		 							 - s2,m1 - s3,k1
		//Kocsik sinekhez ad�sa		s1 - ker - s6
		//							 		 - s4,m2 - s5,k2
		try{
			s2.ad(m1);
			s3.ad(k1);
			s4.ad(m2);
			s5.ad(k2);
		}catch(EndGameException e){
			//nothing will go wrong here
		}

		
		//S�nek kocsikhoz ad�sa
		m1.ad(s2);
		k1.ad(s3);
		m2.ad(s4);
		k2.ad(s5);
		
		//L�ptet�s
		try{
			P1.leptetes();
			Assert.fail("An EndGameException should be thrown");	//ha nem keletkezik kiv�tel -> fail
		}catch(EndGameException e){
			Assert.assertEquals(false, e.result());
		}
	}
	
	@Test
	public void testNo9() {		//Gy�zelem
		//P�lya l�trehoz�sa
		Palya P1 = new Palya();
		
		//Kocsik l�trehoz�sa
		Mozdony m1 = new Mozdony(Color.black, "m1");
		Kocsi k1 = new Kocsi(1, Color.red, "k1");

		//Sinek l�trehoz�sa
		Sin s1 = new Sin("s1");
		Sin s2 = new Sin("s2");
		Sin megallo = new Megallo("megallo", Color.red, 0);
		Sin s3 = new Sin("s3");
		Sin s4 = new Sin("s4");
		
		//Kocsik �s sinek p�ly�hoz ad�sa
		P1.add(s1);
		P1.add(s2);
		P1.add(megallo);
		P1.add(s3);
		P1.add(s4);
		P1.add(m1);
		P1.add(k1);

		
		//Sinek �sszekapcsol�sa		s1 -> s2 -> megallo -> s3 -> s4
		s2.ad(s1);
		s2.ad(megallo);
		megallo.ad(s2);
		megallo.ad(s3);
		s3.ad(megallo);
		s3.ad(s4);
		s4.ad(s3);
		
		//Kocsik �sszekapcsol�sa	k1 - m1
		m1.ad(k1);
		k1.ad(m1);
		
		//Kocsik sinekhez ad�sa		s1,k1 -> s2,m1 -> megallo -> s3 -> s4
		try{
			s1.ad(k1);
			s2.ad(m1);
		}catch(EndGameException e){
			//nothing will go wrong here
		}
		
		//S�nek kocsikhoz ad�sa
		m1.ad(s2);
		k1.ad(s1);
		
		//L�ptet�s
		try{
			P1.leptetes();
			P1.leptetes();
			P1.leptetes();
			Assert.fail("An EndGameException should be thrown");	//ha nem keletkezik kiv�tel -> fail
		}catch(EndGameException e){
			Assert.assertEquals(true, e.result());
		}
	}
	
}
