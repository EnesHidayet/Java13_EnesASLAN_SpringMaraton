package org.enes.dto.request;

import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.enes.utility.enums.ECinsiyet;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class HastaSaveRequestDto {
    @NotNull
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
}
