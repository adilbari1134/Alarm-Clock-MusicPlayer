import java.io.IOException;
public class ClockB
{
	String time;
	DigitB hour;
	DigitB mintues;
	DigitB second;
	DigitB Alarmhour;
	DigitB Alarmmint;
	DigitB Alarmsec;
	 MusicOrganizer mu=new MusicOrganizer();
	public ClockB(int h, int m, int s )
	{
		hour=new DigitB(h, 24);
		mintues=new DigitB(m, 60);
		second=new DigitB(s, 60);
		
		 Alarmhour=new DigitB(h,24);
        Alarmmint=new DigitB(m,60);
        Alarmsec=new DigitB(s,60);
		time=hour.display()+":"+mintues.display()+":"+second.display();
       
      
	}
	public void setTime(int h, int m, int s)
	{
		hour.setValue(h);
		mintues.setValue(m);
		second.setValue(m);
		time=hour.display()+":"+mintues.display()+":"+second.display();
	}
	
	  public void setAlarm(int h,int m)
    {
        Alarmhour.setValue(h);
        Alarmmint.setValue(m);
        Alarmsec.setValue(00);
    }
	public void tick()
	{
		second.increment();	
		//mintues.increment();
		if(second.getValue()==0){
			mintues.increment();
		if(mintues.getValue()==0)
			hour.increment();
		}
		time=hour.display()+":"+mintues.display()+":"+second.display();
		
		
		
		  if(Alarmhour.getValue()==hour.getValue())
          {
            if(Alarmmint.getValue()==mintues.getValue())
            {
              if(Alarmsec.getValue()==second.getValue())
              {
                  System.out.println(time);
				  
                 mu.playTrack(1);
				 System.out.println("Playing Alarm Tune");
				 
			  } 
			 
			}
          
             
          }
	}
	public void ClockDisplay()
	{
		System.out.println(time);
	}
}