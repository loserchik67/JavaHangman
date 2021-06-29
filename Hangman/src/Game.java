
public class Game {
	private int maxTurns;
	private boolean win;
	private String word;
	private String dashedWord;
	
	Game(){
		maxTurns = 7;
		win = false;
		word = "testing";
	}
	
	//make dashed word
	public void setDashedWord() {
		String dashed= "";
		for(int i = 0; i < this.word.length(); i++) {
			dashed += "-";
		}
		this.dashedWord = dashed;
	}
	
	
	public void hasWon() {
		if(this.dashedWord.indexOf('-') == -1) {
			this.win = true;
		}
	}
	
	
	//getters
	public int getMaxTurns() {
		return this.maxTurns;
	}
	
	public boolean getWin() {
		return this.win;
	}
	
	public String getWord() {
		return this.word;
	}
	
	public String getDashedWord() {
		return this.dashedWord;
	}
	
	//setters
	public void setDashedWord(String dashed) {
		this.dashedWord = dashed;
	}
}
