
package com.jsp.service;

import java.util.List;

import com.jsp.dao.HospitalDao;
import com.jsp.dto.Hospital;

public class ServiceHospital {
	
	HospitalDao dao=new HospitalDao();
	public Hospital saveHospital(Hospital hospital) {
		return dao.saveHospital(hospital);
		
	}
	public Hospital updateHospital(int id ,Hospital hospital) {
		return dao.updateHospital(id, hospital);
		
	}
	public Hospital deleteHospital(int id) {
		return dao.deleteHospital(id);
		 
	}
	public Hospital editHospital(int id,Hospital hospital) {
		return dao.editHospital(id, hospital);
	}
	public List<Hospital> displayHospital(Hospital hospital){
		return dao.displayHosptial();
	}

		
	
	

}
