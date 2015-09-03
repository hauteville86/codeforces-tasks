// http://codeforces.com/problemset/problem/277/A

import java.util.Scanner;

public class LearningLanguages
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		int numOfEmployees = scan.nextInt();
		numOfLanguages = scan.nextInt();
		linksBetween = new Employees(numOfEmployees);
		company = new Employee[numOfEmployees];
		int numOfEmployeesWithoutLanguage = 0;
		boolean areEmployeesWithLanguage = false;
		System.out.println("");//just for the console
		for(int i = 0; i < numOfEmployees; i++)
		{
			int numOfLanguagesKnown = scan.nextInt();
			if(numOfLanguagesKnown > 0)
			{
				areEmployeesWithLanguage = true;
				//note that the input is in 1-format that should be translated ASAP - done
				boolean[] languagesKnown = new boolean[numOfLanguages];
				for(int j = 0; j < numOfLanguages; j++)
				{
					languagesKnown[j] = false;
				}
				for(int j = 0; j < numOfLanguagesKnown; j++)
				{
					int languageKnown = scan.nextInt() - 1;
					languagesKnown[languageKnown] = true;
				}
				company[i] = new Employee(numOfLanguages, languagesKnown);
				for(int k = i - 1; k >= 0; k--)
				{
					connect(i, k);
				}
			}
			else
			{
				company[i] = new Employee(numOfLanguages);
				numOfEmployeesWithoutLanguage++;
			}
		}
		
		int counterOfUniqueRoots = 0;
		for (int i = 0; i < numOfEmployees; i++)
		{
			if(linksBetween.root(i) == i)
			{
				counterOfUniqueRoots++;
			}
		}
		if(numOfEmployeesWithoutLanguage > 1 && !areEmployeesWithLanguage)
		{
			counterOfUniqueRoots++;
		}
		System.out.println(counterOfUniqueRoots - 1);
	}
	
	//Check whether two employees can get with each other and connect them if true
	public static void connect(int one, int two)
	{
		if(!linksBetween.connected(one, two))
		// if both employees are connected no checking or union required
		{
			for(int i = 0; i < numOfLanguages; i++)
			{
				if(company[one].languages[i] && company[two].languages[i])
				{
					linksBetween.union(one, two);
					i = numOfLanguages;
				}
			}
		}
	}
	
	private static int numOfLanguages;
	private static Employees linksBetween;
	private static Employee[] company;
}

/***********************************
* QuickUnionUF-class
**************************************/
class Employees
{
	private int[] id;
	
	public Employees(int N)
	{
		id = new int[N];
		for(int i = 0; i < N; i++)
		{
			id[i] = i;
		}
	}
	
	public int root(int i)
	{
		while(i != id[i])
		{
			i = id[i];
		}
		return i;
	}
	
	public boolean connected(int p, int q)
	{
		return root(p) == root(q);
	}
	
	public void union(int p, int q)
	{
		int i = root(p);
		int j = root(q);
		id[i] = j;
	}
}

/**********************************
* Single Employee class
*************************************/
class Employee
{
	public boolean[] languages; //true if known, otherwise false
	
	public Employee(int globalNumOfLanguages, boolean[] languagesKnown)
	{
		languages = languagesKnown;
	}
	
	public Employee(int globalNumOfLanguages) //employee that doesn't know any language
	{
		languages = new boolean[globalNumOfLanguages];
		for(int i = 0; i < globalNumOfLanguages; i++)
		{
			languages[i] = false;
		}
	}
}
