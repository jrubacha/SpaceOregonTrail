import java.util.*;

class Main {
  public static void main(String[] args) {
    UserInterface ui = new UserInterface();
		Crew crew1 = new Crew();

		System.out.println("Hello world!");

		Scanner keyboard = new Scanner(System.in);

		System.out.println("what want do? ");
		
		int yn = keyboard.nextInt();

		if (yn == 1) {
			ui.clear();
			crew1.createCrew();
		}


  }
}