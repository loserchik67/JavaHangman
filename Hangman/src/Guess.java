
public class Guess {
	private String previouslyGuessed;
	private char guess;
	private boolean alreadyGuessed;
	private boolean correctGuess;
	
	//constructor
	public Guess() {
		this.previouslyGuessed = " ";
		this.guess = ' ';
		this.alreadyGuessed = false;
		this.correctGuess = false;
	}
	
		
	//setters
	
	public void setGuess(char guess) {
		this.guess = guess;
	}
	
	public void setAlreadyGuessed(boolean guessed) {
		this.alreadyGuessed = guessed;
	}
	
	//getters
	public String getPreviouslyGuessed() {
		return this.previouslyGuessed;
	}
	
	public char getGuess() {
		return this.guess;
	}
	
	public boolean getAlreadyGuessed() {
		return this.alreadyGuessed;
	}
	
	public boolean getCorrectGuess() {
		return this.correctGuess;
	}
	
	
	

	//check to see if the guess is correct
	public void checkCorrect(String word) {
		if(word.indexOf(this.guess) == -1) {
			this.correctGuess = false;
			System.out.println("That guess is incorrect");
		}else {
			this.correctGuess = true;
			System.out.println("That guess is correct!");
		}
	}
	
}
