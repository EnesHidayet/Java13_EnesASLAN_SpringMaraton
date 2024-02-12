package org.enes.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.enes.utility.enums.EBrans;
import org.enes.utility.enums.EStatus;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tbl_doktor")
public class Doktor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private String adSoyad;
    @NotNull
    private String unvan;
    @NotNull
    @Enumerated
    private EBrans brans;
    @Enumerated
    @Builder.Default
    private EStatus status = EStatus.AKTIF;
}
