package com.telegram.utility;

import java.util.Comparator;

import com.telegram.entity.TelegramUser;

public class SortByAddress implements Comparator<TelegramUser> {

	@Override
	public int compare(TelegramUser a1, TelegramUser a2) {
		
		return a1.getAddress().compareTo(a2.getAddress());
		
	}

}
