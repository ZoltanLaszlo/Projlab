package projlabszkeleton;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Keresztezodes_Graf extends Sin_Graf{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	private Keresztezodes s;
	private static BufferedImage kereszt;
	
	public Keresztezodes_Graf(Keresztezodes s, String allapot){
		this.s=s;
		this.allapot=allapot;
		try{
			kereszt = ImageIO.read(new File("projekt/keresztezodes.png"));
		}
		catch (IOException e){
			System.out.println("fájl beolvasás sikertelen (keresztezodes.png)");
		}
		setSize(50, 50);
		this.setBackground(Color.green);
	}
	
	@Override
	protected void paintComponent(Graphics g){
		//super.paintComponent(g);
		Graphics2D ujg=(Graphics2D)g;
		ujg.drawImage(kereszt, null, 0, 0);
		if(s.kocsi!=null){
			ujg=kocsirajzolo.draw(ujg, s.kocsi, this.allapot);
		}
		g=(Graphics)ujg;
	}
}
