package com.pablo.dsvendas.service;

import com.pablo.dsvendas.dto.SaleDTO;
import com.pablo.dsvendas.entity.Sale;
import com.pablo.dsvendas.repository.SaleRepository;
import com.pablo.dsvendas.repository.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class SaleService {

    @Autowired
    private SaleRepository saleRepository;

    @Autowired
    private SellerRepository sellerRepository;

    @Transactional(readOnly = true)
    public Page<SaleDTO> findAll(Pageable pageable) {
        sellerRepository.findAll();
        Page<Sale> result = saleRepository.findAll(pageable);

        return result.map(x -> new SaleDTO(x));
    }
}
