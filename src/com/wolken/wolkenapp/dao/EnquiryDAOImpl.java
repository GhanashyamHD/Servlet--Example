package com.wolken.wolkenapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.wolken.wolkenapp.EnquiryDTO.EnquiryDTO;

public class EnquiryDAOImpl implements EnquiryDAO {

	public void add(EnquiryDTO edto) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");		
		}
		catch(ClassNotFoundException e) {
			System.out.println(e.toString());
		}
		try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wolken?user=root&password=Leela12345$$ ");){
			try(PreparedStatement ps = con.prepareStatement("insert into enquiry values(?,?,?,?,?)");){
				ps.setInt(1, edto.getId());
				ps.setString(2, edto.getName());
				ps.setInt(3, edto.getAge());
				ps.setString(4,edto.getPlace());
				ps.setString(5, edto.getDob());
				ps.executeUpdate();
				ps.close();
					
			}
			con.close();
		}
	
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
