package com.mybatis.main;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;



import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.mybatis.entities.Booking;
import com.mybatis.entities.Car;
import com.mybatis.entities.Customer;
import com.mybatis.entities.CustomerAddress;
import com.mybatis.entities.ObjectLog;
import com.mybatis.mapper.BookingMapper;
import com.mybatis.mapper.CarMapper;
import com.mybatis.mapper.CustomerAddressMapper;
import com.mybatis.mapper.CustomerMapper;

public class Active {

	private static SqlSession session;
	
//	public static void main(String[] args) throws IOException {
//		Active a = new Active();
////		Car c= a.getcar(4);//a.Checkuser(new ObjectLog("costa",121)));
////		System.out.println(c.getCarType().getId());
//		Booking bb = a.getAllBooking(1);
//		System.out.println(bb);
		
////		String resource = "com/mybatis/main/config.xml";
////	    InputStream inputStream = Resources.getResourceAsStream(resource);
////	    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
////	    SqlSession session = sqlSessionFactory.openSession();
////	    
////	    CarMapper cm =  session.getMapper(CarMapper.class);
////	    Car c = cm.getCarById(1);
////	    c.toString();
//	   // session.close();
//		
//		String resource = "com/mybatis/main/config.xml";
//		InputStream inputStream = Resources.getResourceAsStream(resource);
//		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//		SqlSession session = sqlSessionFactory.openSession();
//
//		CarMapper mp = session.getMapper(CarMapper.class);
//
//		 Car p = mp.getCarById(2);
//		 System.out.println(p.toString());
//	}
	
	
	public  Active() throws IOException {
		String resource = "com/mybatis/main/config.xml";
	    InputStream inputStream = Resources.getResourceAsStream(resource);
	    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder() .build(inputStream);
	    
	    session = sqlSessionFactory.openSession();
	}
	
	public int setCustAdd(CustomerAddress ca) 
	{
		
	    CustomerAddressMapper custadd = session.getMapper(CustomerAddressMapper.class);
	    
	    custadd.insertCustomerAddress(ca);
	    session.commit();
	    
		return ca.getCid();
	}
	
	public void setCust(Customer c) {
		
		CustomerMapper cust = session.getMapper(CustomerMapper.class);
		
		cust.insertCustomer(c);
		session.commit();
		
		session.close();
	}
	
	public Car getcar(int id) {
		CarMapper mp = session.getMapper(CarMapper.class);

		 Car p = mp.getCarById(id);
		 return p;
	}
	
	public Customer Checkuser(ObjectLog o) {
		CustomerMapper cm = session.getMapper(CustomerMapper.class);
		
		Customer c = cm.checkCustomer(o);
		
		return(c);
	}
	
	public void setbook(Booking b) {
		
		BookingMapper book = session.getMapper(BookingMapper.class);
		book.insertBooking(b);
		session.commit();
	}
	
	public List<Booking> getAllBooking(int cid) {
		
		BookingMapper book = session.getMapper(BookingMapper.class);
		List<Booking> b = book.getAllBookng(cid);
		
		System.out.println(b);
		
		return b;
	}
}
