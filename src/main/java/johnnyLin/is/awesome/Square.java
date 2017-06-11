package johnnyLin.is.awesome;

public class Square{
	
	private Piece piece; 
	private char file; 
	private int rank; 
	private Piece.Type type; 
	
	public Square(char c, int i){
		this(c, i, null);
	}
	
	public Square(char c, int i, Piece p){
		file = c; 
		rank = i; 
		if(p == null){
			type = Piece.Type.NONE;
		}
		else{	
			piece = p; 
			type = piece.getType();
		}	
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
	
	public Piece.Type getType(){
		return type; 
	}
}