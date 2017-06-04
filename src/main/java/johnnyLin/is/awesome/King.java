package johnnyLin.is.awesome; 

public class King{
	
	private char file; 
	private int rank;
	private boolean attacked; 
	
	
	public King(char c, int i){
		file = c; 
		rank = i; 
	}
	
	public char getFile(){
		return file; 
	}
	
	public int getRank(){
		return rank; 
	}
	
	public void setAttack(boolean b){
		attacked = b; 
	}
	
	public boolean isAttacked(){
		return attacked; 
	}
	
}