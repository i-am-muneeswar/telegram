package com.telegram.utility;

import com.telegram.dao.TelegramDAO;
import com.telegram.dao.TelegramDAOInterface;

public class FactoryDAO {

	public static TelegramDAOInterface createObejct() {
		
		
		return new TelegramDAO();
	}

}
