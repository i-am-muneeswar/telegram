package com.telegram;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.telegram.dao.TelegramDAO;
import com.telegram.dao.TelegramDAOInterface;
import com.telegram.entity.TelegramUser;
import com.telegram.entity.TimelineDetails;

public class DAOUnitTesting {
	
	TelegramDAOInterface td = null;

	@Before
	public void setUp() throws Exception {
		
		td = new TelegramDAO();
		
	}

	@After
	public void tearDown() throws Exception {
		
		td = null;
	}

	@Test
	public void testCreateProfileDAO() {
		
		TelegramUser tu = new TelegramUser();
		tu.setName("bb");
		tu.setPassword("bb");
		tu.setEmail("bb");
		tu.setAddress("bb");

		int i = td.createProfileDAO(tu);
		
		assert i>0: "Create Profile DAO testcase failed";
		
	}

	@Test
	public void testDeleteProfileDAO() {

		TelegramUser tu = new TelegramUser();
		tu.setEmail("bb");
		
		int i = td.deleteProfileDAO(tu);
		
		assert i>0: "Delete Profile DAO testcase failed";
		
	}

	@Test
	public void testViewProfileDAO() {

		TelegramUser tu = new TelegramUser();
		tu.setEmail("bb");
		
		TelegramUser i = td.viewProfileDAO(tu);
		
		assert i!=null: "View Profile DAO testcase failed";
		
	}

	@Test
	public void testViewAllProfilesDAO() {
		
		TelegramUser tu = new TelegramUser();
		
		java.util.List<TelegramUser> i = new ArrayList<TelegramUser>();
		
		i = td.viewAllProfilesDAO();
		
		assert i!=null: "View All Profiles DAO testcase failed";
		
	}

	@Test
	public void testSearchProfilesDAO() {
		
		TelegramUser tu = new TelegramUser();
		
		tu.setName("bb");

		java.util.List<TelegramUser> i = td.searchProfilesDAO(tu);
		
		assert i!=null: "Search Profiles DAO testcase failed";
		
	}

	@Test
	public void testEditProfileDAO() {

		TelegramUser tu = new TelegramUser();
		tu.setName("aa");
		tu.setPassword("aa");
		tu.setEmail("aa");
		tu.setAddress("aa");
		
		int i = td.editProfileDAO(tu);
		
		assert i>0: "Edit Profile DAO testcase failed";
		
	}

	@Test
	public void testSignINDAO() {

		TelegramUser tu = new TelegramUser();
		tu.setPassword("aa");
		tu.setEmail("aa");
		
		TelegramUser i = td.signINDAO(tu);
		
		assert i!=null: "SignIN DAO testcase failed";
		
	}

	@Test
	public void testCreateTimelineDAO() {
		
		TimelineDetails tld = new TimelineDetails();
		tld.setMessageid("dd");
		tld.setSender("dd");
		tld.setMessage("dd");
		tld.setDate("dd");
		tld.setReciever("dd");
		
		int i = td.createTimelineDAO(tld);
		
		assert i>0: "Create timeline DAO testcase failed";
		
	}

}
