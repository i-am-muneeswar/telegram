package com.telegram.controller;

import java.util.*;
import java.util.logging.Logger;

import com.telegram.entity.TelegramUser;
import com.telegram.entity.TimelineDetails;
import com.telegram.service.TelegramServiceInterface;
import com.telegram.utility.FactoryService;

public class TelegramController implements TelegramControllerInterface {
	
	Logger log = Logger.getLogger("Telegram Controller");
	
	TelegramServiceInterface ts = null;
	
	public TelegramController() {
		ts = FactoryService.createObject(); 
	}

	public int createProfileController() {

		Scanner sc = new Scanner(System.in);
		
		log.info("Enter name: ");
		String name = sc.next();
		
		log.info("Enter Password: ");
		String password = sc.next();
		
		log.info("Enter Email: ");
		String email = sc.next();
		
		log.info("Enter Address: ");
		String address = sc.next();
		
		TelegramUser tu = new TelegramUser();
		tu.setName(name);
		tu.setPassword(password);
		tu.setEmail(email);
		tu.setAddress(address);
		
		int i = ts.createProfileService(tu);
		
		if(i>0) {
			System.out.println("Profile created for "+name);
		}
		
		else {
			System.out.println("Sorry..... cannot create profile");
		}
		return i;
	}

	public void deleteProfileController() {

		Scanner sc = new Scanner(System.in);
		
		log.info("Enter email: ");
		String email = sc.next();
		
		TelegramUser tu = new TelegramUser();
		tu.setEmail(email);
		
		int i = ts.deleteProfileService(tu);
		
		if(i>0) {
			System.out.println("Profile is deleted");
		}
		
		else {
			System.out.println("Profile is not deleted");
		}
		
	}

	public void viewProfileController() {

		Scanner sc = new Scanner(System.in);
		
		log.info("Enter email: ");
		String email = sc.next();
		
		TelegramUser tu = new TelegramUser();
		tu.setEmail(email);
		
		TelegramUser i = ts.viewProfileService(tu);
		
		if(i!=null) {
			
			System.out.println("********************");
			System.out.println("Name is "+i.getName());
			System.out.println("Password is "+i.getPassword());
			System.out.println("Email is "+i.getEmail());
			System.out.println("Address is "+i.getAddress());
			System.out.println("********************");
			
		}
		
		else {
			System.out.println("Cannot view Profile");
		}
		
	}

	public void viewAllProfiles() {

		List<TelegramUser> i = ts.viewAllProfilesService();
		
		System.out.println("**********************************************");
		System.out.println(i.size()+" records found in the database");
		System.out.println("**********************************************");
		
		i.forEach(s->{
			
			System.out.println("********************");
			System.out.println("Name is "+s.getName());
			System.out.println("Password is "+s.getPassword());
			System.out.println("Email is "+s.getEmail());
			System.out.println("Address is "+s.getAddress());
			System.out.println("********************");
			
		});
		
		
		
	}

	public void searchProfileController() {

		Scanner sc = new Scanner(System.in);
		
		log.info("Enter name: ");
		String name = sc.next();
		
		TelegramUser tu = new TelegramUser();
		tu.setName(name);
		
		List<TelegramUser> i = ts.searchProfileService(tu);
		
		System.out.println("**********************************************");
		System.out.println(i.size()+" records found in the database");
		System.out.println("**********************************************");
		
		i.forEach(s->{
			
			System.out.println("********************");
			System.out.println("Name is "+s.getName());
			System.out.println("Password is "+s.getPassword());
			System.out.println("Email is "+s.getEmail());
			System.out.println("Address is "+s.getAddress());
			System.out.println("********************");
			
		});
		
	}

	public void editProfileController() {
		
		System.out.println("Your Older Data");
		viewProfileController();
		
		
		Scanner sc = new Scanner(System.in);
		
		log.info("Enter new name: ");
		String name = sc.next();
		
		log.info("Enter new Password: ");
		String password = sc.next();
		
		log.info("Enter old Email: ");
		String email = sc.next();
		
		log.info("Enter new Address: ");
		String address = sc.next();
		
		TelegramUser tu = new TelegramUser();
		tu.setName(name);
		tu.setPassword(password);
		tu.setEmail(email);
		tu.setAddress(address);
		
		int i = ts.editProfileService(tu);
		
		System.out.println("Updated data is.......");
		
		if(i>0) {
			System.out.println("********************");
			System.out.println("Name is "+name);
			System.out.println("Password is "+password);
			System.out.println("Email is "+email);
			System.out.println("Address is "+address);
			System.out.println("********************");
		}
		
		else {
			System.out.println("Sorry.... your profile is not updated");
		}
		
	}

	public TelegramUser signINController() {

		Scanner sc = new Scanner(System.in);
		
		log.info("Enter email: ");
		String email = sc.next();
		
		log.info("Enter Password: ");
		String password = sc.next();
		
		TelegramUser tu = new TelegramUser();
		tu.setEmail(email);
		tu.setPassword(password);
		
		TelegramUser i = ts.signINService(tu);
		
		if(i!=null) {
			
			System.out.println("********************");
			System.out.println("Welcome to Telegram "+i.getName()+" 😀😀");
			System.out.println("********************");
			
		}
		
		else {
			System.out.println("Unable to Signin..... try again 🥲🥲");
		}
		return i;
		
	}

	public void createTimeline() {

		Scanner sc = new Scanner(System.in);
		
		log.info("Enter Message ID: ");
		String messageid = sc.next();
		
		log.info("Enter Sender ID: ");
		String sender = sc.next();
		
		log.info("Enter Reciever ID: ");
		String reciever = sc.next();
		
		log.info("Enter Message: ");
		String message = sc.next();
		
		log.info("Enter Date: ");
		String date = sc.next();
		
		TimelineDetails tld = new TimelineDetails();
		tld.setMessageid(messageid);
		tld.setSender(sender);
		tld.setReciever(reciever);
		tld.setMessage(message);
		tld.setDate(date);
		
		int i = ts.createTimelineService(tld);
		
		if(i>0){
			System.out.println("Your timeline is updated");
		}
		
		else {
			System.out.println("Sorry, unable to create timeline");
		}
		
	}

}
