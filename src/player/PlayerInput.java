package player;

import java.util.Scanner;

public interface PlayerInput {
	
	public void getPlayerInput(Scanner input);
	
	public String getPlayerName();
	
	public void setPlayerName(String playerName);
	
	public void setPosition(String position);
	
	public void setBackNumber(int backNumber);
	
	public void setPhoneNumber(String phoneNumber);
	
	public void printInfo();

}
