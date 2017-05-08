package projlabszkeleton;

public class Kapu implements Elem{

	private Kapu masikkapu;
	private int hossz;
	private Kocsi[] belepokocsik;
	private SpecialisHely helyem;
	
	/**
	 * konstruktor belepokocsik addig nincsenek am�g be nem allitjak a kaput
	 */	
	public Kapu(){
		belepokocsik=null;
	}
	
	/**
	 * ha l�trej�n az alag�t (azaz van k�t kapu)
	 * akkor l�tre kell hozni a hosszal megegyez� m�ret� t�rol�t
	 * 
	 * @param hossz Az alag�t hossza
	 */	
	public void Kapubeallitas(int hossz){
		this.hossz=hossz;
		belepokocsik = new Kocsi[this.hossz];
	}
	
	/**
	 *Visszaadja van-e m�g kocsi az alag�tban
	 *
	 *@return true ha m�r nincs kocsi azaz �res false, ha m�g van 
	 */		
	public boolean ures(){
		if(belepokocsik != null){	//addition
			for (int i=0; i<belepokocsik.length; i++){
				if(belepokocsik[i]!=null)
					return false;
			}
		}
		return true;
	}
	
	/**
	 *L�ptetj�k az alag�tban l�v� vonatokat, 
	 *gondoskodunk arr�l, hogy az alag�tb�l kil�g� r�szeket is mozgassuk
	 *
	 */	
	@Override
	public void lep() throws EndGameException{
		if(!ures()){
			if(belepokocsik[0]!=null){ //ha az alag�t elej�n egy kocsi �ll
				if(belepokocsik[0].mogotte!=null){  //ha ez a kocsi nem az utols�, hanem van m�g ut�na kocsi
					belepokocsik[0].mogotte.alagutAllapot(true); //bel�ptetjuk azt a kocsit az alag�tba
					belepokocsik[0].mogotte.sinem().ad((Kocsi)null); //a kocsi kor�bbi hely�t felsazbad�tjuk
					if(belepokocsik[0].mogotte.mogotte != null){	//ha van m�g a kocsi m�g�tt t�bb kocsi akkor azt r�l�ptetj�k az el�bb felszabad�tott speci�lis helyre
						belepokocsik[0].mogotte.mogotte.kocsilepj(belepokocsik[0].mogotte.sinem());
					}
				}
				belep(belepokocsik[0].mogotte); //l�ptetjuk az alag�tban l�v� kocsikat, �gy hogy megadjuk az elej�re ker�l� kocsit
			}
			else{
				belep(null); //l�ptetjuk az alag�tban l�v� kocsikat, �gy, hogy az elej�re nem ker�l Kocsi
			}
		}
	}
	
	/**
	 *a k�telez� implement�l�s v�gett, nem csin�l semmit
	 *
	 */	
	@Override
	public Boolean akcio() {
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
	 *A kapu hely�t adja vissza
	 *
	 *@return a kap Speci�lis helye
	 */	
	public SpecialisHely getSpecHelyem() {
		return helyem;
	}

	/**
	 *visszaadja az alag�t m�sik kaupuj�t
	 *
	 *@return az alag�t m�sik kapuja
	 */	
	public Kapu getMasikKapu(){
		return masikkapu;
	}
	
	/**
	 *Hozz�rendeli a speci�lis hely�t
	 *
	 *@param helyem Az �t tartalmaz� speci�lis hely
	 */	
	public void ad(SpecialisHely helyem){
		this.helyem=helyem;
	}
	
	/**
	 *Hozz�rendeli az alag�t m�sik kapu-j�t
	 *
	 *@param masikkapu au alag�t m�sik Kapu-ja
	 */	
	public void ad(Kapu masikkapu){
		this.masikkapu=masikkapu;
	}
	
	
	/**
	 *a lep() vagy a speci�lis hely kovetkezo() fv-h�vja meg
	 *l�pteti az alag�tban l�v� kocsikat
	 *,aki a v�g�n van azt kiveszi az alag�t�llapotb�l
	 *a param�terk�nt kapott Kocsit pedig berakja az alag�t elej�re
	 *
	 *@param k a l�p�s sor�n az alag�t elej�re ker�l� Kocsi
	 */	
	public void belep(Kocsi k) throws EndGameException{
		if(belepokocsik[belepokocsik.length-1]!=null){
			belepokocsik[belepokocsik.length-1].alagutAllapot(false);
			this.masikkapu.helyem.ad(belepokocsik[belepokocsik.length-1]);
			belepokocsik[belepokocsik.length-1].ad(this.masikkapu.helyem);
		}
		for(int i=belepokocsik.length-1; i>0;i--){
			belepokocsik[i]=belepokocsik[i-1];
		}
		belepokocsik[0]=k;
	}

}