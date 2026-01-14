package com.day2.texteditor;

import java.util.Scanner;

public class TextEditorDemo {

	public static void main(String[] args) {
		// Create Scanner object
		Scanner sc = new Scanner(System.in);

		TextEditor editor = new TextEditor();
		System.out.println("--------Text Editor-------");
		
		while(true) {
			System.out.println("Choose the operation : ");
			System.out.println("1. INSERT\n2. DELETE\n3. UNDO\n4. REDO\n5. EXIT");
			int choice = sc.nextInt();
			// EXIT
			if(choice==5) {
				System.out.println("Thank you!!!");
				break;
			}
			// User Choice
			switch(choice) {
				case 1 ->{
					System.out.println("Insert in the Editor : ");
					String ans = sc.next();
					editor.insert(ans);
					editor.display();
				}
				
				case 2 ->{
					System.out.println("Number of characters to be deleted : ");
					int del = sc.nextInt();
					editor.delete(del);
					editor.display();
				}
				
				case 3 ->{
					editor.undo();
					editor.display();
				}
				
				case 4 ->{
					editor.redo();
					editor.display();
				}
				
				default -> System.out.println("Invalid input");	
			}
		}
		
		// Close scanner stream
		sc.close();
	}
}

