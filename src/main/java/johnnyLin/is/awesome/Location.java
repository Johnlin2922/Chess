package johnnyLin.is.awesome;

public class Location{
	
	public enum Piece{KING, QUEEN, ROOK, BISHOP, KNIGHT, PAWN, NONE}
	
	private Piece piece; 
	private char file; 
	private int rank; 
	
	public Location(char c, int i){
		this(c, i, Piece.NONE);
	}
	
	public Location(char c, int i, Piece p){
		file = c; 
		rank = i; 
		piece = p; 
	}
	
	public char getFile(){
		return file; 
	}
	
	public int getRank(){
		return rank; 
	}
	
	public Piece getPiece(){
		return piece; 
	}
}