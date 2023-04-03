
import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		int num=0;
		Scanner input=new Scanner(System.in);

		while(num!=6){	
			System.out.println("--GUFS Player Management System--");
			System.out.println("1. Add player");
			System.out.println("2. Delete player");
			System.out.println("3. Edit player");
			System.out.println("4. View player");
			System.out.println("5. Show a menu");
			System.out.println("6. Exit");
			System.out.println("Select one number 1-6:");
			num=input.nextInt();

			if (num==1) {
				addPlayer();
			}
			else if (num==2) {
				deletePlayer();
			}
			else if (num==3) {
				editPlayer();
			}
			else if (num==4) {
				viewPlayer();
			}
			else {
				continue;
			}
		}
	}
	public static void addPlayer() {
		Scanner input=new Scanner(System.in);
		System.out.println("Player Name:");
		String playerName=input.nextLine();
		System.out.println("Player Back Number:");
		int playerBackNumber=input.nextInt();
		System.out.println("Position:");
		String position=input.next();
		System.out.println("Phone Number:");
		String phoneNumber=input.next();
		System.out.println(playerName);
		System.out.println("No."+playerBackNumber);
		System.out.println("Position:"+position);
		System.out.println("Phone Number:"+phoneNumber);
	}

	public static void deletePlayer() {
		Scanner input=new Scanner(System.in);
		System.out.println("Player Name:");
		String playerName=input.nextLine();
	}

	public static void editPlayer() {
		Scanner input=new Scanner(System.in);
		System.out.println("Player Name:");
		String playerName=input.nextLine();
	}

	public static void viewPlayer() {
		Scanner input=new Scanner(System.in);
		System.out.println("Player Name:");
		String playerName=input.nextLine();
	}

}
