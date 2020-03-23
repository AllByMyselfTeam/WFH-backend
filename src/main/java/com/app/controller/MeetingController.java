package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojo.Meeting;
import com.app.service.MeetingService;

@RestController
@RequestMapping("/meeting")
@CrossOrigin(origins = "http://localhost:4200")
public class MeetingController {
	@Autowired
	MeetingService meetingService;
	
	@PostMapping
	public Meeting addMeeting(@RequestBody Meeting meeting) {
		return meetingService.addMeeting(meeting);
	}
}