package com.wolken.wolkenapp.service;

import com.wolken.wolkenapp.EnquiryDTO.EnquiryDTO;
import com.wolken.wolkenapp.dao.EnquiryDAOImpl;

public class EnquiryServiceImpl implements EquiryService {

	EnquiryDAOImpl ed = new EnquiryDAOImpl();
	@Override
	public void validateAndAdd(EnquiryDTO edto) {
		// TODO Auto-generated method stub
		if(edto.getId() > 1 ) {
			if(edto.getAge() != 0) {
				if(edto.getName() != null) {
					if(edto.getPlace() != null && edto.getPlace().length()>1) {
						ed.add(edto);
						
					}
					else 
						System.out.println("Invalid Place");
				}
				else
					System.out.println("Invalid Name");
			}
			else 
				System.out.println("Invalid age");
				
		}
		else 
			System.out.println("Invalid id");
		
		
		
		
		
	}

//	@Override
//	public void validateAndDisplay() {
//		// TODO Auto-generated method stub
//		
//	}

}
