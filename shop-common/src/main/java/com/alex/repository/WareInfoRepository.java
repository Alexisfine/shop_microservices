package com.alex.repository;

import com.alex.entity.WareInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WareInfoRepository extends JpaRepository<WareInfo, Long> {
}