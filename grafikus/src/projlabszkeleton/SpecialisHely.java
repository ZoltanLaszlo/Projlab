package projlabszkeleton;

public class SpecialisHely extends Sin{
	private Kapu kapum;
	private boolean leptem;
	static private int kapukszama;
	static private Kapu felkapu;

	/**
	 * Konstruktor ami egy id-vel látja el a sint, hogy tudjuk kezelni
	 *
	 * @param  nev  A nev amit adni akarunk a sinnek
	 */
	public SpecialisHely(String nev){
		super(nev);
		kapukszama=0;
		felkapu=null;
		leptem=false;
		kapum=null;
	}
	
	/**
	 * A Pálya osztály ezen keresztül jelzi, hogy a felhasználó akar valamit a speciális hellyel
	 * Ha már van kapu rajta, akkor leveszi, és megszünteti az alagutat Persze csak akkor engedi, ha az üres
	 * Ha még nincs attól függ mit csinál, hogy hány kapu van már a pályán
	 * ha nulla akkor egyszerűen lerak egy kaput
	 * ha egy akkor megcsinálja a csatlakozást a két kapu között
	 * ha kettő, akkor nem engedi, hogy lerakjunk egy újat TooMuchKapuException-t dob.
	 *
	 */
	@Override
	public Boolean akcio() throws TooManyKapuException{
		if(kapum!=null){
			if(kapum.kapu()!=null){
				if (kapum.ures() && kapum.kapu().ures()){
					kapum.kapu().ad((Kapu)null);
					felkapu=kapum.kapu();
					kapum=null;
					kapukszama--;
					return true;
				}
				else return false;
			}
			else{
				kapum=null;
				felkapu=null;
				kapukszama--;
				return true;
			}
		}
		else{
			if(kapukszama==0){
				kapum=new Kapu();
				kapum.ad(this);
				felkapu=kapum;
				kapukszama=1;
				return true;
			}
			else if(kapukszama==1){
				kapum=new Kapu();
				kapum.ad(this);
				kapum.ad(felkapu);
				kapum.Kapubeallitas(3);
				felkapu.ad(kapum);
				felkapu.Kapubeallitas(3);
				kapukszama=2;
				return true;
			}
			else {
				throw new TooManyKapuException();
			}
			
		}
	}
	
	/**
	visszaadja van-e kész alagút a speciális helyen
	* 
	* @return true, ha van false, ha nincs
	**/
	public boolean vankapu(){
		if(kapum!=null){
			if(kapum.kapu()!=null){
				return true;
			}
		}
		return false;
	}
	

	/**
	visszaadja a bejárati kaput a speciális helyen
	* 
	* @return a rajta lévő kapu (null ha nincs)
	**/
	public Kapu kapu(){
		return kapum;
	}
	
	/**
	Kaput rak a speciális helyre
	* 
	* @param a rá rakandó kapu referenciája
	**/	
	public void ad(Kapu kapum){
		this.kapum=kapum;
	}
	
	@Override
	/**
	*Visszadja a hová lépjen a mozdony a Speciális helyról
	*ha van rajta alagút akkor elozo-ből jövő vonat megy bele, kovetkező-ből jövő csak átmegy
	*Ha alagútból jön akkor elozo, fele megy
	*Ha nincs rajta alagút úgy működik, mint a sima Sin
	*
	*@param elozo megmondja honnan jött a mozdony
	**/
	public Sin kovetkezo(Sin elozo) throws EndGameException{

		if (elozo.equals(this.elozo)){
			if(vankapu()){
				kocsi.alagutAllapot(true);
				kapum.belep(kocsi);
				leptem=true;
				return kapum.kapu().hely();
			}
			else{
				return kovetkezo;
			}
		}
		else if(elozo.equals(this.kovetkezo)){
			return this.elozo;
		}
		else {
			return this.elozo;
		}
	}
	/**
	 * léptetjük a kapunkat
	 *
	 */
	@Override
	public void lep() throws EndGameException{
		if(kapum!=null && leptem==false){
			kapum.lep();
		}
		else if(kapum!=null){
			leptem=false;
		}
		
	}
}
