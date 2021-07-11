public class ChessBoardRenderer {
	public boolean isBlackSquare(int square) {

		// WRITE YOUR LOGIC HERE...
		boolean isBlack = false;
		System.out.println(square);
		if(((square >= 0 && square <= 7) || (square >= 16 && square <= 23) || (square >= 32 && square <= 39) || (square >= 48 && square <= 55)) && square%2 != 0) {
			isBlack = true;
		}
		else if(((square >= 8 && square <= 15) || (square >= 24 && square <= 31) || (square >= 40 && square <= 47) || (square >= 56 && square <= 63)) && square%2 == 0) {
			isBlack = true;
		}
		return isBlack;
	}
}
