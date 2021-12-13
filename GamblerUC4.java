package workshop;
import java.util.*;

public class GamblerUC4
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
        
        int stop1 = 20;
        int stop2 = 0;

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
          
        System.out.print("\n After 20 days stake value is :"+stake);
        
	
    } 
}

