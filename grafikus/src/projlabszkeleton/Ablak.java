package projlabszkeleton;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;


public class Ablak extends JFrame {

	/**
	 * For Eclipse
	 */
	private static final long serialVersionUID = 1L;
	
	private JButton start=new JButton("Start!");
	private JPanel also=new JPanel();
	private JPanel felso=new JPanel();
	
	
	
	private class startGamelistener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			if(e.getActionCommand().equals("Start!")){
				start();
			}
		}
	}
	
	public Ablak(){
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Vonat Játék");
		setSize(1000,700);
		setResizable(false);
		felso.add(start, FlowLayout.LEFT);
		BorderLayout myLayout=new BorderLayout();
		setLayout(myLayout);
		startGamelistener s=new startGamelistener();
		start.addActionListener(s);
		BufferedImage myPicture=null;
		try{
		myPicture = ImageIO.read(new File("projekt/trainstart.jpg"));
		}
		catch (IOException e){
			System.out.println("fájl beolvasás sikertelen");
		}
		JLabel picLabel = new JLabel(new ImageIcon(myPicture.getScaledInstance(1000, 630, Image.SCALE_FAST)));
		also.add(picLabel, FlowLayout.LEFT);
		//add(picLabel);
		add(felso, BorderLayout.NORTH);
		add(also, BorderLayout.CENTER);
	}
	
	public void start(){
		//this.removeAll();
		this.remove(also);
		this.remove(felso);
		Palya_Rajzolo uj=new Palya_Rajzolo();
		Palya p=new Palya(uj);
		p.start();
		uj.ready();
		add(uj, BorderLayout.CENTER);
		this.revalidate();
		this.repaint();
	}
}
