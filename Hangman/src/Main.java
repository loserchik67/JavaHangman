import java.io.IOException;
import java.util.*;

public class Main {
	
	public static char getGuess() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter you guess: ");
		String stringGuess = sc.next();
		stringGuess = stringGuess.toLowerCase();
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
		
	//edit dashed word
	public static String getDashedWord(char guess , String dashedWord, String word) {
		StringBuilder string = new StringBuilder();
		string.append(dashedWord);
		for(int i = 0; i < dashedWord.length(); i++) {
			if(word.charAt(i) == guess) {
				 string.setCharAt(i, guess);
			}
		}
		dashedWord = string.toString();
		return dashedWord;
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int turn = 0;
		char guess;
		boolean guessed = false;
		boolean correct = false;
		String previouslyGuessed = "";
		
		
		
		//game initialization
		//set up game board
		Board gameBoard = new Board();
		gameBoard.printTitle();
		System.out.println();
		Game game = new Game();
		game.setWord();
		game.setDashedWord();
		
		
		//Variables from classes to keep code dry
		String dashed = game.getDashedWord();
		String word = game.getWord();
		int maxTurns = game.getMaxTurns();
		
		
		//game loop
		while(turn < maxTurns) {	
			gameBoard.printBoard(turn);
			System.out.println();
			System.out.println(dashed);
			System.out.println();
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

			
			if (!correct && !guessed){
				turn++;
			}
			
			dashed = getDashedWord(guess, dashed, word);
			game.setDashedWord(dashed);
			
			//check for win
			game.hasWon();
			if(game.getWin()) {
				System.out.println();
				System.out.println("The word was: " + game.getWord());
				System.out.println();
				System.out.println("YOU WIN!!!");
				break;
			}
		}
		
		if(!game.getWin()) {
			gameBoard.printBoard(turn);
			System.out.println();
			System.out.println("The word was: " + game.getWord());
			System.out.println();
			System.out.println("GAME OVER :(");
		}
	}
}
