package johnnyLin.is.awesome;

public class Chess{
	
	private Square[][] board; 
	private Piece[] pieces = new Piece[16];
	
	public Chess(){
		String file = "abcdefgh";
		board = new Square[8][8];
		
		
		pieces[0] = new Piece('a', 2, Piece.Type.PAWN);
		pieces[1] = new Piece('b', 2, Piece.Type.PAWN);
		pieces[2] = new Piece('c', 2, Piece.Type.PAWN);
		pieces[3] = new Piece('d', 2, Piece.Type.PAWN);
		pieces[4] = new Piece('e', 2, Piece.Type.PAWN);
		pieces[5] = new Piece('f', 2, Piece.Type.PAWN);
		pieces[6] = new Piece('g', 2, Piece.Type.PAWN);
		pieces[7] = new Piece('h', 2, Piece.Type.PAWN);
		pieces[8] = new Piece('a', 1, Piece.Type.ROOK);
		pieces[9] = new Piece('b', 1, Piece.Type.KNIGHT);
		pieces[10] = new Piece('c', 1, Piece.Type.BISHOP);
		pieces[11] = new Piece('d', 1, Piece.Type.QUEEN);
		pieces[12] = new Piece('e', 1, Piece.Type.KING);
		pieces[13] = new Piece('f', 1, Piece.Type.BISHOP);
		pieces[14] = new Piece('g', 1, Piece.Type.KNIGHT);
		pieces[15] = new Piece('h', 1, Piece.Type.ROOK);
		
		int pieceCounter = 0; 
		
		for(int i = 7; i > -1; i--){
			for(int j = 0; j < 8; j++){
				board[i][j] = new Square(file.charAt(j), (i+1), null);
				if(i < 2){
					board[i][j] = new Square(file.charAt(j), (i+1), pieces[pieceCounter]);
					pieceCounter++;
				}
			}
		}
	}
	
	public String toString(){
		String rep = "";
		for(int i = 7; i > -1; i--){
			rep += "|";
			for(int j = 0; j < 8; j++){
				rep += board[i][j].getType();
				rep += "|";
			}
			if(i != 0){
				rep += "\n";
			}
		}
		
		return rep; 
	}
	
}