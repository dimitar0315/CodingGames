package domino.edu.school;

//import java.util.ArrayList;
import java.util.Random;

public class DominoPool {
	private LinkedListt<DominoTile> tiles = new LinkedListt<DominoTile>();
	private Random rand = new Random();

	public void reset() {
		// TODO Auto-generated method stub
		tiles = new LinkedListt<DominoTile>();
		for(int i = 0; i<=6; i++) {
			for(int j = i; j<=6; j++) {
				tiles.add(new DominoTile(DominoDigits.Get(i),DominoDigits.Get(j)));
			}
		}
		
		
	}

	public DominoTile fetchTile() {
		// TODO Auto-generated method stub
		if (tiles.isEmpty())
			return null;
		else
			return tiles.removeElement(rand.nextInt(tiles.size()));
	}
	
	
	
	
}
