package iss.sa46team12.springclub.services;

import java.util.ArrayList;

import iss.sa46team12.springclub.models.Bookings;
import iss.sa46team12.springclub.models.Facility;
import iss.sa46team12.springclub.models.User;

public interface ReportService {
	
	//facilities
	ArrayList<Facility> findAllFacilities();	
	Facility findFacilityByName(String name);
	Facility findFacilityById(String id);	
	Facility createFacility(Facility fac);
	Facility editFacility(Facility fac);
	ArrayList<Facility> findFacilityByCriteria(Facility facility);
	
	//users
	User findUserById(Integer id);		
	ArrayList<User> getAllUsers();
	
	//bookings
	ArrayList<Bookings> getAllBookings();	
	ArrayList<Bookings> findAllConfirmedBookings();	
	Bookings findBooking(Integer bookingid);	
	Bookings createBooking(Bookings booking);
	Bookings changeBooking(Bookings booking);
	void removeBooking(Bookings booking);
	int findNumOfMales();
	
}