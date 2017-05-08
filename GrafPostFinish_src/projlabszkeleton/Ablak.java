package projlabszkeleton;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
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
import javax.swing.Timer;
import javax.swing.border.LineBorder;


public class Ablak extends JFrame {

	/**
	 * For Eclipse
	 */
	private static final long serialVersionUID = 1L;
	
	private JButton start=new JButton("Start!");
	private JButton retry = new JButton("Retry");
	private JButton exit = new JButton("Exit");
	private JPanel also=new JPanel();
	private JPanel felso=new JPanel();
	
	int i = 0;
	Palya_Rajzolo uj;
	Palya p;
	Timer t = new Timer(750, new ActionListener() {			//a léptetéshez
		
		@Override
		public void actionPerformed(ActionEvent e) {
			try{
				p.leptetes();
				uj.repaint();
			} catch (EndGameException ex) {
				// todo??
				if (ex.result()) {
					remove(uj);
					uj = new Palya_Rajzolo();
					p = new Palya(uj);
					p.elsopalya();
					uj.ready();
					add(uj, BorderLayout.CENTER);
					revalidate();
					repaint();
				}
				if (!ex.result()) {
					t.stop();
					remove(uj);
					felso.removeAll();
					also.removeAll();
					JLabel gameOver = new JLabel("Ütközés, Game Over");
					gameOver.setFont(new Font(gameOver.getFont().getName(), gameOver.getFont().getStyle(), 30));
					gameOver.setForeground (Color.red);
					felso.add(gameOver, FlowLayout.LEFT);
					also.add(exit, FlowLayout.LEFT);
					also.add(retry, FlowLayout.LEFT);
					add(felso, BorderLayout.NORTH);
					add(also, BorderLayout.CENTER);
					revalidate();
					repaint();
					
					//System.exit(NORMAL);
				}
			}
		}
	});
	
	private class startGamelistener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			String command = e.getActionCommand();
			if(command.equals("Start!") || command.equals("Retry")){
				start();
				t.start();
			}
			if(command.equals("Exit")){
				System.exit(NORMAL);
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
		retry.addActionListener(s);
		exit.addActionListener(s);
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
		uj=new Palya_Rajzolo();
		p=new Palya(uj);
		p.start();
		uj.ready();
		add(uj, BorderLayout.CENTER);
		this.revalidate();
		this.repaint();
	}
}
