package com.example.patel.company.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.patel.company.models.Company;

@Repository
public interface CompanyRepo extends JpaRepository<Company, String>{

	public Company findByName(String name);
    public Company findByTicker(String ticker);
    public List<Company> findAllBySector(String sector);
    public List<Company> findAllByStockExchangeListContaining(String stockExchange);
}

