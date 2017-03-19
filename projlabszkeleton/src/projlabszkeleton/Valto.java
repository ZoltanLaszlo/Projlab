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
		System.out.println("v1{Valto}: valts(): void");
	}
	
	@Override
	public Boolean akcio(){
		System.out.println("v1{Valto} calls valts(): void on v1{Valto}");
		valts();
		return true;
	}
}
