// http://codeforces.com/problemset/problem/137/B
import java.util.Scanner;

public class Permutation
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		int howManyNumsInSequence = scan.nextInt();
		boolean numsThatAreAtLeastOnce[] = new boolean[howManyNumsInSequence];
		for(int i = 0; i < howManyNumsInSequence; i++)
		{
			numsThatAreAtLeastOnce[i] = false;
		}
		int counter = 0;
		for(int i = 0; i < howManyNumsInSequence; i++)
		{
			int num = scan.nextInt()-1; // note that the input is in +1 format
			if(!numsThatAreAtLeastOnce[num])
			{
				numsThatAreAtLeastOnce[num] = true;
			}
			else
			{
				counter++;
			}
		}
		scan.close();
		System.out.println(counter);
	}
}
