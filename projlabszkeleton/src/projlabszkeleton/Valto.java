package projlabszkeleton;

public class Valto extends Sin {
	private Sin sin3;
	private boolean allas;
	
	@Override
	public void ad(Sin s){
		
		new Program().valtofolyt(); // ez csak azért van itt hogy ha váltóra lépünk tudjunk újabb lépést tenni
	}
	
	@Override
	public Sin kovetkezo(Sin elozo){
		return new Sin();
	}
	
	public void valts(){
		Program.println("v1{Valto}: valts(): void");
	}
	
	@Override
	public Boolean akcio(){
		Program.println("v1{Valto} calls valts(): void on v1{Valto}");
		valts();
		return true;
	}
}
