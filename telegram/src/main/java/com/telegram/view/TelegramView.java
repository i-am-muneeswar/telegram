package com.telegram.view;
import java.util.*;

import com.telegram.controller.TelegramControllerInterface;
import com.telegram.entity.TelegramUser;
import com.telegram.utility.FactoryController;

public class TelegramView {

	public static void main(String[] args) {

		String s = "y";
		
		Scanner sc = new Scanner(System.in);
		
		while(s.equals("y")) {
			
			
			System.out.println("********************");
			System.out.println("Welcome to Telegram");
			System.out.println("********************");
			System.out.println("Press 1 to SignUp");
			System.out.println("Press 2 to SignIN");
			System.out.println("********************");
			
			System.out.println("Enter your choice: ");
			int ch = sc.nextInt();
			
			TelegramControllerInterface tc = FactoryController.createObject();
			TelegramUser si;
			
			switch(ch) {
			
				case 1:
					tc.createProfileController();
					break;
					
				case 2:
					
					si = tc.signINController();
					if(si!=null) {
						
						while(s.equals("y")) {
							
							System.out.println("Press 1 to Delete Profile");
							System.out.println("Press 2 to View Profile");
							System.out.println("Press 3 to View All Profiles");
							System.out.println("Press 4 to Edit Profile");
							System.out.println("Press 5 to Search Profile");
							System.out.println("Press 6 to Create Timeline");
							
							System.out.println("Select an Operation: ");
							int c = sc.nextInt();
							
							switch(c) {
							
								case 1:
									tc.deleteProfileController();
									break;
								
								case 2:
									tc.viewProfileController();
									break;
								
								case 3:
									tc.viewAllProfiles();
									break;
								
								case 4:
									tc.editProfileController();
									break;
								
								case 5:
									tc.searchProfileController();
									break;
								
								case 6:
									tc.createTimeline();
									break;
									
								default:
									System.out.println("Becareful what you wish for "+si.getName());
								
							}
							
							System.out.println("Press y to continue");
							s = sc.next();
							
						}
							
					}
					
					else {
						System.out.println("It's very sad that you are not on Telegram 😔😔, please create your profile 🙂🙂");
					}
					
					break;
					
				default:
					System.out.println("I guess choosing between 1 and 2 is not that hard.....");
					
			}
			
			System.out.println("Press y to continue");
			s = sc.next();
			
		}

	}

}
