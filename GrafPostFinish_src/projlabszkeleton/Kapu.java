package projlabszkeleton;

public class Kapu implements Elem{

	private Kapu masikkapu;
	private int hossz;
	private Kocsi[] belepokocsik;
	private SpecialisHely helyem;
	
	/**
	 * konstruktor belepokocsik addig nincsenek amíg be nem allitjak a kaput
	 */	
	public Kapu(){
		belepokocsik=null;
	}
	
	/**
	 * ha létrejön az alagút (azaz van két kapu)
	 * akkor létre kell hozni a hosszal megegyezõ méretû tárolót
	 * 
	 * @param hossz Az alagút hossza
	 */	
	public void Kapubeallitas(int hossz){
		this.hossz=hossz;
		belepokocsik = new Kocsi[this.hossz];
	}
	
	/**
	 *Visszaadja van-e még kocsi az alagútban
	 *
	 *@return true ha már nincs kocsi azaz üres false, ha még van 
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
	 *Léptetjük az alagútban lévõ vonatokat, 
	 *gondoskodunk arról, hogy az alagútból kilógó részeket is mozgassuk
	 *
	 */	
	@Override
	public void lep() throws EndGameException{
		if(!ures()){
			if(belepokocsik[0]!=null){ //ha az alagút elején egy kocsi áll
				if(belepokocsik[0].mogotte!=null){  //ha ez a kocsi nem az utolsó, hanem van még utána kocsi
					belepokocsik[0].mogotte.alagutAllapot(true); //beléptetjuk azt a kocsit az alagútba
					belepokocsik[0].mogotte.sinem().ad((Kocsi)null); //a kocsi korábbi helyét felsazbadítjuk
					if(belepokocsik[0].mogotte.mogotte != null){	//ha van még a kocsi mögött több kocsi akkor azt ráléptetjük az elõbb felszabadított speciális helyre
						belepokocsik[0].mogotte.mogotte.kocsilepj(belepokocsik[0].mogotte.sinem());
					}
				}
				belep(belepokocsik[0].mogotte); //léptetjuk az alagútban lévõ kocsikat, úgy hogy megadjuk az elejére kerülõ kocsit
			}
			else{
				belep(null); //léptetjuk az alagútban lévõ kocsikat, úgy, hogy az elejére nem kerül Kocsi
			}
		}
	}
	
	/**
	 *a kötelezõ implementálás végett, nem csinál semmit
	 *
	 */	
	@Override
	public Boolean akcio() {
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
	 *A kapu helyét adja vissza
	 *
	 *@return a kap Speciális helye
	 */	
	public SpecialisHely getSpecHelyem() {
		return helyem;
	}

	/**
	 *visszaadja az alagút másik kaupuját
	 *
	 *@return az alagút másik kapuja
	 */	
	public Kapu getMasikKapu(){
		return masikkapu;
	}
	
	/**
	 *Hozzárendeli a speciális helyét
	 *
	 *@param helyem Az õt tartalmazó speciális hely
	 */	
	public void ad(SpecialisHely helyem){
		this.helyem=helyem;
	}
	
	/**
	 *Hozzárendeli az alagút másik kapu-ját
	 *
	 *@param masikkapu au alagút másik Kapu-ja
	 */	
	public void ad(Kapu masikkapu){
		this.masikkapu=masikkapu;
	}
	
	
	/**
	 *a lep() vagy a speciális hely kovetkezo() fv-hívja meg
	 *lépteti az alagútban lévõ kocsikat
	 *,aki a végén van azt kiveszi az alagútállapotból
	 *a paraméterként kapott Kocsit pedig berakja az alagút elejére
	 *
	 *@param k a lépés során az alagút elejére kerülõ Kocsi
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