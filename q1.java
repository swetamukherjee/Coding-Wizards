package codingwizards;

import java.util.Scanner;

public class q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String inputString = sc.next();
		char add = 'Q';
		String outputString = "";
		for(int i = 0;i<=inputString.length()-1;i++)
		{
			if(inputString.charAt(i)!='G'&&inputString.charAt(i)!='C'&&inputString.charAt(i)!='T'&&inputString.charAt(i)!='A')
			{
				System.out.println("Invalid Input");
				System.exit(0);
			}
			else
			{
				if(inputString.charAt(i) == 'G')
					add = 'C';
				if(inputString.charAt(i) == 'C')
					add = 'G';
				if(inputString.charAt(i) == 'T')
					add = 'A';
				if(inputString.charAt(i) == 'A')
					add = 'U';
				outputString = outputString+add;
			}
		}
		System.out.println(outputString);
	}
}