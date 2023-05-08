package player;

import java.util.Scanner;

public class NormalPlayer extends Player {
	
	public NormalPlayer(PlayerKind kind) {
		this.kind=kind;
	}
	
	public void getPlayerInput(Scanner input) {
		System.out.print("Player Name:");
		String playerName=input.next();
		this.setPlayerName(playerName);

		System.out.print("Player Back Number:");
		int backNumber=input.nextInt();
		this.setBackNumber(backNumber);

		System.out.print("Position:");
		String position=input.next();
		this.setPosition(position);

		char answer='x';
		while (answer != 'y'&& answer !='Y' && answer!='n' && answer!= 'N') 
		{	
			System.out.println("Do you have a phone? (Y/N)");
			answer =input.next().charAt(0);
			if(answer == 'y' || answer =='Y') {
				System.out.print("Phone Number:");
				String phoneNumber=input.next();
				this.setPhoneNumber(phoneNumber); 
				break;
			}
			else if(answer == 'n' || answer =='N') {
				this.setPhoneNumber(""); 
				break;
			}
			else {

			}
		}		

	}

}


