package com.alex.repository;

import com.alex.entity.WareOrderTask;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WareOrderTaskRepository extends JpaRepository<WareOrderTask, Long> {
}