
import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		PlayerManager playermanager=new PlayerManager(input);
		
		int num=-1;
		while(num!=5){	
			System.out.println("--GUFS Player Management System--");
			System.out.println("1. Add player");
			System.out.println("2. Delete player");
			System.out.println("3. Edit player");
			System.out.println("4. View players");
			System.out.println("5. Exit");
			System.out.println("Select one number 1-5:");
			num=input.nextInt();

			if (num==1) {
				playermanager.addPlayer();
			}
			else if (num==2) {
				playermanager.deletePlayer();
			}
			else if (num==3) {
				playermanager.editPlayer();
			}
			else if (num==4) {
				
				playermanager.viewPlayers();
			}
			else {
				continue; 
			}
		}
	}

}
