package com.pablo.dsvendas.repository;

import com.pablo.dsvendas.entity.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
