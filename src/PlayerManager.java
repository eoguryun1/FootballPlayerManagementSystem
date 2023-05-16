
import java.util.ArrayList;
import java.util.Scanner;

import player.CaptainPlayer;
import player.NormalPlayer;
import player.Player;
import player.PlayerInput;
import player.PlayerKind;

public class PlayerManager {
	ArrayList<PlayerInput> players=new ArrayList<PlayerInput>();

	Scanner input;

	PlayerManager(Scanner input){
		this.input=input;
	}

	public void addPlayer() {
		int kind=0;
		PlayerInput playerInput;
		while(kind !=1 && kind !=2 ) {
			System.out.print("1.for Normal ");
			System.out.print("2.for Captain ");
			System.out.print("Select Num For Player Kind Between 1, 2 :");
			kind=input.nextInt();
			if(kind==1) {
				playerInput=new NormalPlayer(PlayerKind.Normal);
				playerInput.getPlayerInput(input);
				players.add(playerInput);
				break;
			}
			else if(kind==2) {
				playerInput=new CaptainPlayer(PlayerKind.Captain);
				playerInput.getPlayerInput(input);
				players.add(playerInput);
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
			PlayerInput playerInput=players.get(i);
			if(playerInput.getPlayerName().equals(playerName)) {
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
						playerInput.setPlayerName(playerName1);
					}
					else if(num==2) {
						System.out.println("Player BackNumber");
						int backNumber=input.nextInt();
						playerInput.setBackNumber(backNumber);
					}
					else if(num==3) {
						System.out.println("Player position:");
						String position=input.next();
						playerInput.setPosition(position);
					}
					else if(num==4) {
						System.out.println("Player PhoneNumber:");
						String phoneNumber=input.next();
						playerInput.setPhoneNumber(phoneNumber);
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
