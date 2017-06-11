package johnnyLin.is.awesome; 

public class Piece{
	
	public enum Type{KING, QUEEN, ROOK, BISHOP, KNIGHT, PAWN, NONE};
	
	private char file; 
	private int rank;
	private boolean isAttacked; 
	private Type type; 
	
	public Piece(char c, int i, Type t){
		
		file = c; 
		rank = i; 
		isAttacked = false; 
		type = t; 
		
	}
	
	public char getFile(){
		return file; 
	}
	
	public int getRank(){
		return rank; 
	}
	
	public void setAttacked(boolean b){
		isAttacked = b; 
	}
	
	public boolean isAttacked(){
		return isAttacked; 
	}
	
	public Type getType(){
		return type; 
	}
	
}