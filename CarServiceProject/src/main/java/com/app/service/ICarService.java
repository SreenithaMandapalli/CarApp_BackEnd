package com.app.service;

import java.util.Date;
import java.util.List;

import com.app.pojo.CarService;
import com.app.pojo.CarUser;
import com.app.pojo.Dashboard;
import com.app.pojo.Slot;

public interface ICarService {

	boolean registerCar(CarUser user);
	
	CarUser logInCarUser(CarUser carUser);
	
	boolean checkAvailability(Date inputDate);
	
	int bookASlot(Slot slot);
	
	int checkInCar(CarService carService);
	
	List<Dashboard> displayDashboard();
	
	int generateBill(int checkInId);
	
	String updatePayBill(int checkInId);

}
