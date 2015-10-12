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
	interval = setInterval();
	addedDigits = 0;
    }

    private static void getDataFromInput()
    {
	a = scanner.nextInt();
	b = scanner.nextInt();
	n = scanner.nextInt();
    }

    private static int setInterval()
    {
	if(isEven(b)){
	    return 2;
	}
	return 1;
    }
    
    private static int findSumOfDigits(int base)
    {
	int sum = base*10;
	for(int i = 0; i < 10; i = i + interval){
	    int nextLevelNumber = sum + i;
	    if(nextLevelNumber % b == 0){
		addedDigits++;
		if(addedDigits == n){
		    return nextLevelNumber;
		}
		return findSumOfDigits(nextLevelNumber);
	    }
	}
        return -1;
    }
    
    private static boolean isEven(int number)
    {
	return number % 2 == 0;
    }
	
		
    private static Scanner scanner;
    private static int a;
    private static int b;
    private static int n;
    private static int interval;
    private static int addedDigits;
}
// Wrong answer on test 6
/**
Time: 77 ms, memory: 1444 KB
Verdict: WRONG_ANSWER
Input

100000 10 64479

Participant's output

412542910

Jury's answer

1000000000000000000000000000000000000000000000000000000
0000000000000000000000000000000000000000000000000000000000
0000000000000000000000000000000000000000000000000000000
0000000000000000000000000000000000000000000000000000000000
000000000000000000000000000000000000000000000000000000000000
0000000000000000000000000000000000000000000000000000000
00000000000000000000000000000000000000000000000000000
0000000000000000000000000000000000000000000000000000000
00000000000000000000000000000000000000000000000000000000000000...
Checker comment

wrong answer number has wrong length


*/
