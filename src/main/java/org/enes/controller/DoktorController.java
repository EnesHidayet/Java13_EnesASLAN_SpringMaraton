package org.enes.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.enes.dto.request.DoktorSaveRequestDto;
import org.enes.dto.request.HastaSaveRequestDto;
import org.enes.dto.request.RandevuSaveRequestDto;
import org.enes.dto.response.DoktorSaveResponseDto;
import org.enes.dto.response.HastaSaveResponseDto;
import org.enes.entity.Randevu;
import org.enes.service.DoktorService;
import org.enes.service.HastaService;
import org.enes.service.RandevuService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.enes.constants.RestApiUrl.*;


@RestController
@RequiredArgsConstructor
@RequestMapping(DOKTOR)
public class DoktorController {
    private final DoktorService doktorService;
    private final HastaService hastaService;
    private final RandevuService randevuService;

    @PostMapping(HASTA_SAVE)
    public ResponseEntity<HastaSaveResponseDto> hastaKaydet(@RequestBody @Valid HastaSaveRequestDto dto){
        return ResponseEntity.ok(hastaService.save(dto));
    }

    @PostMapping(RANDEVU_SAVE)
    public ResponseEntity<Randevu> hastaEkle(@RequestBody @Valid RandevuSaveRequestDto dto){
        return ResponseEntity.ok(randevuService.save(dto));
    }

    @GetMapping(FIND_RANDEVU_BY_DOKTOR_ID)
    public ResponseEntity<List<Randevu>> doktoraGoreRandevuGetir(@RequestParam Long doktorId){
        return ResponseEntity.ok(randevuService.findByDoktorId(doktorId));
    }
}
