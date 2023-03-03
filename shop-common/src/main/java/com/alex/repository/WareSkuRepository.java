package com.alex.repository;

import com.alex.entity.WareSku;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WareSkuRepository extends JpaRepository<WareSku, Long> {
}