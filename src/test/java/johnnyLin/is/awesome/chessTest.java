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
	
	@Test
	public void testToStringWithCharWorks(){
	  /*-----------------
		| | | | | | | | |
		-----------------
		| | | | | | | | |
		-----------------
		| | | | | | | | |
		-----------------
		| | | | | | | | |
		-----------------
		| | | | | | | | |
		-----------------
		| | | | | | | | |
		-----------------
		|P|P|P|P|P|P|P|P|
		-----------------
		|R|N|B|Q|K|B|N|R|
		-----------------*/
		
		String s = "-----------------\n| | | | | | | | |\n-----------------\n| | | | | | | | |\n-----------------\n| | | | | | | | |\n-----------------\n| | | | | | | | |\n-----------------\n| | | | | | | | |\n-----------------\n| | | | | | | | |\n-----------------\n|P|P|P|P|P|P|P|P|\n-----------------\n|R|N|B|Q|K|B|N|R|\n-----------------";

		Chess chess = new Chess();
		assertEquals(s, chess.toString('c'));
		
	}
	
	@Test
	public void testToCharWorks(){
		King k = new King('e', 1);
		Piece q = new Piece('d', 1, Piece.Type.QUEEN);
		Piece b = new Piece('d', 1, Piece.Type.BISHOP);
		Square e1 = new Square('e', 1, k);
		Square d1 = new Square('e', 1, q);
		Square c1 = new Square('e', 1, b);
		Square e4 = new Square('e', 1);
		
		assertEquals('K', k.toChar());
		assertEquals('Q', q.toChar());
		assertEquals('B', b.toChar());
		
		assertEquals('K', e1.toChar());
		assertEquals('Q', d1.toChar());
		assertEquals('B', c1.toChar());
		
		assertEquals(' ', e4.toChar());
	}
	
	@Test
	public void testLegalIndexCheckWorks(){
		Piece p = new Piece('e', 2, Piece.Type.PAWN);
		assertEquals(true, p.isLegalIndex(4, 4));
		assertEquals(false, p.isLegalIndex(1, 9));
		assertEquals(false, p.isLegalIndex(2, 9));
		assertEquals(true, p.isLegalIndex(0, 7));
		assertEquals(false, p.isLegalIndex(-5, 4));
	}
	
	@Test
	public void testToInternalCoordWorks(){
		Piece p = new Piece('e', 2, Piece.Type.PAWN);
		assertEquals("44", p.toInternalCoord('e', 4));
		assertEquals("64", p.toInternalCoord(p.getFile(), p.getRank()));
		assertEquals("77", p.toInternalCoord('h', 1));
		assertEquals("00", p.toInternalCoord('a', 8));
		assertEquals("01", p.toInternalCoord('b', 8));
	}
}