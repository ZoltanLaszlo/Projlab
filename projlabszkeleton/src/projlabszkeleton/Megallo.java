package projlabszkeleton;

import java.awt.*;

public class Megallo extends Sin{
	private Color szin;
	//ha egy kocsi rálép ellenőrzi hogy mi a színe ha megegyizik akkor kezdeményezi a leszállást a kocsinál
	@Override
	public void ad(Kocsi k){
		System.out.println(">>s3{Megallo} calls"
				+ " szin():Color on "
				+ "k{Kocsi}");
		k.szin();
		System.out.println("? megegyezik [igen][nem]");
		//Scanner scanner = new Scanner(System.in);
		String input = new Program().scanner.nextLine();
		//scanner.close();
		if(input.equals("igen")){
			System.out.println(">>s3{Megallo} calls"
					+ " leszallas():void on "
					+ "k{Kocsi}");
			new Kocsi().leszallas();
		}
	}
	public Color szin(){
		return szin;
	}
}
