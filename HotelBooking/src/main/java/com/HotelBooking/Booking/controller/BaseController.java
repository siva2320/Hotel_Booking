package com.HotelBooking.Booking.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {

	@GetMapping("/")
	public String home() {
		return "Home";
	}
	
	@GetMapping("/login")
	public String login() {
		return "Home";
	}

}
