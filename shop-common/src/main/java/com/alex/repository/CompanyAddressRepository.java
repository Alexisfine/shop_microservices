package com.alex.repository;

import com.alex.entity.CompanyAddress;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyAddressRepository extends JpaRepository<CompanyAddress, Long> {
}