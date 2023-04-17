
public class Player {
	String playerName;
	int backNumber;
	String position;
	String phoneNumber;
	
	public Player() {
	}
	
	public Player(String playerName, int backNumber) {
		this.playerName=playerName;
		this.backNumber=backNumber;
	}
	
	public Player(String playerName, int backNumber, String position, String phoneNumber) {
		this.playerName=playerName;
		this.backNumber=backNumber;
		this.position=position;
		this.phoneNumber=phoneNumber;
	}
	
	public void printInfo() {
		System.out.println("Name:"+playerName+" BackNumber:"+backNumber+" Position:"+position+" PhoneNumber:"+phoneNumber);
	}

}
