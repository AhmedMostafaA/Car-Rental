package com.mybatis.mapper;

import java.util.List;

import com.mybatis.entities.Booking;

public interface BookingMapper {

	public void insertBooking(Booking b);

	public void updateBooking(Booking b);

	public void deleteBooking(Integer bId);
	
	public List<Booking> getAllBookng(Integer cid);
}
