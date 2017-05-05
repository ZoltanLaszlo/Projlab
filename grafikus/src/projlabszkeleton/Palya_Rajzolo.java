package projlabszkeleton;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JPanel;

public class Palya_Rajzolo extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Sin_Graf[][] fields;
	
	
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
	}
	
	public void adSin(Sin s, int x, int y, String allapot){
		fields[x-1][y-1]=new Sin_Graf(s, allapot);
	}
	public void adValto(Valto s, int x, int y, String allapot){
		fields[x-1][y-1]=new Valto_Graf(s, allapot);
	}
	public void adSpecialisHely(SpecialisHely s, int x, int y, String allapot){
		fields[x-1][y-1]=new SpecialisHely_Graf(s, allapot);
	}
	public void adMegallo(Megallo s, int x, int y, String allapot){
		fields[x-1][y-1]=new Megallo_Graf(s, allapot);
	}
	public void adKeresztezodes(Keresztezodes s, int x, int y){
		fields[x-1][y-1]=new Keresztezodes_Graf(s, "ker");
	}
	
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
}
