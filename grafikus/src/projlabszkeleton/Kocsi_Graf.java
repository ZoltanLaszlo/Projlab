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
		if (k instanceof Mozdony){
			g.drawImage(mozdony, null, 0, 0);
		}
		else{
			g.drawImage(kopiros, null, 0, 0);
		}
		
		return g;
	}
}
