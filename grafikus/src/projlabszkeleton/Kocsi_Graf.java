package projlabszkeleton;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Kocsi_Graf {

	private static BufferedImage kofekete;
	private static BufferedImage kofekete_kanyar;
	private static BufferedImage kokek;
	private static BufferedImage kokek_kanyar;
	private static BufferedImage koszurke;
	private static BufferedImage koszurke_kanyar;
	private static BufferedImage kozold;
	private static BufferedImage kozold_kanyar;
	private static BufferedImage kovilagoskek;
	private static BufferedImage kovilagoskek_kanyar;
	private static BufferedImage korozsa;
	private static BufferedImage korozsa_kanyar;
	private static BufferedImage kopiros;
	private static BufferedImage kopiros_kanyar;
	private static BufferedImage kofeher;
	private static BufferedImage kofeher_kanyar;
	private static BufferedImage kosarga;
	private static BufferedImage kosarga_kanyar;
	private static BufferedImage koteher;
	private static BufferedImage koteher_kanyar;
	private static BufferedImage mozdony;
	private static BufferedImage mozdony_kanyar;
	
	public Kocsi_Graf(){
		try{
			kofekete = ImageIO.read(new File("projekt/kocsi_black.png"));
			kofekete_kanyar = ImageIO.read(new File("projekt/kocsi_black_kanyar.png"));
			kokek = ImageIO.read(new File("projekt/kocsi_blue.png"));
			kokek_kanyar = ImageIO.read(new File("projekt/kocsi_blue_kanyar.png"));
			koszurke = ImageIO.read(new File("projekt/kocsi_gray.png"));
			koszurke_kanyar = ImageIO.read(new File("projekt/kocsi_gray_kanyar.png"));
			kozold = ImageIO.read(new File("projekt/kocsi_green.png"));
			kozold_kanyar = ImageIO.read(new File("projekt/kocsi_green_kanyar.png"));
			kovilagoskek = ImageIO.read(new File("projekt/kocsi_lightblue.png"));
			kovilagoskek_kanyar = ImageIO.read(new File("projekt/kocsi_lightblue_kanyar.png"));
			korozsa = ImageIO.read(new File("projekt/kocsi_pink.png"));
			korozsa_kanyar = ImageIO.read(new File("projekt/kocsi_pink_kanyar.png"));
			kopiros = ImageIO.read(new File("projekt/kocsi_red.png"));
			kopiros_kanyar = ImageIO.read(new File("projekt/kocsi_red_kanyar.png"));
			kofeher = ImageIO.read(new File("projekt/kocsi_white.png"));
			kofeher_kanyar = ImageIO.read(new File("projekt/kocsi_white_kanyar.png"));
			kosarga = ImageIO.read(new File("projekt/kocsi_yellow.png"));
			kosarga_kanyar = ImageIO.read(new File("projekt/kocsi_yellow_kanyar.png"));
			koteher = ImageIO.read(new File("projekt/kocsi_teher.png"));
			koteher_kanyar = ImageIO.read(new File("projekt/kocsi_teher_kanyar.png"));
			mozdony = ImageIO.read(new File("projekt/mozdony_red.png"));
			mozdony_kanyar = ImageIO.read(new File("projekt/mozdony_red_kanyar.png"));
		}
		catch (IOException e){
			System.out.println("fájl beolvasás sikertelen (kocsi.png)");
			e.printStackTrace();
		}
	}
	
	public Graphics2D draw(Graphics2D g, Kocsi k, String allapot){
		//milyen színű a kocsi? Ez alapján választjuk ki a képet.
		BufferedImage kocsiEgyenes = null;
		BufferedImage kocsiKanyar = null;
		Color kocsiColor = k.szin();
		if(k instanceof Mozdony){
			kocsiEgyenes = mozdony;
			kocsiKanyar = mozdony_kanyar;
		}
		else if(k instanceof TeherKocsi){
			kocsiEgyenes = koteher;
			kocsiKanyar = koteher_kanyar;
		}
		else if(k instanceof Kocsi){
			if(kocsiColor.equals(Color.black)){
				kocsiEgyenes = kofekete;
				kocsiKanyar = kofekete_kanyar;
			}
			if(kocsiColor.equals(Color.blue)){
				kocsiEgyenes = kokek;
				kocsiKanyar = kokek_kanyar;
			}
			if(kocsiColor.equals(Color.gray)){
				kocsiEgyenes = koszurke;
				kocsiKanyar = koszurke_kanyar;
			}
			if(kocsiColor.equals(Color.green)){
				kocsiEgyenes = kozold;
				kocsiKanyar = kozold_kanyar;
			}
			if(kocsiColor.equals(Color.cyan)){
				kocsiEgyenes = kovilagoskek;
				kocsiKanyar = kovilagoskek_kanyar;
			}
			if(kocsiColor.equals(Color.pink)){
				kocsiEgyenes = korozsa;
				kocsiKanyar = korozsa_kanyar;
			}
			if(kocsiColor.equals(Color.red)){
				kocsiEgyenes = kopiros;
				kocsiKanyar = kopiros_kanyar;
			}
			if(kocsiColor.equals(Color.white)){
				kocsiEgyenes = kofeher;
				kocsiKanyar = kofeher_kanyar;
			}
			if(kocsiColor.equals(Color.yellow)){
				kocsiEgyenes = kosarga;
				kocsiKanyar = kosarga_kanyar;
			}
		}
		
		if(allapot == "BF" || allapot == "FJ" || allapot == "JL" || allapot == "LB"){		//kanyarban vagyunk
			g.rotate(Math.PI, 25, 25);
			g.drawImage(kocsiKanyar, null, 0, 0);
			if(kocsiColor.equals(Color.white) || kocsiColor.equals(Color.yellow)){
				g.setColor(Color.black);
				g.drawString("" + k.getUtasokSzama(), 12, 22);
			}
			else if(!(k instanceof Mozdony) && !(k instanceof TeherKocsi)){		//ha mozdony v teherkocsi, ne rajzoljuk ki az utasok számát
				g.setColor(Color.white);
				g.drawString("" + k.getUtasokSzama(), 12, 22);
			}
			g.rotate(-Math.PI, 25, 25);
		}
		else{										//egyenesben vagyunk
			g.drawImage(kocsiEgyenes, null, 0, 0);
			if(kocsiColor.equals(Color.white) || kocsiColor.equals(Color.yellow)){
				g.setColor(Color.black);
				g.drawString("" + k.getUtasokSzama(), 22, 30);
			}
			else if(!(k instanceof Mozdony) && !(k instanceof TeherKocsi)){		//ha mozdony v teherkocsi, ne rajzoljuk ki az utasok számát
				g.setColor(Color.white);
				g.drawString("" + k.getUtasokSzama(), 22, 30);
			}
		}
		/*
		if (k instanceof Mozdony){
			g.drawImage(mozdony, null, 0, 0);
		}
		else{
			g.drawImage(kopiros, null, 0, 0);
		}
		*/
		return g;
	}
}
