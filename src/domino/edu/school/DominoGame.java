package domino.edu.school;

import java.util.Scanner;

public class DominoGame {
	
	DominoPlayer[] players;
	DominoPool pool;
	DominoDeck deck;

	public DominoGame(int numberOfPlayers) {
		// TODO Auto-generated constructor stub
		this.players = new DominoPlayer[numberOfPlayers];
		this.pool = new DominoPool();
		this.deck = new DominoDeck();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		DominoTile tile1 = new DominoTile(DominoDigits.FIVE, DominoDigits.TWO);
		
		System.out.print(tile1.toString());
		
		
		System.out.print("How many players will play: ");
		int numberOfPlayers = s.nextInt();
		
		DominoGame game = new DominoGame(numberOfPlayers);
		
		for(int i = 0; i < numberOfPlayers; i++) {
			System.out.println("Type players name here: ");
			String playerName = s.next();
			game.RegisterPlayer(i, playerName);
		}
		
		
	}

	public void RegisterPlayer(int i, String playerName) {
		// TODO Auto-generated method stub
		this.players[i] = new DominoPlayer(playerName);
	}
	
	
	public void startGame() {
		for(DominoPlayer player : players) {
			player.clearTiles();
		}
		
		pool.reset();
		
		pool.fetchTile();
		for(int i = 0; i<5; i++) {
			for(DominoPlayer player: players) {
				DominoTile tile = pool.fetchTile();
				if (tile!=null)
					player.addTile(tile);
			}
		}
		
	}
	
	
	
	

}
