package com.alex.repository;

import com.alex.entity.Temp;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TempRepository extends JpaRepository<Temp, Integer> {
}