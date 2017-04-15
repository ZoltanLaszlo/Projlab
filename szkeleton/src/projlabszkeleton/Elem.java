package projlabszkeleton;

public interface Elem {
	//public String id="";
	
	public abstract void lep() throws EndGameException;
	public abstract Boolean akcio() throws TooManyKapuException;

}
