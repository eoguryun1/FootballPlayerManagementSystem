
import java.util.InputMismatchException;
import java.util.Scanner;

import gui.WindowFrame;
import log.EventLogger;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MenuManager {
	static EventLogger logger=new EventLogger("log.txt");	
 
	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);
		PlayerManager playermanager=getObject("playermanager.ser");
		if(playermanager==null) {
			playermanager= new PlayerManager(input);
		}

		WindowFrame frame= new WindowFrame();
		selectMenu(input, playermanager);
		putObject(playermanager, "playermanager.ser");
	}

	public static void selectMenu(Scanner input, PlayerManager playermanager) {
		int num=-1;
		while(num!=5){	
			try {
				showMenu();
				num=input.nextInt();
				switch(num) {
				case 1:
					playermanager.addPlayer();
					logger.log("add a Player");
					break;
				case 2:
					playermanager.deletePlayer();
					logger.log("delete a Player");
					break;
				case 3:
					playermanager.editPlayer();
					logger.log("edit a Player");
					break;
				case 4:
					playermanager.viewPlayers();
					logger.log("view a Player");
					break;
				default:
					continue;


				}
			}
			catch(InputMismatchException e) {
				System.out.println("Please out an integer between 1-5!");
				if(input.hasNext()) {
					input.next();
				}
				num=-1;
			}
		}
	}

	public static void showMenu() {
		System.out.println("--GUFS Player Management System--");
		System.out.println("1. Add player");
		System.out.println("2. Delete player");
		System.out.println("3. Edit player");
		System.out.println("4. View players");
		System.out.println("5. Exit");
		System.out.println("Select one number 1-5:");

	}

	public static PlayerManager getObject(String filename) {
		PlayerManager playermanager = null;
		
		
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in= new ObjectInputStream(file);


			playermanager=(PlayerManager)in.readObject();

			in.close();
			file.close();

		} catch (ClassNotFoundException e) {
			return playermanager;

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); 
		}

		return playermanager;

	}

	public static void putObject(PlayerManager playermanager, String filename) {
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out= new ObjectOutputStream(file);
			
			out.writeObject(playermanager);



			out.close();
			file.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); 
		}

	}

}
