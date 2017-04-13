/**
 * My solution of http://codeforces.com/problemset/problem/659/D
 */
import java.util.Scanner;

public class BicycleRace {

	public static void main(String[] args)
	{
		int dangerousTurns = 0;
		Scanner scanner = new Scanner(System.in);
		int numberOfStraightSections = scanner.nextInt();
		int oldX = scanner.nextInt();
		int oldY = scanner.nextInt();
		int oldDirection = 0;
		for(int i = 0; i < numberOfStraightSections; i++)
		{
			int newX = scanner.nextInt();
			int newY = scanner.nextInt();
			int newDirection = getNewDirection(oldX, oldY, newX, newY);
			if(isTurnDangerous(oldDirection, newDirection))
			{
				dangerousTurns++;
			}
			oldX = newX;
			oldY = newY;
			oldDirection = newDirection;
		}
		scanner.close();
		System.out.println(dangerousTurns);
	}
	
	private static int getNewDirection(int oldX, int oldY, int newX, int newY)
	{
		if(oldY == newY)
		{
			if(oldX < newX)
			{
				return 2; //EAST
			}
			return 4; //WEST
		}
		if(oldY < newY)
		{
			return 1; //NORTH
		}
		return 3;		
	}
	
	private static boolean isTurnDangerous(int oldDirection, int newDirection)
	{
		if(oldDirection != 4)
		{
			return (newDirection - oldDirection != 1);
		}
		if(newDirection != 1)
		{
			return true;
		}
		return false;
	}	
}
