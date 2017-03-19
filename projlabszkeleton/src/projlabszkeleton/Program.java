package projlabszkeleton;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		//itt beolvassuk melyik use/case stb.
		
		Scanner scanner = new Scanner(System.in);
		String input = "";
		int menupont;
		do {
			System.out.print("Válassz egy működést! 1-5: ");
			input = scanner.nextLine();
			menupont = menupontValidacio(input, 1 ,5);
		} while (menupont == -1);
		
		switch (menupont) {
		case 1 :
			System.out.println("inicializalas");
			// TODO
			break;
		case 2 :
			System.out.println("mozdonyleptetes");
			// TODO
			break;
		case 3 :
			System.out.println("valto allitas");
			System.out.println("elso{Palya} calls akcio(): boolean on v1{Valto}");
			new Valto().akcio();
			break;
		case 4 :
			System.out.println("kapu allitas");
			// TODO
			break;
		case 5 :
			System.out.println("jatek vege");
			// TODO
			break;
		}
	}

	/**
	 * Manüpontokat validáló segédfüggvény.
	 * 
	 * @param input
	 *            A konzolról beolvasott input.
	 * @param minimum
	 *            A legkisebb szám, amely az adott menüpontnál még értelmezett.
	 * @param maximum
	 *            A legnagyobb szám, amely az adott menüpontnál még értelmezett.
	 * @return A bevitt menüpont száma, vagy -1, ha invalid az input.
	 */
	private static int menupontValidacio(String input, int minimum, int maximum) {
		int menupont = -1;
		try {
			menupont = Integer.parseInt(input);
		} catch (NumberFormatException e) {
			// Nem szám
		}
		if (menupont >= minimum && menupont <= maximum)
			return menupont;
		return menupont;
	}

}
