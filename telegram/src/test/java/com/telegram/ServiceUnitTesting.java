package com.telegram;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.telegram.entity.TelegramUser;
import com.telegram.entity.TimelineDetails;
import com.telegram.service.TelegramService;
import com.telegram.service.TelegramServiceInterface;

public class ServiceUnitTesting {
	
	TelegramServiceInterface ts = null;
	
	@Before
	public void setUp() throws Exception {
		
		ts = new TelegramService();
		
	}

	@After
	public void tearDown() throws Exception {
		
		ts = null;
		
	}

	@Test
	public void testCreateProfileService() {

		TelegramUser tu = new TelegramUser();
		tu.setName("bb");
		tu.setPassword("bb");
		tu.setEmail("bb");
		tu.setAddress("bb");

		int i = ts.createProfileService(tu);
		
		assert i>0: "Create Profile Service testcase failed";
		
	}

	@Test
	public void testDeleteProfileService() {

		TelegramUser tu = new TelegramUser();
		tu.setEmail("bb");
		
		int i = ts.deleteProfileService(tu);
		
		assert i>0: "Delete Profile Service testcase failed";
		
	}

	@Test
	public void testViewProfileService() {

		TelegramUser tu = new TelegramUser();
		tu.setEmail("cc");
		
		TelegramUser i = ts.viewProfileService(tu);
		
		assert i!=null: "View Profile Service testcase failed";
		
	}

	@Test
	public void testViewAllProfilesService() {

		TelegramUser tu = new TelegramUser();
		
		java.util.List<TelegramUser> i = new ArrayList<TelegramUser>();
		
		i = ts.viewAllProfilesService();
		
		assert i!=null: "View All Profiles Service testcase failed";
		
	}

	@Test
	public void testSearchProfileService() {

		TelegramUser tu = new TelegramUser();
		
		tu.setName("bb");

		java.util.List<TelegramUser> i = ts.searchProfileService(tu);
		
		assert i!=null: "Search Profiles Service testcase failed";
		
	}

	@Test
	public void testEditProfileService() {

		TelegramUser tu = new TelegramUser();
		tu.setName("aa");
		tu.setPassword("aa");
		tu.setEmail("aa");
		tu.setAddress("aa");
		
		int i = ts.editProfileService(tu);
		
		assert i>0: "Edit Profile Service testcase failed";
		
	}

	@Test
	public void testSignINService() {

		TelegramUser tu = new TelegramUser();
		tu.setPassword("aa");
		tu.setEmail("aa");
		
		TelegramUser i = ts.signINService(tu);
		
		assert i!=null: "SignIN Service testcase failed";
		
	}

	@Test
	public void testCreateTimelineService() {

		TimelineDetails tld = new TimelineDetails();
		tld.setMessageid("ee");
		tld.setSender("ee");
		tld.setMessage("ee");
		tld.setData("ee");
		tld.setReciever("ee");
		
		int i = ts.createTimelineService(tld);
		
		assert i>0: "Create timeline DAO testcase failed";
		
	}

}
