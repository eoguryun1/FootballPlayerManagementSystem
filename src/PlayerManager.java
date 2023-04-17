import java.util.ArrayList;
import java.util.Scanner;

public class PlayerManager {
	ArrayList<Player> players=new ArrayList<Player>();

	Scanner input;

	PlayerManager(Scanner input){
		this.input=input;
	}

	public void addPlayer() {
		Player player=new Player();
		System.out.print("Player Name:");
		player.playerName=input.next();
		System.out.print("Player Back Number:");
		player.backNumber=input.nextInt();
		System.out.print("Position:");
		player.position=input.next();
		System.out.print("Phone Number:");
		player.phoneNumber=input.next();
		players.add(player);
	}

	public void deletePlayer() {
		System.out.println("Player Name:");
		String playerName=input.next();
		int index=-1; 
		for(int i=0; i<players.size(); i++) {
			if(players.get(i).playerName.equals(playerName)) {
				index=i;
				break;
			}
		}
		if(index>0) {
			players.remove(index);
			System.out.println("The player"+ playerName +"is deleted");
		}
		else {
			System.out.println("The player has not been registered");
			return;
		}
	}
	public void editPlayer() {
		System.out.println("Player Name:");
		String playerName=input.next();
		for(int i=0; i<players.size(); i++) {
			Player player=players.get(i);
			if(player.playerName.equals(playerName)) {
				int num=-1;
				while (num!=5) {
					System.out.println("--Player Info Edit Menu");
					System.out.println("1. Edit Name:");
					System.out.println("2. Edit BackNumber:");
					System.out.println("3. Edit Position:");
					System.out.println("4. Edit PhoneNumber:");
					System.out.println("5. Exit");
					System.out.println("Select one number between 1-5");
					num=input.nextInt();
					if (num==1) {
						System.out.println("Player Name");
						player.playerName=input.next();
					}
					else if(num==2) {
						System.out.println("Player BackNumber");
						player.backNumber=input.nextInt();
					}
					else if(num==3) {
						System.out.println("Player position:");
						player.position=input.next();
					}
					else if(num==4) {
						System.out.println("Player PhoneNumber:");
						player.phoneNumber=input.next();
					}
					else {
						continue;
					}
				}
				break;
			}
		}
	}

	public void viewPlayers() {
		//		System.out.println("Player Name:");
		//		String playerName=input.next();
		for(int i=0; i<players.size(); i++) {
			players.get(i).printInfo();
		}
	}
}
