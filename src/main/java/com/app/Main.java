package com.app;

import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.TelegramBotsApi;
import org.telegram.telegrambots.exceptions.TelegramApiException;
public class Main {
	public static void main(String[] args) {
		
		//	Intialize Api Context
		ApiContextInitializer.init();
		
		//	Instantiate Telegram Bots API
		TelegramBotsApi botsApi = new TelegramBotsApi();
		
		//	Register our bot
		try {
			botsApi.registerBot(new MyGpntuoBot());
		} catch (TelegramApiException e) {
			e.printStackTrace();
		}
	}
}

