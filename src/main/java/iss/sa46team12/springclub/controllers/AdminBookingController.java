package iss.sa46team12.springclub.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import iss.sa46team12.springclub.models.Bookings;
import iss.sa46team12.springclub.repositories.BookingDetailsRepository;
import iss.sa46team12.springclub.repositories.TimeslotRepository;
import iss.sa46team12.springclub.services.BookingDetailsService;
import iss.sa46team12.springclub.services.BookingsService;
import iss.sa46team12.springclub.services.TimeslotService;

@Controller
public class AdminBookingController {

	@Autowired
	BookingDetailsRepository bdr;

	@Autowired
	BookingsService bookingService;

	@Autowired
	TimeslotRepository tr;

	@Autowired
	BookingDetailsService bds;

	@Autowired
	BookingsService bs;

	@Autowired
	TimeslotService ts;

	@RequestMapping(value = "/admin/manageBM/editBooking", method = RequestMethod.GET)
	public ModelAndView editMaintenance() {
		ModelAndView mav = new ModelAndView("adminBookingForm");
		Bookings booking = bookingService.findBooking(1);		
		mav.addObject("booking", booking);
		return mav;
	}
	
	@RequestMapping(value = "/admin/manageBM/editBooking", method = RequestMethod.POST)
	public ModelAndView cancelBooking(@ModelAttribute Bookings booking) {
		booking.setStatus("CANCELLED");
		ModelAndView mav = new ModelAndView("adminCalendar");
		return mav;
	}
}
