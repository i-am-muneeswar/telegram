package com.telegram.dao;

import java.util.List;

import com.telegram.entity.TelegramUser;
import com.telegram.entity.TimelineDetails;

public interface TelegramDAOInterface {

	int createProfileDAO(TelegramUser tu);

	int deleteProfileDAO(TelegramUser tu);

	TelegramUser viewProfileDAO(TelegramUser tu);

	List<TelegramUser> viewAllProfilesDAO();

	List<TelegramUser> searchProfilesDAO(TelegramUser tu);

	int editProfileDAO(TelegramUser tu);

	TelegramUser signINDAO(TelegramUser tu);

	int createTimelineDAO(TimelineDetails tld);

}
