import java.util.Random;
import java.util.Scanner;

class Rock_Paper_Scissors
{
	public static void main(String[] Suvendu)
	{
		Scanner input = new Scanner(System.in);
		// System.out.println("Rock, Paper Scissors");
		
		Random rand = new Random();
		// System.out.println(rand.nextInt(3));//0-2 number return 
		
		// int num= rand.nextInt(3);
		// System.out.println("Hello : "+num);
		int i=0;
		int My=0;
		int comp=0;
		while(true)
		{
			int num= rand.nextInt(3);
			
			System.out.println("Choice any one : { Rock = 1 | Paper = 2 | Scissors = 3 }");
			System.out.printf("Enter number (%d) : ",++i);
			int choice=input.nextInt();
			
			if((choice-1) == 0)//Rock 
			{
				if(num==0)
				{
					System.out.println("Computer choice :) = Rock");
				}
				else if(num == 1)
				{
					System.out.println("Computer choice :) = Paper");
					comp++;
				}
				else if(num == 2)
				{
					System.out.println("Computer choice :) = Scissors");
					My++;
				}
				
				System.out.println("Your choice is = Rock ");
			}
			else if((choice-1) == 1)// Paper
			{
				if(num==0)
				{
					System.out.println("Computer choice :) = Rock");
					My++;
				}
				else if(num == 1)
				{
					System.out.println("Computer choice :) = Paper");
				}
				else if(num == 2)
				{
					System.out.println("Computer choice :) = Scissors");
					comp++;
				}
				
				System.out.println("Your choice is = Paper ");
			}
			else if((choice-1) == 2)// Scissors
			{
				if(num==0)
				{
					System.out.println("Computer choice :) = Rock");
					comp++;
				}
				else if(num == 1)
				{
					System.out.println("Computer choice :) = Paper");
					My++;
				}
				else if(num == 2)
				{
					System.out.println("Computer choice :) = Scissors");
				}
				
				System.out.println("Your choice is = Scissors ");
			}
			
			System.out.println("Your Point : "+My+" Computer point : "+comp+"\n");
			for(int j=0;j<30;j++)
				System.out.print("-");
			System.out.println("\n\n");
			
			if(i==10)
				break;
			
		}
		
		if(My>comp)
		{
			System.out.println("Congratulations you win this match :)  "+My);
		}
		else if(My<comp)
		{
			System.out.println("You defeat :( | Computer win this match : "+comp);
		}
		else 
		{
			System.out.println("Tie :( | Your point = "+My+" | Computer point is = "+comp);
		}
		
	}
}