package com.pablo.dsvendas.service;

import com.pablo.dsvendas.dto.SaleDTO;
import com.pablo.dsvendas.entity.Sale;
import com.pablo.dsvendas.repository.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


@Service
public class SaleService {

    @Autowired
    private SaleRepository saleRepository;

    public Page<SaleDTO> findAll(Pageable pageable) {
        Page<Sale> result = saleRepository.findAll(pageable);

        return result.map(x -> new SaleDTO(x));
    }
}
