package codingwizards;

import java.util.Random;
import java.util.Scanner;

public class q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		char[] choices = {'R','P','S'};
		int userScore = 0,computerScore = 0;
		
		for(int i = 0; i<=2;i++) {
			System.out.println("Enter User's Choice: ");
			char choice = sc.next().charAt(0);
			if(choice!='R' && choice!='P'&& choice!='S') {
				System.out.println("Invalid Input");
				System.exit(0);
			}
			else {
				System.out.println("Computer's Chioice(Randomly generated)");
				char comp = choices[random.nextInt(3)];
				System.out.println(comp);
				if(comp == choice)
				{
					System.out.println("Tie of round");
					continue;
				}
				switch(choice)
				{
				case 'R':
					if(comp == 'P')
					{
						computerScore+=1;
						System.out.println("Computer won the round");
					}
					
					else {
						userScore+=1;
						System.out.println("User won the round");
					}
					
				break;
				
				case 'P':
					if(comp == 'S')
					{
						computerScore+=1;
						System.out.println("Computer won the round");
					}
					else {
						userScore+=1;
						System.out.println("User won the round");
					}
					break;
				case 'S':
					if(comp == 'R')
					{
						computerScore+=1;
						System.out.println("Computer won the round");
					}
					else {
						userScore+=1;
						System.out.println("User won the round");
					}
					break;
				}
			}}
		if(userScore == computerScore)
		{
			System.out.println("3 rounds over, User Scored "+userScore+",Tie of Game");
		}
		else if(userScore > computerScore)
		System.out.println("3 rounds over, User Scored "+userScore+",User won the game");
		else {
			System.out.println("3 rounds over, User Scored "+userScore+",Computer won the game");
		}
	}

}
