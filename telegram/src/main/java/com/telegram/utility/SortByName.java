package com.telegram.utility;

import java.util.*;

import com.telegram.entity.TelegramUser;

public class SortByName implements Comparator<TelegramUser> {

	@Override
	public int compare(TelegramUser n1, TelegramUser n2) {

		return n1.getName().compareTo(n2.getName());
		
	}

}
