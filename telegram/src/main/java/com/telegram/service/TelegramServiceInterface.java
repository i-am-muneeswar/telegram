package com.telegram.service;

import java.util.List;

import com.telegram.entity.TelegramUser;
import com.telegram.entity.TimelineDetails;

public interface TelegramServiceInterface {

	int createProfileService(TelegramUser tu);

	int deleteProfileService(TelegramUser tu);

	TelegramUser viewProfileService(TelegramUser tu);

	List<TelegramUser> viewAllProfilesService();

	List<TelegramUser> searchProfileService(TelegramUser tu);

	int editProfileService(TelegramUser tu);

	TelegramUser signINService(TelegramUser tu);

	int createTimelineService(TimelineDetails tld);

}
