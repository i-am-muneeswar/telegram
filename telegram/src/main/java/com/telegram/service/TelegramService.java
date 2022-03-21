package com.telegram.service;

import java.util.List;

import com.telegram.dao.TelegramDAOInterface;
import com.telegram.entity.TelegramUser;
import com.telegram.entity.TimelineDetails;
import com.telegram.utility.FactoryDAO;

public class TelegramService implements TelegramServiceInterface {
	
	TelegramDAOInterface td = null;
	
	public TelegramService() {
		td = FactoryDAO.createObejct();
	}
	

	public int createProfileService(TelegramUser tu) {

		int i = td.createProfileDAO(tu);
		return i;
		
	}


	public int deleteProfileService(TelegramUser tu) {

		int i = td.deleteProfileDAO(tu);
		return i;
		
	}


	public TelegramUser viewProfileService(TelegramUser tu) {
		
		TelegramUser i = td.viewProfileDAO(tu);
		return i;
		
	}


	public List<TelegramUser> viewAllProfilesService() {

		List<TelegramUser> i = td.viewAllProfilesDAO(); 
		return i;
	}


	public List<TelegramUser> searchProfileService(TelegramUser tu) {
		
		List<TelegramUser> i = td.searchProfilesDAO(tu); 
		return i;
		
	}


	public int editProfileService(TelegramUser tu) {
		
		int i = td.editProfileDAO(tu);
		return i;
	}


	public TelegramUser signINService(TelegramUser tu) {

		TelegramUser i = td.signINDAO(tu);
		return i;
	
	}


	public int createTimelineService(TimelineDetails tld) {

		int i = td.createTimelineDAO(tld);
		return i;
		
	}

}
