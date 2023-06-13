
import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import player.CaptainPlayer;
import player.NormalPlayer;
import player.PlayerInput;
import player.PlayerKind;

public class PlayerManager implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4406017516062973662L;
	
	ArrayList<PlayerInput> players=new ArrayList<PlayerInput>();

	transient Scanner input;

	PlayerManager(Scanner input){
		this.input=input;
	}

	public void addPlayer() {
		int kind=0;
		PlayerInput playerInput;
		while(kind <1 || kind >2 ) {
			try {
				System.out.println("go into add Player menu in while");
				System.out.println("1.for Normal ");
				System.out.println("2.for Captain ");
				System.out.println("Select Num For Player Kind Between 1, 2 :");
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
			catch(InputMismatchException e) {
				System.out.println("Please out an integer between 1-2!");
				if(input.hasNext()) {
					input.next();
				}
				kind=-1;
			}
		}
	}

	public void deletePlayer() {
		System.out.println("Player Name:");
		String playerName=input.next();
		int index=findIndex(playerName);
		removefromPlayers(index,playerName);

	}
	
	public int findIndex(String playerName) {
		int index=-1; 
		for(int i=0; i<players.size(); i++) {
			if(players.get(i).getPlayerName().equals(playerName)) {
				index=i;
				break;
			}
		}
		return index;
	}
	
	public int removefromPlayers(int index, String playerName) {
		if(index>0) {
			players.remove(index);
			System.out.println("The player"+ playerName +"is deleted");
			return 1;
		}
		else {
			System.out.println("The player has not been registered");
			return -1;
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
					showEditMenu();
					num=input.nextInt();
					switch(num) {
					case 1:
						setPlayerName(playerInput, input);
						break;
					case 2:
						setPlayerBackNumber(playerInput,input);
						break;
					case 3:
						setPlayerPosition(playerInput, input);
						break;
					case 4:
						setPlayerPhoneNumber(playerInput,input);
						break;
					default:
						continue;
					}
				}
			}
		}
	}

	public void viewPlayers() {
		//		System.out.println("Player Name:");
		//		String playerName=input.next();
		System.out.println("# of registered players:"+players.size());
		for(int i=0; i<players.size(); i++) {
			players.get(i).printInfo();
		}
	}

	public void setPlayerName(PlayerInput player, Scanner input) {
		System.out.println("Player Name");
		String playerName1=input.next();
		player.setPlayerName(playerName1);
	}

	public void setPlayerBackNumber(PlayerInput player, Scanner input) {
		System.out.println("Player BackNumber");
		int backNumber=input.nextInt();
		player.setBackNumber(backNumber);
	}

	public void setPlayerPosition(PlayerInput player, Scanner input) {
		System.out.println("Player position:");
		String position=input.next();
		player.setPosition(position);
	}

	public void setPlayerPhoneNumber(PlayerInput player, Scanner input) {
		System.out.println("Player PhoneNumber:");
		String phoneNumber=input.next();
		player.setPhoneNumber(phoneNumber);
	}



	public void showEditMenu() {
		System.out.println("--Player Info Edit Menu");
		System.out.println("1. Edit Name:");
		System.out.println("2. Edit BackNumber:");
		System.out.println("3. Edit Position:");
		System.out.println("4. Edit PhoneNumber:");
		System.out.println("5. Exit");
		System.out.println("Select one number between 1-5");

	}
}
