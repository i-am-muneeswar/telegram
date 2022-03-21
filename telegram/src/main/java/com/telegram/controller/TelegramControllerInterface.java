package com.telegram.controller;

import com.telegram.entity.TelegramUser;

public interface TelegramControllerInterface {

	int createProfileController();

	void deleteProfileController();

	void viewProfileController();

	void viewAllProfiles();

	void searchProfileController();

	void editProfileController();

	TelegramUser signINController();

	void createTimeline();

}
