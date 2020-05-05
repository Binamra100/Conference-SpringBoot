package com.binamra100.repositories;

import com.binamra100.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRespository extends JpaRepository<Session, Long> {
}
