package com.venky.flightreservation.dao;

import com.venky.flightreservation.model.Reservation;

public interface ReservationDao {
	Reservation bookFlight(Reservation reservation);
	
	Reservation checkIn(long reservationId,int noOfBags);

}
