import java.util.*;

public class Main {
	
	public static char getGuess() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter you guess: ");
		String stringGuess = sc.next();
		char guess = stringGuess.charAt(0);
		return guess;
	}
	
	//check to see if guess has been guessed before
		public static boolean checkAlreadyGuessed(String guessed, char guess) {
			boolean alreadyGuessed = false;
			if(guessed.isEmpty()) {
				alreadyGuessed = false;
			}			
			if(guessed.indexOf(guess) == -1) {
				alreadyGuessed = false;
			}
			else {
				System.out.println("You have already guessed that!");
				alreadyGuessed = true;
			}
			return alreadyGuessed;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int turn = 0;
		int maxTurns = 7;
		char guess;
		boolean guessed = false;
		boolean correct = false;
		String word = "testing";
		String previouslyGuessed = "";
		
		
		//game loop
		while(turn <= maxTurns) {	
			Board gameBoard = new Board();
			gameBoard.printBoard(turn);
			//print dashed word
			
			guess = getGuess();
			Guess playerGuess = new Guess();
			playerGuess.setGuess(guess);
			guessed = checkAlreadyGuessed(previouslyGuessed, guess);
			if(!guessed) {
				previouslyGuessed += guess;
			}

			
			//loop until player guesses an unguessed letter
			while(guessed) {
				guess = getGuess();
				playerGuess.setGuess(guess);
				guessed = checkAlreadyGuessed(previouslyGuessed, guess);

				
			}
			
			playerGuess.checkCorrect(word);
			correct = playerGuess.getCorrectGuess();

			
			if(correct) {
				//update dashed word and print board
			}
			else if (!correct && !guessed){
				turn++;
			}
		}
		System.out.println("Game Over");
	}
}
