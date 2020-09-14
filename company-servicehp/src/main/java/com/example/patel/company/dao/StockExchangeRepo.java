package com.example.patel.company.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.example.patel.company.models.StockExchange;

@Repository
public interface StockExchangeRepo extends JpaRepository<StockExchange,String> {
	
	public StockExchange findByName(String name);

}