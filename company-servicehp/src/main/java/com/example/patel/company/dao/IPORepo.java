package com.example.patel.company.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.patel.company.models.IPO;

@Repository
public interface IPORepo extends JpaRepository<IPO,String> {

}
