
import java.util.ArrayList;
import java.util.Scanner;

import player.CaptainPlayer;
import player.Player;
import player.PlayerKind;

public class PlayerManager {
	ArrayList<Player> players=new ArrayList<Player>();

	Scanner input;

	PlayerManager(Scanner input){
		this.input=input;
	}

	public void addPlayer() {
		int kind=0;
		Player player;
		while(kind !=1 && kind !=2 ) {
			System.out.print("1.for Normal ");
			System.out.print("2.for Captain ");
			System.out.print("Select Num For Player Kind Between 1, 2 :");
			kind=input.nextInt();
			if(kind==1) {
				player=new Player(PlayerKind.Normal);
				player.getPlayerInput(input);
				players.add(player);
				break;
			}
			else if(kind==2) {
				player=new CaptainPlayer(PlayerKind.Captain);
				player.getPlayerInput(input);
				players.add(player);
				break;
			}
			else {
				System.out.print("Select Num For Player Kind Between 1, 2 :");
			}
		}
	}

	public void deletePlayer() {
		System.out.println("Player Name:");
		String playerName=input.next();
		int index=-1; 
		for(int i=0; i<players.size(); i++) {
			if(players.get(i).getPlayerName().equals(playerName)) {
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
			if(player.getPlayerName().equals(playerName)) {
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
						String playerName1=input.next();
						player.setPlayerName(playerName1);
					}
					else if(num==2) {
						System.out.println("Player BackNumber");
						int backNumber=input.nextInt();
						player.setBackNumber(backNumber);
					}
					else if(num==3) {
						System.out.println("Player position:");
						String position=input.next();
						player.setPosition(position);
					}
					else if(num==4) {
						System.out.println("Player PhoneNumber:");
						String phoneNumber=input.next();
						player.setPhoneNumber(phoneNumber);
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
