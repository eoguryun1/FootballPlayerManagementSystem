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
			switch (num) {
			case 1:
				System.out.print("Player Back Number:");
				int PlayerNumber=input.nextInt();
				System.out.print("Player Name:");
				String PlayerName=input.next();
				System.out.print("Player Position:");
				String PlayerPosition=input.next();
				break;

			case 2:
				System.out.print("Player Name:");
				String PlayerName1=input.next();
				break;


			case 3:
				System.out.print("Player Name:");
				String PlayerName2=input.next();
				break;


			case 4:
				System.out.print("Player Name:");
				String PlayerName3=input.next();
				break;

			}
		}
	}

}
