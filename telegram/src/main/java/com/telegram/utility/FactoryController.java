package com.telegram.utility;

import com.telegram.controller.TelegramController;
import com.telegram.controller.TelegramControllerInterface;

public class FactoryController {

	public static TelegramControllerInterface createObject() {
		
		return new TelegramController();
	}

}
