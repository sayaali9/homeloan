package com.SecureHome.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SecureHome.main.model.Enquiry;

@Repository
public interface Enquiryrepository extends JpaRepository<Enquiry, Integer> {

}
