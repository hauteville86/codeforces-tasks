// http://codeforces.com/problemset/problem/34/B
import java.util.Scanner;
import java.util.Arrays;

public class Sale
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		int tvSetsOnSale = scan.nextInt();
		int tvBobCanCarry = scan.nextInt();
		int prices[] = new int[tvSetsOnSale];
		for(int i = 0; i < tvSetsOnSale; i++)
		{
			prices[i] = scan.nextInt();
		}
		scan.close();
		Arrays.sort(prices);
		int finalPrice = 0;
		for(int i = 0; i < tvBobCanCarry; i++)
		{
			if(prices[i] < 0)
			{
				finalPrice = finalPrice + prices[i];
			}
			else
			{
				i = tvBobCanCarry;
			}	
		}
		System.out.println(finalPrice * (-1));
	}
}
