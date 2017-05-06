package projlabszkeleton;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class SpecialisHely_Graf extends Sin_Graf{
	/**
	 * gg
	 */
	private static final long serialVersionUID = 1L;

	
	private SpecialisHely s;
	private static BufferedImage spechely;
	private static BufferedImage kapu_noalagut;
	private static BufferedImage alagut;
	
	/**
	 *Konstruktor létrehoz egy grafikus SpecialisHely elemet
	 *
	 *@param s A modellbeli párja
	 *@param allapt megadja hogy áll a valto lehetséges: BJ, JB, FL, LF
	 */
	public SpecialisHely_Graf(SpecialisHely s, String allapot){
		this.s=s;
		this.allapot=allapot;
		try{
			spechely = ImageIO.read(new File("projekt/spechely_nokapu.png"));
			kapu_noalagut = ImageIO.read(new File("projekt/spechely_kapu_noalagut.png"));
			alagut = ImageIO.read(new File("projekt/spechely_alagut.png"));
		}
		catch (IOException e){
			System.out.println("fájl beolvasás sikertelen (spechely.png)");
		}
		setSize(50, 50);
		this.setBackground(Color.green);
	}

	/**
	 * a panel kirajzolásakor meghívott függvény
	 * Az állapottol és rajta álló kapu illetve alagúttól függően
	 * kirajzoljuk a megfelelő képet
	 * (és a rajta álló kocsikat is kirajzoltatjuk)
	 * 
	 * @param g grafikus elem amire rajzolhatunk
	 */
	@Override
	protected void paintComponent(Graphics g){
		//super.paintComponent(g);
		Graphics2D ujg=(Graphics2D)g;
		if(allapot.equals("BJ")){
			//ez az eredeti
		}
		if(allapot.equals("JB")){
			ujg.rotate(Math.PI, 25, 25);
		}
		if(allapot.equals("FL")){
			ujg.rotate(Math.PI/2, 25, 25);			
		}
		if(allapot.equals("LF")){
			ujg.rotate(-Math.PI/2, 25, 25);			
		}
		if(s.vankapu()){
			ujg.drawImage(alagut, null, 0, 0);
		}
		else if(s.kapu()!=null){
			ujg.drawImage(kapu_noalagut, null, 0, 0);
		}
		else{
			ujg.drawImage(spechely, null, 0, 0);
		}
		if(s.kocsi!=null){
			ujg=kocsirajzolo.draw(ujg, s.kocsi, this.allapot);
		}
		g=(Graphics)ujg;
	}
}
