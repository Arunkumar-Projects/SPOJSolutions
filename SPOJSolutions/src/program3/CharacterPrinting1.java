package program3;

import java.util.Scanner;

public class CharacterPrinting1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int noOfTC=sc.nextInt();
		for(int i=0;i<=noOfTC;i++){
			String input=sc.nextLine();
			System.out.println(input);
		}
	}

}
