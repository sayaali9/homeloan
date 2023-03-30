package com.SecureHome.main.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SecureHome.main.model.Enquiry;
import com.SecureHome.main.repository.Enquiryrepository;
import com.SecureHome.main.serviceI.EnquiryI;

@Service
public class EnquiryImpl implements EnquiryI{
	
	@Autowired
	private Enquiryrepository enrepo;

	@Override
	public Enquiry saveEnquirydata(Enquiry e) {
	
		Enquiry s1 = enrepo.save(e);
		return s1;
	}

	@Override
	public Iterable<Enquiry> getAllEnquirydata() {
		List<Enquiry> s1 = enrepo.findAll();
		return s1;
	}

	@Override
	public Enquiry updateEnquirydata(Enquiry e) {

		Enquiry s1 = enrepo.save(e);
		return s1;
	}

	@Override
	public void deleteEnquirydata(int id) {
	
		enrepo.deleteById(id);
	}
	


}
