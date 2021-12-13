package workshop;

import java.util.Random;
import java.util.Scanner;

public class GamblerUC7 {
	
	public static void main(String[] args)
    {
        Scanner scan =new Scanner(System.in); 
        int num;
        System.out.print("Enter the stake  : ");  
        num =scan.nextInt(); 
        int stake  = num;
        int fixed_val = num;
        int bet;
        System.out.print("Enter the bet: ");  
        bet=scan.nextInt();
        int bets = bet;
        
        int range = 2;
        Random rand = new Random();
        
        System.out.print("Enter the month: ");  
        int mon =scan.nextInt();
        
        int stop1 = 20;
        int stop2 = 0;
        
        for (int i = 1; i <=mon; i++) { 
        while (stop1>=stop2) 
        {
        	int random = rand.nextInt(range);
        if (random==0) 
        {
            stake--;  

        } else if (random==1)
        {
            stake++;
        }
        stop1--;
        }
          
        System.out.print("\n stake value is :"+stake);
        stop1 += 30;
	
	if (stake>fixed_val) 
	{

        System.out.print("\nYou won!.....Would like to continue playing next month press 0 or 1 (0 is NO and 1 is YES)  ");  
        int next_month=scan.nextInt();

        if(next_month==1) {
            continue;
        }else 
         System.out.print("\nThank you.......Game over");  
        	break;

	}else 
        System.out.print("\nYou lost ...........Game over");  
			break;
        }
    }
}

