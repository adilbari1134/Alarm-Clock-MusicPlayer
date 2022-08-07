public class DigitB
{
private int value, limit;

public DigitB(int value, int limit)
{
	this.value=value;
	this.limit=limit;
}
public void setValue(int value)
{
	this.value=value;
}


public int  getValue()
{
	return(value);
}
public void increment()
{
	value=(value+1)%limit;
}
public String display()
{
	if(value<10)
		return("0"+value);
	else 
		return(""+value);
}

}