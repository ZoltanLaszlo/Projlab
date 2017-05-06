package projlabszkeleton;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JPanel;

public class Palya_Rajzolo extends JPanel {

	/**
	 * gg
	 */
	private static final long serialVersionUID = 1L;
	private Sin_Graf[][] fields;
	

	/**
	 * választható mien sorrendben adjuk meg a koordinátákat
	 */
	public boolean xy;
	
	/**
	 *Konstruktor létrehozza a főpanelt ahol vannak a grafikus elemek
	 */
	public Palya_Rajzolo(){
		setSize(1000, 700);
		setBackground(Color.green);
		setLayout(new GridLayout(14,20));
		fields=new Sin_Graf[14][20];
		for(int i=0; i<14; i++){
			for(int t=0; t<20; t++){
				fields[i][t]=null;
			}
		}
		xy=false;
	}

	/**
	 * berak egy sima Sin elemet a tarolojaba
	 * 
	 * @param s A modelbeli Sin elem
	 * @param x vizszintes koordináta (1-20) (ha xy=true)
	 * @param y függöleges koordináta (1-14) (ha xy=true)
	 * @param allapot az elem állapota (lsd. konstruktor)
	 */
	public void adSin(Sin s, int x, int y, String allapot){
		if(xy){
			int temp=x;
			x=y;
			y=temp;
		}
		fields[x-1][y-1]=new Sin_Graf(s, allapot);
	}

	/**
	 * berak egy Valto elemet a tarolojaba
	 * 
	 * @param s A modelbeli Valto elem
	 * @param x vizszintes koordináta (1-20) (ha xy=true)
	 * @param y függöleges koordináta (1-14) (ha xy=true)
	 * @param allapot az elem állapota (lsd. konstruktor)
	 */
	public void adValto(Valto s, int x, int y, String allapot){
		if(xy){
			int temp=x;
			x=y;
			y=temp;
		}
		fields[x-1][y-1]=new Valto_Graf(s, allapot);
	}

	/**
	 * berak egy SpecialisHely elemet a tarolojaba
	 * 
	 * @param s A modelbeli SpecialisHely elem
	 * @param x vizszintes koordináta (1-20) (ha xy=true)
	 * @param y függöleges koordináta (1-14) (ha xy=true)
	 * @param allapot az elem állapota (lsd. konstruktor)
	 */
	public void adSpecialisHely(SpecialisHely s, int x, int y, String allapot){
		if(xy){
			int temp=x;
			x=y;
			y=temp;
		}
		fields[x-1][y-1]=new SpecialisHely_Graf(s, allapot);
	}

	/**
	 * berak egy Megallo elemet a tarolojaba
	 * 
	 * @param s A modelbeli Megallo elem
	 * @param x vizszintes koordináta (1-20) (ha xy=true)
	 * @param y függöleges koordináta (1-14) (ha xy=true)
	 * @param allapot az elem állapota (lsd. konstruktor)
	 */
	public void adMegallo(Megallo s, int x, int y, String allapot){
		if(xy){
			int temp=x;
			x=y;
			y=temp;
		}
		fields[x-1][y-1]=new Megallo_Graf(s, allapot);
	}

	/**
	 * berak egy Keresztezodes elemet a tarolojaba
	 * 
	 * @param s A modelbeli Keresztezodes elem
	 * @param x vizszintes koordináta (1-20) (ha xy=true)
	 * @param y függöleges koordináta (1-14) (ha xy=true)
	 * @param allapot az elem állapota (lsd. konstruktor)
	 */
	public void adKeresztezodes(Keresztezodes s, int x, int y){
		if(xy){
			int temp=x;
			x=y;
			y=temp;
		}
		fields[x-1][y-1]=new Keresztezodes_Graf(s, "ker");
	}

	/**
	 * berakja a tarolójaból az összes panelt a megfelelő sorrendben
	 * Az üres helyekre üres (háttérszínű) panelt rak be
	 * 
	 */
	public void ready(){
		for(int i=0; i<14; i++){
			for(int t=0; t<20; t++){
				if(fields[i][t]!=null){
					this.add(fields[i][t]);
				}
				else{
					JPanel empty=new JPanel();
					empty.setSize(50, 50);
					empty.setBackground(Color.green);
					this.add(empty);
				}
			}
		}
	}

	/**
	 * kiuriti a tarolot
	 * 
	 */
	public void clear(){
		for(int i=0; i<14; i++){
			for(int t=0; t<20; t++){
				fields[i][t]=null;
			}
		}
	}
}
