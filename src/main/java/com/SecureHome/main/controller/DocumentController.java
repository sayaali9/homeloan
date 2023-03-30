package com.SecureHome.main.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.SecureHome.main.model.DocumentRequired;
import com.SecureHome.main.serviceI.DocumentI;

@RestController
	public class DocumentController {
		
		@Autowired
		 DocumentI docI;
		
		@RequestMapping(value = "/upload" ,method = RequestMethod.POST,consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
		public DocumentRequired docsave(
		   @RequestPart(required =true ,value = "adharcard" )MultipartFile f1,
		   @RequestPart(required =true ,value = "pancard" )MultipartFile f2,
		   @RequestPart(required =true ,value = "last3monthsalaryslip" )MultipartFile f3,
		   @RequestPart(required =true ,value = "propertyDocument" )MultipartFile f4,
		   @RequestPart(required =true ,value = "bankCheque" )MultipartFile f5,
		   @RequestPart(required =true ,value = "passportsizePhoto" )MultipartFile f6,
		   @RequestPart(required =true ,value = "last6monthbankStatement" )MultipartFile f7
		   )throws IOException
		{
			DocumentRequired d=new DocumentRequired();
			d.setAdharcard(f1.getBytes());
			d.setPancard(f2.getBytes());
			d.setLast3monthsalaryslip(f3.getBytes());
			d.setPropertyDocument(f4.getBytes());
			d.setBankCheque(f5.getBytes());
			d.setPassportsizePhoto(f6.getBytes());
			d.setLast6monthbankStatement(f7.getBytes());
			
			//Gson g=new Gson();
			
			DocumentRequired dr=docI.savedoc(d);
			
			return dr;
			
		}
	}


