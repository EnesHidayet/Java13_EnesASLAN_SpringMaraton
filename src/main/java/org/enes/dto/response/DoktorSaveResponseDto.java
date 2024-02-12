package org.enes.dto.response;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import org.enes.utility.enums.EBrans;
import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DoktorSaveResponseDto {
    private String adSoyad;
    private String unvan;
    @Enumerated(EnumType.STRING)
    private EBrans brans;
    @Builder.Default
    private String message = "Doktor başarı ile kaydedildi.";
}
