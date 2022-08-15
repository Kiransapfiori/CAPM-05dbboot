package com.example.Service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.address;

public interface IaddressPresistence extends JpaRepository<address, Long> {


}
