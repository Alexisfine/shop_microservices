package com.alex.repository;

import com.alex.entity.ShopMessage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShopMessageRepository extends JpaRepository<ShopMessage, Integer> {
}