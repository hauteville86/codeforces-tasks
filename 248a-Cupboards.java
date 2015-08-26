// http://codeforces.com/problemset/problem/248/A
import java.util.Scanner;

public class Cupboards {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numOfCupboards = scan.nextInt();
		int leftOpened = 0;
		int rightOpened = 0;
		for (int i = 0; i < numOfCupboards; i++)
		{
			int left = scan.nextInt();
			if (left == 1)
			{
				leftOpened++;
			}
			int right = scan.nextInt();
			if (right == 1)
			{
				rightOpened++;
			}
		}
		scan.close();
		int numOfOpsNeeded;
		if (leftOpened > numOfCupboards/2)
		{
			numOfOpsNeeded = numOfCupboards - leftOpened;
		}
		else
		{
			numOfOpsNeeded = leftOpened;
		}
		if (rightOpened > numOfCupboards/2)
		{
			numOfOpsNeeded = numOfOpsNeeded + numOfCupboards - rightOpened;
		}
		else
		{
			numOfOpsNeeded = numOfOpsNeeded + rightOpened;
		}
		System.out.println(numOfOpsNeeded);
	}
}
