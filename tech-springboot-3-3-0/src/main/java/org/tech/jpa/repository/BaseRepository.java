package org.tech.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.NoRepositoryBean;
import org.tech.jpa.entity.BaseEntity;

@NoRepositoryBean
//public interface BaseRepository<T extends BaseEntity<ID>, ID> extends JpaRepository<T, ID>, JpaSpecificationExecutor<T>,
//        QuerydslPredicateExecutor<T> {
    public interface BaseRepository<T extends BaseEntity<ID>, ID> extends JpaRepository<T, ID>, JpaSpecificationExecutor<T>
             {
}
