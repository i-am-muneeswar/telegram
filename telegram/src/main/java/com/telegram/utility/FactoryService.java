package com.telegram.utility;

import com.telegram.service.TelegramServiceInterface;
import com.telegram.service.TelegramService;

public class FactoryService {

	public static TelegramServiceInterface createObject() {
		
		return new TelegramService();
	}

}
