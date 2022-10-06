import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		startGame(sc);
	}
	
	static void startGame(Scanner sc) {
		System.out.println("***  Guess the number from 0 to 100 ***");
		boolean rightGuess = false;
		int answer = (int) Math.round(Math.random()*100);
		int amountOfGuesses = 0;
		do {
			System.out.println("Your guess:");
			int guess = sc.nextInt();
			amountOfGuesses++;
			rightGuess = evaluateGuess(guess, answer);
			if(!rightGuess) {
				System.out.println((isGuessLower(guess, answer) ? "Too low" : "Too high"));
			}
		} while (!rightGuess);
		System.out.println(answer + " was right! It took " + amountOfGuesses + " guesses. Please, one more round...");
		System.out.println("------------------------------------------");
		startGame(sc);	
	}
	
	static boolean evaluateGuess(int guess, int answer) {
		return guess==answer;
	}
	
	static boolean isGuessLower(int guess, int answer) {
		return guess<answer;
	}
}
