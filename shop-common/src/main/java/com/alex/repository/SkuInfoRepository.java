package com.alex.repository;

import com.alex.entity.SkuInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SkuInfoRepository extends JpaRepository<SkuInfo, Long> {
}