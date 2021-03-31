package domino.edu.school;

//import java.util.ArrayList;


public class DominoPlayer {
	
	LinkedListt<DominoTile> dominos = new LinkedListt<DominoTile>();
	String name;
	
	
	
	public DominoPlayer(String name) {
		this.dominos = null;
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void clearTiles() {
		// TODO Auto-generated method stub
		dominos = new LinkedListt<DominoTile>();
	}

	public void addTile(DominoTile tile) {
		// TODO Auto-generated method stub
		dominos.add(tile);
	}
	
	
	public DominoTile fetchTopPairTile() {
		return null;
		
		
		}
}
	
	
		
