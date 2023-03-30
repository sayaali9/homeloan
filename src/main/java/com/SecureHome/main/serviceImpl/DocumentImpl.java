package com.SecureHome.main.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SecureHome.main.model.DocumentRequired;
import com.SecureHome.main.repository.Documentrepository;
import com.SecureHome.main.serviceI.DocumentI;

@Service
public class DocumentImpl implements DocumentI{

	@Autowired
	private Documentrepository docrepo;

	@Override
	public DocumentRequired savedoc(DocumentRequired d) {
		DocumentRequired s1 = docrepo.save(d);
		return s1;
	}
	
}
