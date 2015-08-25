// http://codeforces.com/problemset/problem/431/B

import java.util.Scanner;

public class ShowerLine {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		coeffs = new int[5][5];
		for(int i = 0; i < 5; i++)
		{
			for (int j = 0; j < 5; j++)
			{
				coeffs[i][j] = scan.nextInt();
			}
		}
		scan.close();
		int[] studsInQueue = new int[5];
		int maxCoefficient = 0;
		int sumCoefficient = 0;
		for (int i = 0; i < 5; i++)
		{
			for (int j = 0; j < 5; j++)
			{
				if (i != j)
				{
					for (int k = 0; k < 5; k++)
					{
						if (k != i && k != j)
						{
							for (int l = 0; l < 5; l++)
							{
								if (l != i && l != j && l != k)
								{
									for (int m = 0; m < 5; m++)
									{
										if (m != i && m != j && m != k && m != l)
										{
											sumCoefficient = coeff(i, j, k, l, m);
											if (sumCoefficient > maxCoefficient)
											{
												maxCoefficient = sumCoefficient;
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		System.out.println(maxCoefficient);
	}
	
	public static int coeff(int i, int j, int k, int l, int m)
	{
		return 2*(coeffs[l][m] + coeffs[m][l] + coeffs[k][l] + coeffs[l][k])+
				coeffs[i][j] + coeffs[j][i] + coeffs[j][k] + coeffs[k][j];
	}
	
	private static int coeffs[][];
}
