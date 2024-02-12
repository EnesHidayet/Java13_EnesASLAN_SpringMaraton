package org.enes.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.enes.utility.enums.EStatus;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tbl_randevu")
public class Randevu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private Long doktorId;
    @NotNull
    private Long hastaId;
    @NotNull
    private LocalDate tarih;
    @NotNull
    private LocalTime zaman;
    @Builder.Default
    @Enumerated(EnumType.STRING)
    private EStatus durum=EStatus.AKTIF;
}
