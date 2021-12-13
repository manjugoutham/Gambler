package workshop;

import java.util.Random;
import java.util.Scanner;

public class GamblerUC6 {
	
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
        int prft = 0;
        int lose =0;
        
        Random rand = new Random();
        
        int stop1 = 30;
        int stop2 = 0;
        
        int luck=0;
        int unluck=-0;
       
        System.out.print("Enter the month: ");  
        int mon =scan.nextInt();
        
        for(int i = 1;i<=mon;i++)
        {
        while (stop1>stop2) 
        {
        int random = rand.nextInt(range);
        if (random==0) 
        {
            stake--;
            lose--;

        } else if (random==1)
        {
            stake++;
            prft++;
        }
        stop1--;
        }
       
        stop1 += 30;
        luck =0;
        unluck =0;
        System.out.print("\n profit value is :"+prft);
        System.out.print("\n lose value is :"+lose);
        System.out.print("\n the stake value is :"+stake);
        
        
        if (prft>luck) {
            luck = prft;
        }
        else if(lose<unluck){
            unluck = lose;
        } 
        }
        
        System.out.print("\n The luckiest day value is :"+luck); 
        System.out.print(" ");  
        System.out.print("\n The unluckiest day value is :"+unluck); 
    } 

}
