package day13.com.ict.edu;

import java.util.Scanner;

public class Ex99_main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Ex99_rps rps = new Ex99_rps();

		
		do {
			// generate computer data 0~3	
			rps.computerChoice();
			//prompt for input
			rps.startPrompt();
			// scan input in int
			rps.setHumanChoice(sc.nextInt());
			// compare data	
			rps.compareDate();
			// validate round (round++ roundup++)
			rps.validateRound();
			// print round result
			rps.printRound();
			// iterate? and Scan input => flag
			rps.iteratePrompt();
			rps.setScanner2(sc.next());
		} while (rps.flag());
		rps.printResult();
	}
}
