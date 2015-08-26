//http://codeforces.com/problemset/problem/263/B
import java.util.Scanner;
import java.util.Arrays;

public class Squares {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		if (n >= k)
		{
			int[] coordinates = new int[n];
			for (int i = 0; i < n; i++)
			{
				coordinates[i] = scanner.nextInt();
			}
			scanner.close();
			Arrays.sort(coordinates);
			int x = 0;
			int y = coordinates[n-k];
			System.out.println(x + " " + y); 
		}
		else
		{
			System.out.println("-1");
		}
	}
}
