package cardGame;

import java.util.Scanner;

import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		Boolean game = true;
		ArrayList<Monster> dungeon = new ArrayList<Monster>();
		Monster Skeleton = new Monster("Skeleton", 2);
		Monster Goblin = new Monster("Goblin", 5);
		Monster Whitch = new Monster("Whitch", 8);
		Monster Dragon = new Monster("Dragon", 10);
		player playerOne = new player();
		int damage = 0;

		playerOne.SetPlayerHelth(40);
//		System.out.println("there are "+dungeon.size()+" Do you want more?");

		while (playerOne.getPlayerHelth() > 0 && game == true) {
			int randomNum = (int) (Math.random() * 10);
			if (randomNum == 9) {
				Dragon.SetMonsterStrength(10);
				dungeon.add(Dragon);
			}
			if (randomNum >= 7 & randomNum <= 8) {
				Whitch.SetMonsterStrength(8);
				dungeon.add(Whitch);
			}
			if (randomNum >= 4 & randomNum <= 6) {
				Goblin.SetMonsterStrength(5);
				dungeon.add(Goblin);

			}
			if (randomNum >= 0 & randomNum <= 3) {
				Skeleton.SetMonsterStrength(2);
				dungeon.add(Skeleton);

			}
			int currentHealth = playerOne.getPlayerHelth();
			System.out.print("Current Player Health: " + currentHealth + "\n");
			Scanner myObj = new Scanner(System.in); // Create a Scanner object
			System.out.println("there are " + dungeon.size() + " Monster in the dungeon do you want more? (y for more) (n to enter the dungeon) then enter ");
			String newMon = myObj.nextLine(); // Read user input

			if (newMon.contains("n")) {
				System.out.println("there is  " + dungeon.size() + " monster in the dungeon good luck!"+"\n");
				

				

				for (Monster monster : dungeon) {
					System.out.println(monster);
					damage= damage +monster.GetMonsterStrength();
					
				}
				if (damage>currentHealth) {
					System.out.print("you have take: "+damage +"of damage and have die ");
				}
				else{ System.out.print("you have take: "+damage +" of damage and have got out of the dungeon with "+damage+ " Points");
				}
				System.out.println("do you want to play again? pleases press n to stop. anything else to play again ");
				String newMon2 = myObj.nextLine();
				if (newMon2.contains("n")) {
				game = false;}
				else {
					dungeon.clear();
					damage=0;
					System.out.flush();
					
				}
			}
 
		}

	}

}
