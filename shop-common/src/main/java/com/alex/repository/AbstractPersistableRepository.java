package com.alex.repository;

import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface AbstractPersistableRepository<T extends org.springframework.data.jpa.domain.AbstractPersistable, ID> extends org.springframework.data.jpa.repository.JpaRepository<T, ID> {
}