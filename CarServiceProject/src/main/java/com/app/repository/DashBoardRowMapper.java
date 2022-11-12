package com.app.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.app.pojo.Dashboard;

public class DashBoardRowMapper implements RowMapper<Dashboard> {

	
	public Dashboard mapRow(ResultSet rs, int arg1) throws SQLException {

		Dashboard ds = new Dashboard();
		ds.setCheckInId(rs.getInt(1));
		ds.setServiceDate(rs.getDate(2));
		ds.setVehicleNumber(rs.getString(3));
		ds.setUserName(rs.getString(4));
		ds.setMobile(rs.getString(5));
		ds.setStatus(rs.getString(6));
		ds.setCheckIn(rs.getString(7));
		ds.setCheckOut(rs.getString(8));
		
		
		return ds;
	}

}
