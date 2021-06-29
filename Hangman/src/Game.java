import java.io.*;
import java.util.*;

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
	
	public void setWord() throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader("word_list.txt"));
		int lines = 0;
		while(reader.readLine() != null) {
			lines++;
		}
		reader.close();
		
		//populate array
		String item = "";
		Scanner inFile = new Scanner(new File("word_list.txt"));
		List<String> wordList = new ArrayList<String>();
		while(inFile.hasNext()) {
			item = inFile.next();
			wordList.add(item);
		}
		inFile.close();
		String[] tempsArray = wordList.toArray(new String[0]);
		
		//get random word from array
		Random rand = new Random();
		int upperbound = lines;
		int int_random = rand.nextInt(upperbound);
		
		String word = tempsArray[int_random];
		
		this.word = word;		
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
