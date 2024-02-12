package org.enes.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.enes.dto.request.HastaSaveRequestDto;
import org.enes.dto.request.RandevuSaveRequestDto;
import org.enes.dto.response.HastaSaveResponseDto;
import org.enes.entity.Randevu;
import org.enes.service.HastaService;
import org.enes.service.RandevuService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

import static org.enes.constants.RestApiUrl.*;


@RestController
@RequiredArgsConstructor
@RequestMapping(HASTA)
public class HastaController {
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

    @GetMapping(GET_BY_TC_RANDEVU)
    public ResponseEntity<List<Randevu>> tcIleRandevuBul(@RequestParam Long tcKimlik){
        return ResponseEntity.ok(randevuService.findByHastaTc(tcKimlik));
    }


    @DeleteMapping(DELETE_RANDEVU)
    public ResponseEntity<Void> randevuIptalEt(@RequestParam Long id){
        randevuService.deleteById(id);
        return ResponseEntity.ok().build();
    }
}
