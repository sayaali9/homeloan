package com.SecureHome.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SecureHome.main.model.Enquiry;
import com.SecureHome.main.serviceI.EnquiryI;

@RestController
public class HomeLoancontroller {
	
	@Autowired
	private EnquiryI enser;
	
	@PostMapping("/saveEnquiry")
	public String savedata(@RequestBody Enquiry e)
	{
		Enquiry e1=enser.saveEnquirydata(e);
		return "saved Enquiry successfully";
		
	}
	
	@GetMapping("/getAllEnquiry")
	public Iterable<Enquiry> getdata()
	{
		Iterable<Enquiry> e1=enser.getAllEnquirydata();
		return e1;
	}
	
	@PutMapping("/editEnquiry")
	public String editdata(@RequestBody Enquiry e )
	{
		Enquiry e1=enser.updateEnquirydata(e);
		return "update Enquiry successfully";
	}
	
	@DeleteMapping("/deleteEnquiry/{id}")
	public String deletedata(@PathVariable int id)
	{
		enser.deleteEnquirydata(id);
		return "delete Enquiry successfully";
	}
	
	
}
