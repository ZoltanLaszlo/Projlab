package projlabszkeleton;

import java.awt.*;
import java.util.Scanner;

public class Kocsi implements Elem {

	private Kocsi elotte;
	private Kocsi mogotte;
	private Color szin;
	private int utasokSzama;

	@Override
	public void lep() {
		// TODO Auto-generated method stub

	}

	@Override
	public Boolean akcio() {
		// TODO Auto-generated method stub
		return null;
	}

	public void ad(Kocsi kocsi) {

	}

	public Color szin() {
		return szin;

	}

	public void ad(Sin sin) {

	}

	// visszadja azt a sint amin áll a kocsi
	public Sin sinem() {
		System.out.println("<<k{Kocsi} sinem() returned s1:Sin");
		return null;
	}

	/**
	 * minden kocsi ami nem mozdony igy lép tovább arr a mezőre amire az előtte
	 * álló kocsi küldi
	 **/
	public void kocsilepj(Sin ide) {
		String be=new String();
		System.out.println("? van meg kocsi amit huzni kell? [igen][nem]");
		be = Program.scanner.nextLine();
		if(be.equals("igen")){
			new Kocsi().kocsilepj(new Sin());
			System.out.println(">>...{Kocsi} calls"
					+ " ad(Sin):void on "
					+ "...{Kocsi}");
			this.ad(ide);
			System.out.println(">>...{Kocsi} calls"
					+ " ad(Kocsi):void on "
					+ "...{Sin}");
			ide.ad(this);
		}
	}

	public void alagutAllapot(boolean b) {

	}

	/*
	 * a magallo hívja meg a kocsikon ha a szin megegyezik a kocsi ekkor
	 * ellenőrzi, hogy az előtte lévő kocsi üres-e ha igen akkor nullára állítja
	 * az utasok számát
	 */
	public void leszallas() {
		System.out.println(">>k{Kocsi} calls" + " Ures():boolean on " + "elozo{Kocsi}");
		if (new Kocsi().ures()) {
			System.out.println(">>k{Kocsi} calls" + " setUtasokSzama(0):void on " + "k{Kocsi}");
			this.setUtasokSzama(0);
		}

	}

	public void setUtasokSzama(int utasokSzama) {

	}

	// visszadja üres e a kocsi vagy nem
	public boolean ures() {
		System.out.println("? ures az elotte levo kocsi [igen][nem]");
		// Scanner scanner = new Scanner(System.in);
		String input = Program.scanner.nextLine();
		if (input.equals("igen")) {
			System.out.println("<<elozo{Kocsi} ures() returned true:boolean");
			return true;
		}

		// scanner.close();
		System.out.println("<<elozo{Kocsi} ures() returned false:boolean");
		return false;
	}

}
