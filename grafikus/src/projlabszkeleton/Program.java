package projlabszkeleton;
/*
import java.lang.reflect.InvocationTargetException;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Scanner;*/

public class Program {

	public static void main(String[] args) {

		/*
		Palya P1=new Palya();
		Mozdony m1=new Mozdony(Color.black, "m1");
		Kocsi k1= new Kocsi(1, Color.black, "k1");
		Kocsi k2= new Kocsi(1, Color.black, "k2");
		Sin s1= new Sin("s1");
		Sin s2= new Sin("s2");
		Sin s3= new Sin("s3");
		Sin s4= new Sin("s4");
		P1.add(m1);
		P1.add(k2);
		P1.add(k1);
		P1.add(s1);
		P1.add(s2);
		P1.add(s3);
		P1.add(s4);
		s1.ad(s2);
		s2.ad(s1);
		s2.ad(s3);
		s3.ad(s2);
		s3.ad(s4);
		s4.ad(s3);
		k1.ad(m1);
		m1.ad(k1);
		k1.ad(k2);
		k2.ad(k1);
		try{
			s3.ad(m1);
			s2.ad(k1);
			s1.ad(k2);
		}catch (EndGameException e){
			System.out.println(e.result());
		}
		m1.ad(s3);
		k1.ad(s2);
		k2.ad(s1);
		try{
			P1.leptetes();
		}catch (EndGameException e){
			System.out.println(e.result());
		}
		System.out.println("m1 "+m1.sinem().id+" "+m1.utasokSzama);
		System.out.println("k1 "+k1.sinem().id+" "+k1.utasokSzama);
		System.out.println("k2 "+k2.sinem().id+" "+k2.utasokSzama);
		*/
		/*
		TestParser tp = new TestParser("projlabszkeleton");

		Scanner sc = new Scanner(System.in);
		String command;
		do {
			command = sc.nextLine();
			if (!command.equals("exit"))
				try {
					tp.parseCommand(command);
				} catch (ParseException e) {
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				} catch (InstantiationException e) {
					e.printStackTrace();
				} catch (NoSuchMethodException e) {
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					e.printStackTrace();
				}
		} while (!command.equals("exit") && sc.hasNext());
		System.out.println();
		HashMap<String, Object> objects = tp.getObjects();
		for (Object o : objects.values()) {
			if (o.getClass().equals(Kocsi.class) || o.getClass().equals(Mozdony.class)) {
				Kocsi kocsi = (Kocsi) o;
				System.out.println(kocsi.getKocsibyID() + " " + kocsi.sinem().id + " " + kocsi.getUtasokSzama());
			}
		}*/
		Ablak ablak=new Ablak();
		ablak.setVisible(true);
	}
}