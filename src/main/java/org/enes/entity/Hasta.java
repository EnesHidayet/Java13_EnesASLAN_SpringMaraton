package org.enes.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.enes.utility.enums.ECinsiyet;
import org.enes.utility.enums.EHastaDurumu;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tbl_hasta")
public class Hasta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Column(unique = true)
    private Long tcKimlik;
    @NotNull
    private String adSoyad;
    @NotNull
    private String telefon;
    @NotNull
    private String adres;
    @NotNull
    private int yas;
    @NotNull
    @Enumerated
    private ECinsiyet cinsiyet;
    @Enumerated
    @Builder.Default
    EHastaDurumu durumu=EHastaDurumu.HAYATTA;
}
