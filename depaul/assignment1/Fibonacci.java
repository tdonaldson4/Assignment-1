package edu.depaul.assignment1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> fibList = new ArrayList<>();
		String userInput = null;
		
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter a number, (quit) to end: ");
			
			do {
				userInput = in.readLine();
			}
			while(!validUserInput(userInput));
			
			for(int i=0; i <= Integer.parseInt(userInput); i++) {
				if(i == 0 || i == 1) {
					fibList.add(i);
				}
				else {
					fibList.add(fibList.get(i-1) + fibList.get(i-2));
				}
			}
			//print result to console
			System.out.println(fibList.get(fibList.size()-1));
		}
		catch (IOException e) {
		// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static boolean validUserInput(String userInput) {
		//verify entry is a number
		String message="Please enter a valid number or (quit) to end: ";
		try {
			if(userInput.isEmpty()) System.out.println(message);
			else { 
				Integer.parseInt(userInput);
				return true; 
			}
		}
		catch(NumberFormatException e) {
			//verify if string contains quit
			if(!userInput.contains("quit")) {
				System.out.println(message);
			}
			else {
				return true;
			}
		}
		
		return false;
	}

}
