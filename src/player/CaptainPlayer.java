package player;

import java.util.Scanner;

public class CaptainPlayer extends Player implements PlayerInput {

	public CaptainPlayer(PlayerKind kind) {
		super(kind);
	}
	protected String HousePhoneNumber;

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
				System.out.println("HousePhoneNumber: ");
				String HousephoneNumber=input.next();
				HousePhoneNumber=HousephoneNumber;
				break;
			}
			else {

			}

		}		

	}
	public void printInfo() {
		String skind=getKindString();
		System.out.println("kind:"+skind+"Name:"+playerName+" BackNumber:"+backNumber+" Position:"+position+" PhoneNumber:"+phoneNumber+"HousePhoneNumber: "+HousePhoneNumber);
	}

	public String getKindString() {
		String skind="none";
		switch(this.kind) {
		case Normal:
			skind="일반선수";
			break;
		case Captain:
			skind="주장";
		default:
		}
		return skind;
	}
}

