import java.util.Scanner;

public class MainFrame {
	
	private static Scanner scan;

	public static void main(String [] args) {
		
		Design game = new Design();
		scan = new Scanner(System.in);
		
		String option;
		int index;
		boolean gameOver = false;
		
		System.out.print("\nChoose X (Player 1) or O (Player 2) : ");
		option = scan.nextLine();
		
		do {
				
			switch(option) {
				case "X":
				case "x":
					game.updatePlayer1();
					System.out.print("\nChoose position to add X : ");
					index = scan.nextInt();
					game.addNode(index-1);
					game.getTable();
					game.checkAllConditions();
					option = "o";
					game.isWinner();
					if(game.isWinner()) {
						gameOver = true;
						option = "stopGame";
					}
					break;
				case "O":
				case "o":
					game.updatePlayer2();
					System.out.print("\nChoose position to add O : ");
					index = scan.nextInt();
					game.addNode(index-1);
					game.getTable();
					game.checkAllConditions();
					option = "x";
					game.isWinner();
					if(game.isWinner()) {
						gameOver = true;
						option = "stopGame";
					}
					break;
				case "stopGame":
					break;
				default:
					System.out.print("\nPlease, Enter valid option (X,x or O,o) : ");
					option = scan.nextLine();
					break;
			}
			
		}while(gameOver == false);
		
	}
	
}
