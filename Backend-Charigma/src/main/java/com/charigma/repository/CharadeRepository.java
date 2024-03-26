package com.charigma.repository;

import com.charigma.model.Charade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CharadeRepository extends JpaRepository<Charade, Long> {
}
