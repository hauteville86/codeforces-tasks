import java.lang.Math;

public class Karol
{
    public Karol()
    {
    }

    public static String createMonocharString(char c, int length)
    {
	if(length == 0){
	    return "";
	}
	String oneCharAsString = Character.toString(c);
	String monString = oneCharAsString;
	if(length == 1){
	    return monString;
	}
	int lengthOfString;
	for(lengthOfString = 1; lengthOfString <= length/2; lengthOfString = lengthOfString*2){
	    monString = monString + monString;
	}
	if(lengthOfString % length == 0){
	    return monString;
	}
	for(lengthOfString = lengthOfString; lengthOfString <= length; lengthOfString = lengthOfString+100){
	    monString = monString + oneCharAsString;
	}
	return monString;
    }

    private static final double TWO = 2.0;	   
}
