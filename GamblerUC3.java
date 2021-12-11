package workshop;

import java.util.Random;
import java.util.Scanner;

public class GamblerUC3 {
	
	 public static void main(String[] args)
	    {
	        Scanner scan =new Scanner(System.in); 
	        int num;
	        System.out.print("Enter the stak  : ");  
	        num =scan.nextInt(); 
	        int stake  = num;
	        
	        int bet;
	        System.out.print("Enter the bet: ");  
	        bet=scan.nextInt();
	        int bets = bet;
	        
	        int range = 2;
	        Random rand = new Random();
	        int random = rand.nextInt(range);
	        
	        int stop1=stake/2 + stake;
	        int stop2 =stake/2;

	        while ((stop1>stake) && (stake>stop2)) 
	        {
	        if (random==0) 
	        {
	            stake--;  

	        } else if (random==1)
	        {
	            stake++;

	        }
	       }
	        
	        if (stop1>=stake) 
	        {
	            System.out.print("The stake value is :"+stake); 
	            
	        } else if (stake>=stop2)
	        {
	            System.out.print("The  stake value  is :"+stake);
	        }
	    }
}
