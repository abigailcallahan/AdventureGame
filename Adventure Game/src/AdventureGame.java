import java.util.Scanner;

public class AdventureGame
	{

		public static void main(String[] args)
			{
			Scanner input = new Scanner(System.in);
			System.out.println("Welcome to the adventure game! You are walking on a forest path and come across two bridges");
			System.out.println("(1) The bridge on the right is dark and stormy but a smooth road");
			System.out.println("(2) The bridge on the left is bright and sunny but there is rocks and bricks all over the road");
			System.out.println("Which bridge are you choosing? Type 1 for the right and 2 for the left");
			
			int choice = input.nextInt();
			if(choice == 1)
				{
					System.out.println("Good decision! The path is rough but you will get through and stay alive");
					System.out.println("Now there is two doors in the forest which do you choose?");
					System.out.println("(1) the blue door");
					System.out.println("(2) the black door");
					int choice2 = input.nextInt();
					if(choice2 == 1) 
						{
							System.out.println("You die");
						}
					else if(choice2 == 2)
						{
							System.out.println("You win!");
						}
					
				}
			else if(choice == 2)
				{
					System.out.println("Wrong decision....this is a hard hard path. But you get one more chance to survive");
					System.out.println("pick between these two doors");
					System.out.println("(1) purple door");
					System.out.println("(2) yellow door");
					int choice3 = input.nextInt();
					if(choice3 == 1)
						{
							System.out.println("You survive! congrats!");
						}
					else if(choice3 == 2)
						{
							System.out.println("Oops, you die and lose");
						}
				}
			else
				{
					System.out.println("I don't think you entered a 1 or 2 so try again...good luck!");
				}
			}

	}
