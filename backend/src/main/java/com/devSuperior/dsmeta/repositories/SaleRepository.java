package com.devSuperior.dsmeta.repositories;

import com.devSuperior.dsmeta.entities.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleRepository  extends JpaRepository<Sale, Long> {
}
