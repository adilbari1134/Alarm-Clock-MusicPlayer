

/*  set time to 7:59:54 */


import java.util.Scanner;
import java.io.IOException;
public class ClockMain
{
	public static void main(String args[]) throws Exception
	{
		int hour, mint, sec;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter value for hour : ");
		hour=s.nextInt();
		System.out.print("Enter value for Mintues : ");
		mint=s.nextInt();
		System.out.print("Enter value for Second : ");
		sec=s.nextInt();

		ClockB c = new ClockB(hour, mint, sec);
		int i=0;
		c.setAlarm(8,0);
		do{
			c.ClockDisplay();
			c.tick();
			i++;

            Thread.sleep(1000);
		  	cls();
			 
		}while(i<=50);
		
		
		
	}
	public static void cls()
	{
		try
		{
			new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}


}