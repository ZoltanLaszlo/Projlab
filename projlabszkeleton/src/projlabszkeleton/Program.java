package projlabszkeleton;

import java.util.Scanner;

public class Program {

	private static Scanner scanner = new Scanner(System.in);
	private static int melyseg;

	public static void main(String[] args) {
		// itt beolvassuk melyik use/case stb.

		melyseg = -1;
		switch (menupontValasztas("Válassz egy működést!", 1, 5)) {
		case 1:
			println("inicializalas:");
			
			Palya palya = new Palya();
			println(">>palya{Palya} Created");
			println(">>{Program} calls start():void on palya{Palya}");
			palya.start();
			break;
		case 2:
			println("mozdonyleptetes");
			// TODO
			break;
		case 3:
			println("valto allitas");
 			println("elso{Palya} calls akcio(): boolean on v1{Valto}");
			new Valto().akcio();
			break;
		case 4:
			println("kapu allitas");
			// TODO
			break;
		case 5:
			println("jatek vege");
			// TODO
			break;
		}

		scanner.close();
	}

	/**
	 * Számozott menupontok választása.
	 * 
	 * @param menupontSzovege
	 *            A konzolra kiírt szöveg.
	 * @param minimum
	 *            A legkisebb szám, amely az adott menüpontnál még értelmezett.
	 * @param maximum
	 *            A legnagyobb szám, amely az adott menüpontnál még értelmezett.
	 * @return A bevitt menüpont száma
	 */
	public static int menupontValasztas(String menupontSzovege, int minimum, int maximum) {
		++melyseg;
		int menupont = -1;
		String input = "";
		do {
			for (int i = 0; i < melyseg; i++)
				System.out.print("	");
			System.out.print(menupontSzovege + " " + minimum + "-" + maximum + ": ");
			input = scanner.nextLine();
			menupont = menupontValidacio(input, minimum, maximum);
		} while (menupont == -1);
		return menupont;
	}

	/**
	 * Eldöntendő menüpont választása
	 * 
	 * @param menupontSzovege
	 *            A konzolra kiírt kérdés.
	 * @return True, ha igen volt a válasz, és false, ha nem
	 */
	public static boolean menupontValasztas(String menupontSzovege) {
		++melyseg;
		String input = "";
		int valasz;
		do {
			for (int i = 0; i < melyseg; i++)
				System.out.print("	");
			System.out.print(menupontSzovege + " igen/nem: ");
			input = scanner.nextLine();
			valasz = menupontValidacio(input);
		} while (valasz == -1);
		return valasz == 1 ? true : false;
	}

	/**
	 * Kiíratás a konzolra, az aktuális mélység figyelembevételével
	 * 
	 * @param str
	 *            A kiírandó string.
	 */
	public static void println(String str) {
		for (int i = 0; i < melyseg+1; i++) {
			System.out.print("	");
		}
		System.out.println(str);
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
		return -1;
	}

	/**
	 * Eldöntendő kérdés validációja
	 * 
	 * @param input
	 *            A konzolról beolvasott input.
	 * @return 1, ha igen a válasz, 0, ha nem és -1 ha helytelen az input.
	 */
	private static int menupontValidacio(String input) {
		input = input.toLowerCase();
		if (input.equals("y") || input.equals("yes") || input.equals("i") || input.equals("igen"))
			return 1;
		if (input.equals("n") || input.equals("no") || input.equals("nem"))
			return 0;
		return -1;
	}

}
