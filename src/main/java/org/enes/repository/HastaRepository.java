package org.enes.repository;

import org.enes.entity.Hasta;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface HastaRepository extends JpaRepository<Hasta,Long> {
    Optional<Hasta> findByTcKimlik(Long tcKimlik);
}
