package player;

import java.util.Scanner;

public class Player {

	protected PlayerKind kind= PlayerKind.Normal;  
	protected String playerName;
	protected int backNumber;
	protected String position;
	protected String phoneNumber;
	
	public Player() {
		
	}
	
	public Player(PlayerKind kind) {
		this.kind=kind;
	}
	
	public Player(String playerName, int backNumber) {
		this.playerName=playerName;
		this.backNumber=backNumber;
	}
	
	public Player(PlayerKind kind,String playerName, int backNumber, String position, String phoneNumber) {
		this.kind=kind;
		this.playerName=playerName;
		this.backNumber=backNumber;
		this.position=position;
		this.phoneNumber=phoneNumber;
	}
	
	public PlayerKind getKind() {
		return kind;
	}

	public void setKind(PlayerKind kind) {
		this.kind = kind;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public int getBackNumber() {
		return backNumber;
	}

	public void setBackNumber(int backNumber) {
		this.backNumber = backNumber;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public void printInfo() {
		String skind="none";
		switch(this.kind) {
		case Normal:
			skind="일반선수";
			break;
		case Captain:
			skind="주장";
			default:
		}
		System.out.println("kind:"+skind+"Name:"+playerName+" BackNumber:"+backNumber+" Position:"+position+" PhoneNumber:"+phoneNumber);
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
		
		System.out.print("Phone Number:");
		String phoneNumber=input.next();
		this.setPhoneNumber(phoneNumber);
	}

}
