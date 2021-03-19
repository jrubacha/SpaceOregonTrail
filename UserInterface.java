import java.util.*;

class UserInterface {
	public void clear() {
		System.out.print("\033[H\033[2J");
		System.out.flush();	
	}

	public void print(String word) {
		System.out.print(word);
	}

	public void println(String word) {
		System.out.println(word);
	}

	// public void printpad(String word) {
	// 	String.format("|%2s|", word);
	// }
}