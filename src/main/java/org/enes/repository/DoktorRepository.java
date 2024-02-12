package org.enes.repository;

import org.enes.entity.Doktor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoktorRepository extends JpaRepository<Doktor,Long> {
}
