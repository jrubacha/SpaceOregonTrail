import java.util.*;

class UserInterface {
	public void clear() {
		System.out.print("\033[H\033[2J");
		System.out.flush();	
	}

	public void print(String word) {
		System.out.println(word);
	}
}