package com.example.patel.company.serviceimpl;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import javax.transaction.Transactional;
import java.lang.reflect.Type;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.modelmapper.TypeToken;
import com.example.patel.company.dao.StockExchangeRepo;
import com.example.patel.company.dtos.StockExchangeDTO;
import com.example.patel.company.models.StockExchange;
import com.example.patel.company.service.StockExchangeService;


@Service
@Transactional
public class StockExchangeServiceImpl implements StockExchangeService {
	@Autowired
	private StockExchangeRepo stockExchangeRepo;
	@Autowired
    private ModelMapper modelMapper;

    public StockExchangeServiceImpl(StockExchangeRepo stockExchangeRepo, ModelMapper modelMapper) {
        this.stockExchangeRepo = stockExchangeRepo;
        this.modelMapper = modelMapper;
    }

    
    public StockExchangeDTO createStockExchange(StockExchangeDTO stockExchangeDTO) {
        String str = UUID.randomUUID().toString();
        stockExchangeDTO.setId(str);
        stockExchangeRepo.save(modelMapper.map(stockExchangeDTO, StockExchange.class));
        return stockExchangeDTO;
    }

    
    public List<StockExchangeDTO> findAllStockExchanges() {
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        Type listType = new TypeToken<List<StockExchangeDTO>>(){}.getType();
        return modelMapper.map(stockExchangeRepo.findAll(),listType);
    }

    
    public StockExchangeDTO findStockExchangeByName(String name) {
        StockExchange stockExchange = stockExchangeRepo.findByName(name);
        return modelMapper.map(stockExchange,StockExchangeDTO.class);
    }

    
    public StockExchangeDTO findStockExchangeById(String id) {
        Optional<StockExchange> optionalStockExchange = stockExchangeRepo.findById(id);
        if (optionalStockExchange.isPresent()) {
            StockExchange stockExchange = optionalStockExchange.get();
            return modelMapper.map(stockExchange,StockExchangeDTO.class);
        }
        return null;
    }

  
}
