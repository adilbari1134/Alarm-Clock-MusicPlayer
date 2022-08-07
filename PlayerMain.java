

/* This will play only track 1 & 2 because audio folder contain two files*/ 


import java.util.*;

public class PlayerMain
{

public static void main(String args[])
{
	
	MusicOrganizer music =new MusicOrganizer(); 
		int choice;
		
		System.out.print("\nThis will play only track 1 & 2 because audio folder contain two files \n");
		
		System.out.print("Music List ");
		System.out.print("\n1) Impact Moderato Tone ");
		System.out.print("\n2) Morning Alarm tone");
		System.out.print("\n3) This is What you came for");
		System.out.print("\n4) BlindLemonJefferson-matchBoxBlues");
		System.out.print("\n5) So many things");
		Scanner sc=new Scanner(System.in);
		System.out.print("\n\nEnter your Choice : ");
		choice=sc.nextInt();
		
	System.out.print("\nPlaying Music..... ");
	
	switch(choice)
	{
		case 1:
		music.playTrack(0);
		break;
		
		case 2:
		music.playTrack(1);
		break;
		
		/* case 3: 
		music.playTrack(4);
		break;
		
		case 4:
		music.playTrack(2);
		break;
		
		case 5 : 
		music.playTrack(7);
		break;*/
		
		default:
		System.out.println("\nMusic Not Found !!");
	}
	
	
}

}