package day13.com.ict.edu;

public class Ex99_rps {
	// variables
	/*
	 * computerchoice humaninput y/n round roundwon
	 * 
	 * 0 rock 1 paper 2 scissors
	 * 
	 */

//	private String humanChoiceString = "";
	private int computerChoice = 0;
	private int humanChoice = 0;
	private String winner = "";
	private int round = 0;
	private int roundWon = 0;
	private String scanner2 = "";

	// getter & setter
	public int getComputerChoice() {
		return computerChoice;
	}

	public void setComputerChoice(int computerChoice) {
		this.computerChoice = computerChoice;
	}

	public int getHumanChoice() {
		return humanChoice;
	}

	public void setHumanChoice(int humanChoice) {
		this.humanChoice = humanChoice;
	}

	public void setScanner2(String str) {
		this.scanner2 = str;
	}
	
	
	
	
	// methods
	public void startPrompt() {
		System.out.println();
		System.out.println("Choose Rock(0) Paper(1) or Scissors(2)");
	}
	public int computerChoice() {
		this.computerChoice = (int) (Math.random() * 3);
		return computerChoice;
	}

	public void compareDate() {
		/* 0rock 1paper 2scissors */
		if (humanChoice == 0 && computerChoice == 0)
			winner = "none";
		else if (humanChoice == 1 && computerChoice == 1)
			winner = "none";
		else if (humanChoice == 2 && computerChoice == 2)
			winner = "none";
		else if (humanChoice == 0 && computerChoice == 1)
			winner = "Computer";
		else if (humanChoice == 0 && computerChoice == 2)
			winner = "Player";
		else if (humanChoice == 1 && computerChoice == 0)
			winner = "Player";
		else if (humanChoice == 1 && computerChoice == 2)
			winner = "Computer";
		else if (humanChoice == 2 && computerChoice == 0)
			winner = "Computer";
		else if (humanChoice == 2 && computerChoice == 1)
			winner = "Player";
		else
			winner = "CHAOS";
	}

	public void validateRound() {
		if (winner.equalsIgnoreCase("none")) {
			this.roundUp();
		} else if (winner.equalsIgnoreCase("Player")) {
			this.roundUp();
			this.roundWonUp();
		} else
			this.roundUp();
	}

	public void drawRound() {
		System.out.printf("Player picked %d, Computer picked %d. It's a draw!%n", humanChoice, computerChoice);
	}

	public void printRound() {
		System.out.printf("Player picked %d, Computer picked %d, %s won!%n", humanChoice, computerChoice, winner);
	}

	public void printResult() {
		System.out.println("Total Round " + this.round);
		System.out.println("Rounds Won " + this.roundWon);
	}

	public void iteratePrompt() {
		System.out.println("Continue playing?Y/yes or N/no");
	}

	public boolean flag() {
		if (scanner2.equalsIgnoreCase("yes") || scanner2.equalsIgnoreCase("y")) {
			return true;
		} else {
			return false;
		}

	}

	public void roundUp() {
		this.round++;
	}

	public void roundWonUp() {
		this.roundWon++;
	}
}
