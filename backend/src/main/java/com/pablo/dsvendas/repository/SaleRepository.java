package com.pablo.dsvendas.repository;

import com.pablo.dsvendas.dto.SaleSuccessDTO;
import com.pablo.dsvendas.dto.SaleSumDTO;
import com.pablo.dsvendas.entity.Sale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SaleRepository extends JpaRepository<Sale, Long> {

    @Query("SELECT new com.pablo.dsvendas.dto.SaleSumDTO(obj.seller, SUM (obj.amount)) " +
            "FROM Sale AS obj GROUP BY obj.seller")
    List<SaleSumDTO> amountGroupedBySeller();

    @Query("SELECT new com.pablo.dsvendas.dto.SaleSuccessDTO(obj.seller, SUM (obj.visited), SUM(obj.deals)) " +
            "FROM Sale AS obj GROUP BY obj.seller")
    List<SaleSuccessDTO> successGroupedBySeller();
}
