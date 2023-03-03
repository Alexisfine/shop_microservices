package com.alex.repository;

import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface AbstractAuditableRepository<T extends org.springframework.data.jpa.domain.AbstractAuditable, ID> extends org.springframework.data.jpa.repository.JpaRepository<T, ID> {
}