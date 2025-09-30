package com.Nbaproject.basket.repository;

import com.Nbaproject.basket.entity.Adm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdmRepository extends JpaRepository<Adm, Long> {
}
