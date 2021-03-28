package domino.edu.school;

import java.util.ArrayList;
import java.util.Random;

public class DominoPool {
	private ArrayList<DominoTile> tiles = new ArrayList<DominoTile>();

	public void reset() {
		// TODO Auto-generated method stub
		tiles = new ArrayList<DominoTile>();
		for(int i = 0; i<=6; i++) {
			for(int j = i; j<=6; j++) {
				tiles.add(new DominoTile(DominoDigits.Get(i),DominoDigits.Get(j)));
			}
		}
		
		
	}

	public DominoTile fetchTile() {
		// TODO Auto-generated method stub
		Random rand = new Random();
		
		int randomNumber = rand.nextInt(tiles.size());
		
		return tiles.remove(randomNumber);
		
	}
	
	
	
	
}
