package com.charigma.repository;

import com.charigma.model.Charade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CharadeRepository extends JpaRepository<Charade, Long> {
}
