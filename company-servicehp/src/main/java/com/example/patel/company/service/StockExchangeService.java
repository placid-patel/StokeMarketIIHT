package com.example.patel.company.service;

import java.util.List;

import com.example.patel.company.dtos.StockExchangeDTO;

public interface StockExchangeService {

	public StockExchangeDTO createStockExchange(StockExchangeDTO stockExchangeDTO);
    public List<StockExchangeDTO> findAllStockExchanges();
    public StockExchangeDTO findStockExchangeByName(String name);
    public StockExchangeDTO findStockExchangeById(String id);
}