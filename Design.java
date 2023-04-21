public class Design extends GameLogic{
	
	public void getTable() {
		
		int i;
		for(i = 0; i < table.length; i++) {
			if(i % 3 == 0) {
				System.out.print("\n");
			}else if(i == 6 || i == 7 || i == 8) {
				System.out.print(" |");
			}else {
				System.out.print("|");
			}
			
			if(i != 6 && i != 7 && i != 8) {
				System.out.print("_");
			}
			
			System.out.print(table[i]);
		}
	}
}
