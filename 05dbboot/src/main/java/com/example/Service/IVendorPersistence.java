package com.example.Service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Vendor;
public interface IVendorPersistence extends JpaRepository<Vendor, Long> {
 List<Vendor> findByCompanyName(String companyname);
 
	
}
