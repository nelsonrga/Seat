// Exercise 7.29 Seat Scheduling
import java.util.Scanner;
public class Seat
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		boolean[] seats = {false,false,false,false,false,
						   false, false, false, false, false};
		boolean planeFull = false;
		boolean economyFull = false;
		boolean firstFull = false;
		boolean firstFound = false;
		boolean economyFound = false;
		int seatChosen = 0;
		int userClassSelection;


		while(planeFull == false)
		{
			System.out.println("Enter 1 for 1st Aisle, 2 for 2nd Aisle");
			userClassSelection = input.nextInt();
			int seatNum;
			if(userClassSelection == 1)
			{
				for(seatNum = 0; seatNum <= 4; seatNum++)
				{
					if(seats[seatNum] == false)
					{
						seats[seatNum] = true;
						firstFound = true;
						break;
					}
				}
				if(firstFound == true)
				{
					System.out.println("Seat number" + seatNum);
					firstFound = false;
				}
				else
				{
					System.out.println("No first class. Enter 2 for economy");
					userClassSelection = input.nextInt();
					if(userClassSelection != 2)
					planeFull = true;
					firstFull = true;
				}
		}
			else
			{//economy
			for(seatNum = 5; seatNum <= 9; seatNum++)
							{
								if(seats[seatNum] == false)
								{
									seats[seatNum] = true;
									economyFound = true;
									break;
								}
							}
								if(economyFound == true)
							{
								System.out.println("Seat number" + seatNum);
								economyFound = false;
							}
							else
							{
								System.out.println("No economy class. Enter 2 for first");
								userClassSelection = input.nextInt();
								if(userClassSelection != 2)
								planeFull = true;
								economyFull = true;
							}
			}
			if(economyFull == true && firstFull == true)
			{
				System.out.println("Plane is full");
				planeFull = true;
			}


		} // outer while loop
		System.out.println("Next plane in 3 hours");
	}// end main
}