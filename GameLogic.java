public class GameLogic {
	
	protected String [] table = new String [9];
	private String flag;
	private boolean player1;
	private boolean player2; 
	private boolean win;
	private int counter = 0;
	
	public GameLogic() {
		int i;
		for(i = 0; i < table.length; i++) {
			table[i] = " ";
		}
	}
	
	public void updatePlayer1() {
		player1 = true;
		player2 = false;
	}
	
	public void updatePlayer2() {
		player2 = true;
		player1 = false;
	}
	
	public void addNode(int index) {
		if(player1 && index >= 0 && index <= 8 && table[index] == " ") {
			table[index] = "X";
			flag = "X";
		}else if(player2 && index >= 0 && index <= 8 && table[index] == " "){
			table[index] = "O";
			flag = "O";
		}else {
			System.out.println("\nPlease, Enter valid position");
		}
	}
	
	// Winning Conditions
	public void checkRows() {
		int i, j;
		for(i = 0; i < table.length; i += 3) {
			for(j = i; j <= i+2; j++) {
				if(table[j] == flag) {
					counter++;
				}
				if(counter == 3) {
					win = true;
					break;
				}
			}
			counter = 0;
		}
	}
	
	public void checkColumns() {
		int i, j;
		for(i = 0; i < 3; i++) {
			for(j = i; j < table.length; j += 3) {
				if(table[j] == flag) {
					counter++;
				}
				if(counter == 3) {
					win = true;
					break;
				}
			}
			counter = 0;
		}
	}
	
	public void checkDiaqonals() {
		int i, j;
		for(i = 0; i < table.length; i += 4) {
			if(table[i] == flag) {
				counter++;
			}
			if(counter == 3) {
				win = true;
				break;
			}
		}
		counter = 0;
		
		for(j = 2; j < table.length-1; j += 2) {
			if(table[j] == flag) {
				counter++;
			}
			if(counter == 3) {
				win = true;
				break;
			}
		}
		counter = 0;
	}
	
	public void checkAllConditions() {
		checkRows();
		checkColumns();
		checkDiaqonals();
	}
	
	public boolean isWinner() {
		if(win) {
			System.out.println("\nwinner : " + flag);
			System.out.println("Game Finished");
			return true;
		}else{
			return false;
		}
	}
	
}
