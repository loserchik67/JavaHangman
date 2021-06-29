
public class Board {
	
		private String base1;
		private String base2;
		private String base3;
		private String base4;
		private String base5;
		private String base6;
		private String base7;
		private String base8;
		private String turn1;
		private String turn2;
		private String turn3;
		private String turn4;
		private String turn5;
		private String turn6;
		private String turn7;
		
		public Board() {
			this.base1 = "     _______";
			this.base2 = "    |/      |";
			this.base3 = "    |";
			this.base4 = "    |";
			this.base5 = "    |";
			this.base6 = "    |";
			this.base7 = "    |";
			this.base8 = " ___|___";
			this.turn1 = "    |      (_)";
			this.turn2 = "    |       |";
			this.turn3 = "    |      \\|";
			this.turn4 = "    |      \\|/";
			this.turn5 = "    |       |";
			this.turn6 = "    |      / ";
			this.turn7 ="    |      / \\";
		}
		
		public void printBoard(int numWrong) {
			switch (numWrong) {
			case 0:  System.out.println(base1 + "\n" + base2 + "\n" + base3 + "\n" + base4 + "\n" + base5 + "\n" + base6 + "\n" + base7 + "\n" + base8);
            		 break;			
            case 1:  System.out.println(base1 + "\n" + base2 + "\n" + turn1 + "\n" + base4 + "\n" + base5 + "\n" + base6 + "\n" + base7 + "\n" + base8);
                     break;
            case 2:  System.out.println(base1 + "\n" + base2 + "\n" + turn1 + "\n" + turn2 + "\n" + base5 + "\n" + base6 + "\n" + base7 + "\n" + base8);
                     break;
            case 3:  System.out.println(base1 + "\n" + base2 + "\n" + turn1 + "\n" + turn3 + "\n" + base5 + "\n" + base6 + "\n" + base7 + "\n" + base8);
                     break;
            case 4:  System.out.println(base1 + "\n" + base2 + "\n" + turn1 + "\n" + turn4 + "\n" + base5 + "\n" + base6 + "\n" + base7 + "\n" + base8);
                     break;
            case 5:  System.out.println(base1 + "\n" + base2 + "\n" + turn1 + "\n" + turn4 + "\n" + turn5 + "\n" + base6 + "\n" + base7 + "\n" + base8);
                     break;
            case 6:  System.out.println(base1 + "\n" + base2 + "\n" + turn1 + "\n" + turn4 + "\n" + turn5 + "\n" + turn6 + "\n" + base7 + "\n" + base8);
                     break;
            case 7:  System.out.println(base1 + "\n" + base2 + "\n" + turn1 + "\n" + turn4 + "\n" + turn5 + "\n" + turn7 + "\n" + base7 + "\n" + base8);
                     break;
			}
		}
		
		public void printTitle() {
			System.out.println(" _");
			System.out.println("| |");
			System.out.println("| |__   __ _ _ __   __ _ _ __ ___   __ _ _ __  ");
			System.out.println("| '_ \\ / _` | '_ \\ / _` | '_ ` _ \\ / _` | '_ \\");
			System.out.println("| | | | (_| | | | | (_| | | | | | | (_| | | | |");
			System.out.println("|_| |_|\\__,_|_| |_|\\__, |_| |_| |_|\\__,_|_| |_|");
			System.out.println("                    __/ |");
			System.out.println("                   |___/");                
			}
		
		
}