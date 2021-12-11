package workshop;
import java.util.*;
import  java.util.Random;

public class GamblerUC2
{
	
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
	        if (random==0) 
	        {
	            stake--;
	            System.out.print("The stake is :"+stake);  

	        } else if (random==1){
	            stake++;
	         System.out.print("Thestake is :"+stake);  

	        }
	    }
}
