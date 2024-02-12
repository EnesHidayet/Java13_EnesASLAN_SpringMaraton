package org.enes.repository;

import org.enes.entity.Randevu;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface RandevuRepository extends JpaRepository<Randevu,Long> {

    List<Randevu> findByDoktorId(Long doktorId);

    List<Randevu> findByHastaId(Long hastaId);
}
