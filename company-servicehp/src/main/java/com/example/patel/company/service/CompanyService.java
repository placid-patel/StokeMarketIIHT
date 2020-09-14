package com.example.patel.company.service;

import java.util.List;

import com.example.patel.company.dtos.CompanyDTO;

public interface CompanyService {

	public List<CompanyDTO> getAllCompanies();
    public CompanyDTO createCompany(CompanyDTO companyDTO);
    public CompanyDTO updateCompany(CompanyDTO companyDTO);
    public CompanyDTO findByTicker(String ticker);
    public CompanyDTO findByName(String name);
    public CompanyDTO findById(String id);
    public List<CompanyDTO> findAllBySector(String sector);
//    public List<CompanyDTO> findCompanyByTurnoverWithin(Long lo, Long hi);
    public List<CompanyDTO> findAllByStockExchangeListContaining(String stockExchange);
}

