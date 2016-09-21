package org.Hospitals.Controller;

import org.Hospitals.Entites.Patient;
import org.Hospitals.Repositories.PatientsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PatientsEmergencyForm {

	@Autowired
	PatientsRepository patientsrepo;
	@RequestMapping("/emergencyform")
	public ModelAndView PostEmergencyDetails(@RequestParam("firstname") String firstname,@RequestParam("lastname") String lastname,
			@RequestParam("ages") String age, @RequestParam("sex") String sex, @RequestParam("ailments") String ailments,@RequestParam("financialstatus")  String status,
			@RequestParam("location") String location,@RequestParam("emailaddress") String emailaddress){
			Patient patient = new Patient();
			patient.setPatientFname(firstname);
			patient.setPatientLname(lastname);
			patient.setAge(Integer.valueOf(age));
			patient.setSex(sex);
			patient.setAilment(ailments);
			patient.setFinancialStatus(status);
			patient.setLocation(Integer.valueOf(location));
			patient.setPatientEmail(emailaddress);
			patientsrepo.save(patient);
			
			String patientid = patient.getPatientId();
			return new ModelAndView("PatientToken","patientid",patientid); 
	}
}

