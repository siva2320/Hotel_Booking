package com.HotelBooking.Booking.repository;



import com.HotelBooking.Booking.model.BookedRoom;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BoookingRepository extends JpaRepository<BookedRoom,Long>{
	
	 List<BookedRoom> findByRoomId(Long roomId);
	 
	 List<BookedRoom> findByGuestEmail(String email);
	
	 Optional<BookedRoom> findByBookingConfirmationCode(String confirmationCode);
	
}
