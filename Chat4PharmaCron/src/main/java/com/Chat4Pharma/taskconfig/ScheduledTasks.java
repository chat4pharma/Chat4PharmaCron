package com.Chat4Pharma.taskconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.Chat4Pharma.service.StorageService;

@Component
public class ScheduledTasks {
	
	 @Autowired
	    private StorageService service;
	
	
	@Scheduled(cron = "0 * * * * *")
	public void performTaskUsingCron() {

		
		service.uploadFile();
	}

}
