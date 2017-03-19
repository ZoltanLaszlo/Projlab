package projlabszkeleton;

public class Valto extends Sin {
	private Sin sin3;
	private boolean allas;
	
	@Override
	public void ad(Sin s){
		
	}
	
	@Override
	public Sin kovetkezo(Sin elozo){
		return new Sin();
	}
	
	public void valts(){
		System.out.println("Valto: valts(): void");
	}
	
	@Override
	public Boolean akcio(){
		System.out.println("Valto calls valts(): void on Valto");
		valts();
		return true;
	}
}
