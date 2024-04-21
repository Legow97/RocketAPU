package com.pxp.SQLite.demo.repository;

import com.pxp.SQLite.demo.entity.LogEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogRepository extends JpaRepository<LogEntity, Integer> {


}
