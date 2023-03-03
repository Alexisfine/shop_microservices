package com.alex.repository;

import com.alex.entity.UndoLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UndoLogRepository extends JpaRepository<UndoLog, Long> {
}