// http://codeforces.com/problemset/problem/260/A
import java.util.Scanner;

public class AddingDIgits
{
    public static void main(String[] args)
    {
	initializeData();
	scanner.close();
	System.out.println(findSumOfDigits(a));
    }

    private static void initializeData()
    {
	scanner = new Scanner(System.in);
	getDataFromInput();
	addedDigits = 0;
    }

    private static void getDataFromInput()
    {
	a = scanner.nextInt();
	b = scanner.nextInt();
	n = scanner.nextInt();
    }
    
    private static String findSumOfDigits(int base)
    {
	String sumOfDigits = findNumberDividedByb(base);
        if(sumOfDigits.equals("-1")){
	    return "-1";	   
	}
	if(addedDigits == n){
	    return sumOfDigits;
	}
        return addZerosToNumber(sumOfDigits);	
    }

    private static String findNumberDividedByb(int sum){
	for(int i = 0; i < 10; i++){
	    int sumWithAdditionalDigit = sum*10+i;
	    if(sumWithAdditionalDigit % b == 0){
		addedDigits++;
		return Integer.toString(sumWithAdditionalDigit);
	    }
	}
	return "-1";
    }

    private static String addZerosToNumber(String number)
    {
	String zeros = "0";
	int zerosNeeded = n-1;
	for(addedDigits = 1; addedDigits < zerosNeeded/2; addedDigits = addedDigits*2){
	    zeros = zeros + zeros;
	}
        for(addedDigits = addedDigits; addedDigits < zerosNeeded-10; addedDigits = addedDigits + 10){
	    zeros = zeros + TEN_ZEROS;
	}
	for(addedDigits = addedDigits; addedDigits < zerosNeeded; addedDigits++){
	    zeros = zeros + "0";
	}
	return number.concat(zeros);
    }
    
    private static Scanner scanner;
    private static int a;
    private static int b;
    private static int n;
    private static int addedDigits;
    private final static String TEN_ZEROS = "0000000000";
}
