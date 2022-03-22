package com.telegram.controller;

import java.util.List;

import com.telegram.entity.TelegramUser;

public interface TelegramControllerInterface {

	int createProfileController();

	int deleteProfileController();

	TelegramUser viewProfileController();

	List<TelegramUser> searchProfileController();

	int editProfileController();

	TelegramUser signINController();

	List<TelegramUser> viewAllProfilesController();

	int createTimelineController();

}
