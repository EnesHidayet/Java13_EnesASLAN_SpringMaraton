package org.enes.dto.request;

import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.enes.utility.enums.EBrans;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DoktorSaveRequestDto {
    @NotNull
    private String adSoyad;
    @NotNull
    private String unvan;
    @NotNull
    private EBrans brans;
}
