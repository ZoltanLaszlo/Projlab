package projlabszkeleton;

public class SpecialisHely extends Sin{
	private Kapu kapum;
	static private int kapukszama=0;
	static private Kapu felkapu=null;

	/**
	 * Konstruktor ami egy id-vel l�tja el a sint, hogy tudjuk kezelni
	 *
	 * @param  nev  A nev amit adni akarunk a sinnek
	 */
	public SpecialisHely(String nev){
		super(nev);
	}
	
	/**
	 * A P�lya oszt�ly ezen kereszt�l jelzi, hogy a felhaszn�l� akar valamit a speci�lis hellyel
	 * Ha m�r van kapu rajta, akkor leveszi, �s megsz�nteti az alagutat Persze csak akkor engedi, ha az �res
	 * Ha m�g nincs att�l f�gg mit csin�l, hogy h�ny kapu van m�r a p�ly�n
	 * ha nulla akkor egyszer�en lerak egy kaput
	 * ha egy akkor megcsin�lja a csatlakoz�st a k�t kapu k�z�tt
	 * ha kett�, akkor nem engedi, hogy lerakjunk egy �jat TooMuchKapuException-t dob.
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
	visszaadja van-e k�sz alag�t a speci�lis helyen
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
	visszaadja a bej�rati kaput a speci�lis helyen
	* 
	* @return a rajta l�v� kapu (null ha nincs)
	**/
	public Kapu kapu(){
		return kapum;
	}
	
	/**
	Kaput rak a speci�lis helyre
	* 
	* @param a r� rakand� kapu referenci�ja
	**/	
	public void ad(Kapu kapum){
		this.kapum=kapum;
	}
	
	@Override
	/**
	*Visszadja a hov� l�pjen a mozdony a Speci�lis helyr�l
	*ha van rajta alag�t akkor elozo-b�l j�v� vonat megy bele, kovetkez�-b�l j�v� csak �tmegy
	*Ha alag�tb�l j�n akkor elozo, fele megy
	*Ha nincs rajta alag�t �gy m�k�dik, mint a sima Sin
	*
	*@param elozo megmondja honnan j�tt a mozdony
	**/
	public Sin kovetkezo(Sin elozo){
			
		if (elozo.equals(this.elozo)){
			if(vankapu()){
				kocsi.alagutAllapot(true);
				kapum.belep(kocsi);
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
	 * l�ptetj�k a kapunkat
	 *
	 */
	@Override
	public void lep() throws EndGameException{
		if(kapum!=null){
			kapum.lep();
		}
		
	}
}
