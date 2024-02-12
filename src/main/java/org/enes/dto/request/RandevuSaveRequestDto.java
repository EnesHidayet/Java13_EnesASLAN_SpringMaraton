package org.enes.dto.request;

import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;
import java.time.LocalTime;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RandevuSaveRequestDto {
    @NotNull
    private Long doktorId;
    @NotNull
    private Long hastaTc;
    @NotNull
    private LocalDate tarih;
    @NotNull
    private LocalTime zaman;
}
