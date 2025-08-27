package acess;

import java.util.Scanner;

public class CastingTask3 {
	public static void main(String[] args) {
		
		User user = new User();
		Netflex[] netflexes = {new Animation(), new Movie(), new Drama()};
		for(int i = 0; i < netflexes.length; i++) {
			user.getFunction(netflexes[i]);
		}
		
	}
	
}
