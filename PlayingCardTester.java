package CardGame;

/********************************************************************
*  PLayingCardTester.java       
*
*  Program designed to test PlayingCard.java to 
*  make sure all the different parts run correctly
*  
*  @Author: Allen Pagan
*  
********************************************************************/

import java.util.Scanner;
public class PlayingCardTester
{
	public static void main(String[] args)
	{	
		PlayingCard card1 = new PlayingCard();
		PlayingCard card2 = new PlayingCard();
		boolean win = false;
		boolean lose = false;		
		int keepPlaying = 2;
		int hiLoGuess;
		int gamesPlayed = 0;
		int wins = 0;
		int losses = 0;
		int ties = 0;
		double bankroll;
		double bet;
		
		Scanner input = new Scanner(System.in);
		
		
			do{
				System.out.print("Please enter your bankroll: ");
				bankroll = input.nextDouble();
				if(bankroll <= 0)
					System.out.println("Bankroll must be a positive number.");
			}while(bankroll <= 0);
			do{	
			do{
				System.out.print("Please enter a bet, must be less than $100.00: ");
				bet = input.nextDouble();
				if((bankroll - bet) < 0)
					System.out.println("You can't bet more money than you have.");
			}while((bet >= 100) || ((bankroll - bet) <= 0));
			while(bet <= 0)
         {
         System.out.println("Bet must be a positive number");
         System.out.print("Please enter a bet, must be less than $100.00: ");
         bet = input.nextDouble();
         }
			card1.drawCard();
			System.out.println(card1);
			 do{
			 		 System.out.println("Will the next card be (1)Hi or (2)Lo? ");
					 hiLoGuess = input.nextInt();
			}while((hiLoGuess != 1) && (hiLoGuess != 2));
			
			
			do{
					card2.drawCard();
			}while(card1.isEquals(card2));
			System.out.println("The next card is a " + card2);
			
			if(((card2.getFace() > card1.getFace()) && (hiLoGuess == 1)) ||
				((card2.getFace() < card1.getFace()) && (hiLoGuess == 2)))
					win = true;
			else if(((card2.getFace() > card1.getFace()) && (hiLoGuess == 2)) ||
				((card2.getFace() < card1.getFace()) && (hiLoGuess == 1)))
					lose = true;
					
			if(win){
				System.out.print("Player won! ");
				bankroll+= bet;
				wins ++;
			}
			else if(lose){
				System.out.print("Player lost! ");
				bankroll -= bet;
				losses ++;
			}
			else{
				System.out.print("Player tied! ");
				ties++;
			}
				
			System.out.printf("Your bankroll is now $%.2f%n", bankroll);
			
			System.out.println("Would you like to keep playing? (1)Yes or (2)No ");
			keepPlaying = input.nextInt();
			
			if(bankroll == 0){
				keepPlaying = 2;
				System.out.println("Not enough funds in bankroll. ");
			}
		}while(keepPlaying == 1);
		
		input.close(); //Close scanner 'input'
			
		System.out.println("Total games played: " +  gamesPlayed);
		System.out.println("Games won: " + wins);
		System.out.println("Games lost: " + losses);
		System.out.println("Games tied: " + ties);
		System.out.printf("Final bankroll: $%.2f", bankroll);
		
	}	
}