package projlabszkeleton;

public class SpecialisHely extends Sin{
	private Kapu kapum;
	
	@Override
	public Boolean akcio(){
		return null;
	}
	
	public boolean vankapu(){
		//meg kell k�rdezni a felhaszn�l�t�l �s azt visszaadni amit � mond
		return true;
	}
	public Kapu kapu(){
		return kapum;
	}
	@Override
	public Sin kovetkezo(Sin elozo){
		return new Sin();
	}
}
