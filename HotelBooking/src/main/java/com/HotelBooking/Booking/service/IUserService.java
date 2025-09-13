package com.HotelBooking.Booking.service;

import java.util.List;

import com.HotelBooking.Booking.model.User;

public interface IUserService {
	User registerUser(User user);
	List<User> getUsers();
	void deleteUser(String email);
	User getUser(String email);

}
