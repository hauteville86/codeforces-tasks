// http://codeforces.com/problemset/problem/137/A
import java.util.Scanner;

public class PostcardsAndPhotos {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char[] input = scan.next().toCharArray();
		scan.close();
		int count = 0;
		boolean c = false;
		boolean p = false;
		int numOfPOrC = 0;
		for (int i = 0; i < input.length; i++)
		{
			if (input[i] == 'C')
			{
				if (!p)
				{
					numOfPOrC++;
				}
				else
				{
					count++;
					numOfPOrC = 1;
					p = false;
				}
				c = true;
			}
			else if (input[i] == 'P')
			{
				if (!c)
				{
					numOfPOrC++;
				}
				else
				{
					count++;
					numOfPOrC = 1;
					c = false;
				}
				p = true;
			}
			if (numOfPOrC == 5)
			{
				count++;
				numOfPOrC = 0;
				c = false;
				p = false;
			}
		}
		if (p || c)
		{
			count++;
		}
		System.out.println(count);
	}
}
