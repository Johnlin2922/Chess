package johnnyLin.is.awesome; 

import java.util.*;

public class Piece{
	
	public enum Type{KING, QUEEN, ROOK, BISHOP, KNIGHT, PAWN, NONE};
	
	private char file; 
	private int rank;
	private boolean isAttacked; 
	private Type type; 
	private List<String> path; 
	
	public Piece(char c, int i, Type t){
		
		file = c; 
		rank = i; 
		isAttacked = false; 
		type = t; 
		path = new ArrayList<>(); 
		
	}
	
	public void setPath(){
		switch (type){
			case KING:
				break; 
			case QUEEN:
				break;
			case ROOK:
				break;
			case BISHOP:
				break;
			case KNIGHT:
				break;
			case PAWN:
				break;
			case NONE:
				break;
			default: 
				break;
		}
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
	
	public char toChar(){
		switch (type){
			case KING:
				return 'K'; 
			case QUEEN:
				return 'Q';
			case ROOK:
				return 'R';
			case BISHOP:
				return 'B';
			case KNIGHT:
				return 'N';
			case PAWN:
				return 'P';
			case NONE:
				return ' ';
			default:
				return 'j';    
		}
	}
	
	public boolean isLegalIndex(int x, int y){  //this should be private... only the setPath() method uses it. its only public because of the unit test
		if(x < 0 || x > 7){
			return false; 
		}
		if(y < 0 || y > 7){
			return false; 
		}
		return true; 
	}
	
	public String toInternalCoord(char file, int rank){
		String s = "";
		int[] reverse = {8, 7, 6, 5, 4, 3, 2, 1, 0};
		s += Integer.toString(reverse[rank]);
		switch (file){
			case 'a':
				s += "0";
				break;
			case 'b':
				s += "1";
				break;
			case 'c':
				s += "2";			
				break;
			case 'd':
				s += "3";
				break;
			case 'e':
				s += "4";
				break;
			case 'f':
				s += "5";
				break;
			case 'g':
				s += "6";
				break;
			case 'h':
				s += "7";
				break;
			default: 
				break; 
		}
		return s; 
	}
}