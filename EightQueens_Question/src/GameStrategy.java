public class GameStrategy {
	private boolean placedQueens[][] = new boolean[8][8];
	private int numQueens = 0;

	private int getColumn(int cellId) {
		// WRITE YOUR LOGIC HERE...................................		
		return cellId%8;	// just for the heck of it
	}
	
	private int getRow(int cellId) {
		// WRITE YOUR LOGIC HERE....................................
		return cellId/8;	// just for the heck of it
	}

	public boolean isValidPosition(int cellId) {
		boolean isValid = true;

		if(numQueens == 8) throw new GameOverException();	// just return out of the method

		// the game is still on, so let us continue...
		
		int col = getColumn(cellId);
		
		int row = getRow(cellId);
		
		/*
			WRITE YOUR LOGIC HERE...............................

		*/
		int temp_r, temp_c;
		
		if(placedQueens[row][col] == false) {
			for(int i = 0; i<8; i++) {
				placedQueens[row][i] = true;
				placedQueens[i][col] = true;
			}
			

			temp_r = row;
			temp_c = col;
			while(temp_r + 1 <= 7 && temp_c + 1 <= 7) {
				temp_r++;
				temp_c++;
				placedQueens[temp_r][temp_c] = true;
			}
		
			temp_r = row;
			temp_c = col;
			while(temp_r + 1 <= 7 && temp_c - 1 >= 0) {
				temp_r++;
				temp_c--;
				placedQueens[temp_r][temp_c] = true;
			}
			
			temp_r = row;
			temp_c = col;
			while(temp_r - 1 >= 0 && temp_c + 1 <= 7) {
				temp_r--;
				temp_c++;
				placedQueens[temp_r][temp_c] = true;
			}
			
			temp_r = row;
			temp_c = col;
			while(temp_r - 1 >= 0 && temp_c - 1 >= 0) {
				temp_r--;
				temp_c--;
				placedQueens[temp_r][temp_c] = true;
			}
			isValid = true;
			numQueens++;
		}
		else {
			isValid = false;
		}
		
		return isValid;
	}
}














