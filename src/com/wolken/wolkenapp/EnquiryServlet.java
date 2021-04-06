package com.wolken.wolkenapp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.naming.ldap.StartTlsRequest;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

import com.wolken.wolkenapp.EnquiryDTO.EnquiryDTO;
import com.wolken.wolkenapp.service.EnquiryServiceImpl;
import com.wolken.wolkenapp.service.EquiryService;

@WebServlet("/Enquiry")

public class EnquiryServlet extends HttpServlet {
	EquiryService es = new EnquiryServiceImpl();
	EnquiryDTO edto = new EnquiryDTO ();
	@Override
	public void service(ServletRequest req, ServletResponse resp) throws IOException{
	String id = req.getParameter("id");
	edto.setId(Integer.parseInt(id)); 
	 edto.setName(req.getParameter("name"));
	 String age = req.getParameter("age"); 
	 edto.setDob(req.getParameter("dob"));
	 edto.setPlace(req.getParameter("place"));
	 edto.setAge(Integer.parseInt(age));
	// int dob1 = Integer.parseInt(dob);
	
	 es.validateAndAdd(edto);
	 PrintWriter pw = resp.getWriter();
	 pw.write("Welcome ");
	
	 
	 
	
		
	}

}
