package com.telegram;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.telegram.controller.TelegramController;
import com.telegram.controller.TelegramControllerInterface;

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
		
		
		
	}

	@Test
	public void testDeleteProfileController() {

		
		
	}

	@Test
	public void testViewProfileController() {

		
		
	}

	@Test
	public void testViewAllProfiles() {

		
		
	}

	@Test
	public void testSearchProfileController() {

		
		
	}

	@Test
	public void testEditProfileController() {

		
		
	}

	@Test
	public void testSignINController() {


		
	}

	@Test
	public void testCreateTimeline() {
		
	}

}
