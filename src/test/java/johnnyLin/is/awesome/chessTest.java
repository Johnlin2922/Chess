package johnnyLin.is.awesome;

import org.junit.*;
import static org.junit.Assert.*;

public class ChessTest{
	
	@Test
	public void testLocationConstructor(){
		Location loc = new Location('e', 4);
		assertEquals(Location.Piece.NONE, loc.getPiece());
		assertEquals('e', loc.getFile());
		assertEquals(4, loc.getRank());
	}
	
	@Test
	public void testLocationConstructorAcceptsPiece(){
		Location loc = new Location('a', 1, Location.Piece.PAWN);
		assertEquals(Location.Piece.PAWN, loc.getPiece());
		assertEquals('a', loc.getFile());
		assertEquals(1, loc.getRank());
	}
	
	@Test
	public void testKingConstructorWorks(){
		King k = new King('e', 1);
		assertEquals('e', k.getFile());
		assertEquals(1, k.getRank());
	}
}