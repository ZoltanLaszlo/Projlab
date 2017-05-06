package projlabszkeleton;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Megallo_Graf extends Sin_Graf{
	/**
	 * gg
	 */
	private static final long serialVersionUID = 1L;

	
	private Megallo s;
	private static BufferedImage megpiros;
	private static BufferedImage megfekete;
	private static BufferedImage megkek;
	private static BufferedImage megszurke;
	private static BufferedImage megzold;
	private static BufferedImage megvilagoskek;
	private static BufferedImage megrozsa;
	private static BufferedImage megfeher;
	private static BufferedImage megsarga;
	
	/**
	 *Konstruktor létrehoz egy grafikus Megallo elemet
	 *
	 *@param s A modellbeli párja
	 *@param allapt megadja hogy áll a Megallo lehetséges: FL, BJ
	 */
	public Megallo_Graf(Megallo s, String allapot){
		this.s=s;
		this.allapot=allapot;
		try{
			megpiros = ImageIO.read(new File("projekt/megallo_red.png"));
			megfekete = ImageIO.read(new File("projekt/megallo_black.png"));
			megkek = ImageIO.read(new File("projekt/megallo_blue.png"));
			megszurke = ImageIO.read(new File("projekt/megallo_gray.png"));
			megzold = ImageIO.read(new File("projekt/megallo_green.png"));
			megvilagoskek = ImageIO.read(new File("projekt/megallo_lightblue.png"));
			megrozsa = ImageIO.read(new File("projekt/megallo_pink.png"));
			megfeher = ImageIO.read(new File("projekt/megallo_white.png"));
			megsarga = ImageIO.read(new File("projekt/megallo_yellow.png"));
		}
		catch (IOException e){
			System.out.println("fájl beolvasás sikertelen (megallo.png)");
		}
		setSize(50, 50);
		this.setBackground(Color.green);
	}
	
	/**
	 * a panel kirajzolásakor meghívott függvény
	 * Az állapottol függően krajzoljuk a megfelelő képet
	 * és kirajzoljuk az utasok számát
	 * (és a rajta álló kocsikat is kirajzoltatjuk)
	 * 
	 * @param g grafikus elem amire rajzolhatunk
	 */
	@Override
	protected void paintComponent(Graphics g){
		//super.paintComponent(g);
		Graphics2D ujg=(Graphics2D)g;
		if(allapot.equals("FL")){
			ujg.rotate(-Math.PI/2, 25, 25);
		}
		if(allapot.equals("BJ")){
			//ez az eredeti
		}
		if(s.szin().equals(Color.red)){
			ujg.drawImage(megpiros, null, 0, 0);
		}
		if(s.szin().equals(Color.black)){
			ujg.drawImage(megfekete, null, 0, 0);
		}
		if(s.szin().equals(Color.blue)){
			ujg.drawImage(megkek, null, 0, 0);
		}
		if(s.szin().equals(Color.cyan)){
			ujg.drawImage(megvilagoskek, null, 0, 0);
		}
		if(s.szin().equals(Color.yellow)){
			ujg.drawImage(megsarga, null, 0, 0);
		}
		if(s.szin().equals(Color.green)){
			ujg.drawImage(megzold, null, 0, 0);
		}
		if(s.szin().equals(Color.gray)){
			ujg.drawImage(megszurke, null, 0, 0);
		}
		if(s.szin().equals(Color.white)){
			ujg.drawImage(megfeher, null, 0, 0);
		}
		if(s.szin().equals(Color.pink)){
			ujg.drawImage(megrozsa, null, 0, 0);
		}
		if(s.kocsi!=null){
			ujg=kocsirajzolo.draw(ujg, s.kocsi, this.allapot);
		}
		ujg.setColor(Color.orange);
		ujg.drawString(""+s.utasokszama, 23, 47);
		g=(Graphics)ujg;
	}
}
