package com.alex.repository;

import com.alex.entity.MemberLevel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberLevelRepository extends JpaRepository<MemberLevel, Long> {
}