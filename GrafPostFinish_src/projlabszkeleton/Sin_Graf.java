package projlabszkeleton;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Sin_Graf extends JPanel{
	

	/**
	 * gg
	 */
	private static final long serialVersionUID = 1L;

	
	private Sin s;
	protected String allapot;
	private static BufferedImage sinkep;
	private static BufferedImage sinkanyar;
	protected static Kocsi_Graf kocsirajzolo;
	
	/**
	 *Konstruktor létrehoz egy ures grafikus Sin elemet
	 */
	public Sin_Graf(){
	}
	
	/**
	 *Konstruktor létrehoz egy grafikus Sin elemet
	 *
	 *@param s A modellbeli párja
	 *@param allapt megadja hogy áll a Sin lehetséges: FL, BJ, BF, FJ, JL, LB
	 */
	public Sin_Graf(Sin s, String allapot){
		this.s=s;
		this.allapot=allapot;
		try{
			sinkep = ImageIO.read(new File("projekt/sin.png"));
			sinkanyar = ImageIO.read(new File("projekt/railturn.png"));
		}
		catch (IOException e){
			System.out.println("fájl beolvasás sikertelen (sin.png)");
		}
		setSize(50, 50);
		this.setBackground(Color.green);
		kocsirajzolo=new Kocsi_Graf();
	}
	
	/**
	 * a panel kirajzolásakor meghívott függvény
	 * Az állapottol függően krajzoljuk a megfelelő képet
	 * (és a rajta álló kocsikat is kirajzoltatjuk)
	 * 
	 * @param g grafikus elem amire rajzolhatunk
	 */
	@Override
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		Graphics2D ujg=(Graphics2D)g;
		if(allapot.equals("FL")){
			ujg.rotate(Math.PI/2, 25, 25);
		}
		if(allapot.equals("FL")||allapot.equals("BJ")){
			ujg.drawImage(sinkep, null, 0, 0);
		}
		else{
			if(allapot.equals("BF")){
				ujg.rotate(Math.PI, 25, 25);				
			}
			if(allapot.equals("FJ")){
				ujg.rotate(-Math.PI/2, 25, 25);				
			}
			if(allapot.equals("JL")){				
			}
			if(allapot.equals("LB")){
				ujg.rotate(Math.PI/2, 25, 25);				
			}
			ujg.drawImage(sinkanyar, null, 0, 0);
		}
		if(s.kocsi!=null){
			ujg=kocsirajzolo.draw(ujg, s.kocsi, this.allapot);
		}
		g=(Graphics)ujg;
	}
	
	public Sin getSinem(){
		return null;
	}
	
}
