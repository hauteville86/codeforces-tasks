// http://codeforces.com/problemset/problem/131/C
import java.util.Scanner;

public class TheWorldIsATheatre
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		long BOYS_MIN = 4;
		long GIRLS_MIN = 1;
		long boys = scan.nextLong();
		long girls = scan.nextLong();
		long actors = scan.nextLong();
		scan.close();
		long combinations = 0;
		for(long numOfBoysNeeded = BOYS_MIN; numOfBoysNeeded <= boys && numOfBoysNeeded < actors; numOfBoysNeeded++)
		{
			long numOfGirlsNeeded = actors - numOfBoysNeeded;
			if(numOfGirlsNeeded <= girls)
			{
				long boysWithoutJob = boys - numOfBoysNeeded;
				long powFactorBoys;
				if(boysWithoutJob < numOfBoysNeeded)
				{
					powFactorBoys = boysWithoutJob;
				}
				else
				{
					powFactorBoys = numOfBoysNeeded;
				}

				long girlsWithoutJob = girls - numOfGirlsNeeded;
				long powFactorGirls;
				if(girlsWithoutJob < numOfGirlsNeeded)
				{
					powFactorGirls = girlsWithoutJob;
				}
				else
				{
					powFactorGirls = numOfGirlsNeeded;
				}
				powFactorGirls = girls - numOfGirlsNeeded;


				long boysCombinations = 1;
				long divider = 1;
				for(long i = 1; i <= powFactorBoys; i++)
				{
					boysCombinations = boysCombinations * (boys + 1 - i);
					divider = divider * i;
				}
				boysCombinations = boysCombinations / divider;
				
				long girlsCombinations = 1;
				divider = 1;
				for(long i = 1; i <= powFactorGirls; i++)
				{
					girlsCombinations = girlsCombinations * (girls + 1 - i);
					divider = divider * i;
				}
				girlsCombinations = girlsCombinations / divider;
				combinations = combinations + boysCombinations * girlsCombinations;
			}		
		}
		System.out.println(combinations);
	}
}
