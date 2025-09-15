package com.HotelBooking.Booking.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BookedRoom {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private LocalDate checkInDate;
	
	private LocalDate checkOutDate;
	
	private String guestFullName;
	
	private String guestEmail;
	
	private int numOfAdults;
	
	private int numOfChildren;
	
	private int totalNumOfGuest;
	
	private String bookingConfirmationCode;
	
	public void calculateTotalNumberOfGuest() {
        this.totalNumOfGuest = this.numOfAdults + numOfChildren;
        }
	
	 public void setNumOfAdults(int numOfAdults) {
	        this.numOfAdults = numOfAdults;
	        calculateTotalNumberOfGuest();
	    }

	    public void setNumOfChildren(int numOfChildren) {
	        this.numOfChildren = numOfChildren;
	        calculateTotalNumberOfGuest();
	    }
	
	

	

}
