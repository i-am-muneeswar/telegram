package com.telegram;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.telegram.controller.TelegramController;
import com.telegram.controller.TelegramControllerInterface;
import com.telegram.entity.TelegramUser;

public class ControllerUnitTesting {
	
	TelegramControllerInterface tc = null;

	@Before
	public void setUp() throws Exception {
		tc = new TelegramController();
	}

	@After
	public void tearDown() throws Exception {
		tc = null;
	}

	@Test
	public void testCreateProfileController() {
		
		int i = tc.createProfileController();
		
		assert i>0: "Create Profile Testcase failed"; 
		
	}

	@Test
	public void testDeleteProfileController() {

		int i = tc.deleteProfileController();
		
		assert i>0: "Delete Profile Testcase failed";
		
	}

	@Test
	public void testViewProfileController() {

		TelegramUser i = tc.viewProfileController();
		
		assert i!=null: "View Profile testcase failed";
	}

	@Test
	public void testViewAllProfilesController() {

		List<TelegramUser> i = tc.viewAllProfilesController();
		
		assert i!=null: "View All Profiles testcase failed";
	}

	@Test
	public void testSearchProfileController() {

		List<TelegramUser> i = tc.searchProfileController();
		
		assert i!=null: "Search Profile testcase failed";
		
	}

	@Test
	public void testEditProfileController() {

		int i = tc.editProfileController();
		
		assert i>0: "Edit Profile testcase failed";
		
	}

	@Test
	public void testSignINController() {

		TelegramUser i = tc.signINController();
		
		assert i!=null: "SignIn testcase failed";
		
	}

	@Test
	public void testCreateTimelineController() {
		
		int i = tc.createTimelineController();
		
		assert i>0: "Timeline Creation Failed";
		
	}

}
