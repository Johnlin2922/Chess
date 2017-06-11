package johnnyLin.is.awesome;

import org.junit.*;
import static org.junit.Assert.*;

public class ChessTest{
	
	@Test
	public void testSquareConstructor(){
		Square loc = new Square('e', 4);
		assertEquals(null, loc.getPiece());
		assertEquals('e', loc.getFile());
		assertEquals(4, loc.getRank());
	}
	
	@Test
	public void testSquareConstructorAcceptsPiece(){
		
		Piece e2pawn = new Piece('e', 2, Piece.Type.PAWN);
		Square loc = new Square('a', 1, e2pawn);
		assertEquals(e2pawn, loc.getPiece());
		assertEquals('a', loc.getFile());
		assertEquals(1, loc.getRank());
	}
	
	@Test
	public void testKingConstructorWorks(){
		King k = new King('e', 1);
		assertEquals('e', k.getFile());
		assertEquals(1, k.getRank());
	}
	
	@Test
	public void testChessConstructorWorks(){
		String s = "|NONE|NONE|NONE|NONE|NONE|NONE|NONE|NONE|\n|NONE|NONE|NONE|NONE|NONE|NONE|NONE|NONE|\n|NONE|NONE|NONE|NONE|NONE|NONE|NONE|NONE|\n|NONE|NONE|NONE|NONE|NONE|NONE|NONE|NONE|\n|NONE|NONE|NONE|NONE|NONE|NONE|NONE|NONE|\n|NONE|NONE|NONE|NONE|NONE|NONE|NONE|NONE|\n|PAWN|PAWN|PAWN|PAWN|PAWN|PAWN|PAWN|PAWN|\n|ROOK|KNIGHT|BISHOP|QUEEN|KING|BISHOP|KNIGHT|ROOK|";

		Chess chess = new Chess();
		assertEquals(chess.toString(), s);
		
	}
}