package com.SecureHome.main.serviceI;

import com.SecureHome.main.model.Enquiry;

public interface EnquiryI {

 public Enquiry saveEnquirydata(Enquiry e);

public Iterable<Enquiry> getAllEnquirydata();

public Enquiry updateEnquirydata(Enquiry e);

public void deleteEnquirydata(int id);

}
