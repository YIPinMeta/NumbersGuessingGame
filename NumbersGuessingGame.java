package day7;

import java.util.Random;
import java.util.Scanner;

public class NumbersGuessingGame {

	public static void main(String[] args) {
		// User has 3 attempts to guess Computer's number
		Scanner scanner = new Scanner (System.in);
		Random random= new Random();
		int cpuNum =random.nextInt(10)+1;
		int attempts=3;
		boolean guessCorrectly=false;
		System.out.println("It's a Number Guessing Game!");
		System.out.println("Now,guess a number between 1 and 10");
		System.out.println("You have " +attempts+ " attempts,");
		
		for (int i=1; i<=attempts; i++)
		{
			System.out.println("Attempt " +i+ " Enter your guess");
			int userGuess =scanner.nextInt();
			
			if (userGuess == cpuNum) 
			{
				System.out.println("Good Job! " +cpuNum+ " Is the number I was thinking! :D");
			guessCorrectly = true;
			break;
		
		
		}else {
			System.out.println("Wrong guess");
		if (i < attempts)
		{
			System.out.println("Try Again");
		}
		}
		}
	if(!guessCorrectly)
	{
		System.out.println("You're out of guesses :( the number was: " + cpuNum);
	}
	scanner.close();
}
	}
