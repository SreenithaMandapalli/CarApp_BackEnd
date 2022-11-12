package com.app.repository;

import java.util.Date;
import java.util.List;

import com.app.pojo.CarService;
import com.app.pojo.CarUser;
import com.app.pojo.Dashboard;
import com.app.pojo.Slot;

public interface CarRepo {
	
	int registerUser(CarUser carUserObj);
	
	int logInCarUser(CarUser carUserObj);
	
	CarUser getCarUser(String userName, String password);
	
	int checkAvailability(Date inputDate);
	
	int bookASlot(Slot slot);
	
	int checkInCar(CarService carService);
	
	List<Dashboard> displayDashboard();
	
	CarService getServiceDetails(int checkInId);
	
	int updateBillInService(int checkInId, int amount);
	
	int updatePayBill(int checkInId);


}
