package projlabszkeleton;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Valto_Graf extends Sin_Graf{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	private Valto s;
	private static BufferedImage valtofalse;
	private static BufferedImage valtotrue;
	
	public Valto_Graf(Valto s, String allapot){
		this.s=s;
		this.allapot=allapot;
		try{
			valtofalse = ImageIO.read(new File("projekt/valto_false.png"));
			valtotrue = ImageIO.read(new File("projekt/valto_true.png"));
		}
		catch (IOException e){
			System.out.println("fájl beolvasás sikertelen (valto.png)");
		}
		setSize(50, 50);
		this.setBackground(Color.green);
	}
	
	@Override
	protected void paintComponent(Graphics g){
		//super.paintComponent(g);
		Graphics2D ujg=(Graphics2D)g;
		if(allapot.equals("BJF")){
			//ez az eredeti
		}
		if(allapot.equals("BJL")){
			ujg.translate(25, 25);
			ujg.scale(1, -1);
			ujg.translate(-25, -25);
		}
		if(allapot.equals("JBF")){
			ujg.translate(25, 25);
			ujg.scale(1, -1);
			ujg.translate(-25, -25);
			ujg.rotate(Math.PI, 25, 25);
		}
		if(allapot.equals("JBL")){
			ujg.rotate(Math.PI, 25, 25);
		}
		if(allapot.equals("FLB")){
			ujg.translate(25, 25);
			ujg.scale(1, -1);
			ujg.translate(-25, -25);
			ujg.rotate(-Math.PI/2, 25, 25);
		}
		if(allapot.equals("FLJ")){
			ujg.rotate(Math.PI/2, 25, 25);
		}
		if(allapot.equals("LFB")){
			ujg.rotate(-Math.PI/2, 25, 25);
		}
		if(allapot.equals("LFJ")){
			ujg.translate(25, 25);
			ujg.scale(1, -1);
			ujg.translate(-25, -25);
			ujg.rotate(Math.PI/2, 25, 25);
		}
		ujg.drawImage(valtofalse, null, 0, 0);
		if(s.kocsi!=null){
			ujg=kocsirajzolo.draw(ujg, s.kocsi, this.allapot);
		}
		g=(Graphics)ujg;
	}
}
