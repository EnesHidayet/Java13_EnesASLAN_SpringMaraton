package org.enes.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.enes.dto.request.DoktorSaveRequestDto;
import org.enes.dto.request.HastaSaveRequestDto;
import org.enes.dto.request.RandevuSaveRequestDto;
import org.enes.dto.response.DoktorSaveResponseDto;
import org.enes.dto.response.HastaSaveResponseDto;
import org.enes.entity.Doktor;
import org.enes.entity.Hasta;
import org.enes.entity.Randevu;
import org.enes.service.DoktorService;
import org.enes.service.HastaService;
import org.enes.service.RandevuService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

import static org.enes.constants.RestApiUrl.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(HASTANE)
public class HastaneController {
    private final DoktorService doktorService;
    private final RandevuService randevuService;
    private final HastaService hastaService;


    @PostMapping(DOKTOR_SAVE)
    public ResponseEntity<DoktorSaveResponseDto> doktorEkle(@RequestBody @Valid DoktorSaveRequestDto dto){
        return ResponseEntity.ok(doktorService.save(dto));
    }

    @GetMapping(GET_BY_ID_DOKTOR)
    public ResponseEntity<Optional<Doktor>> idIleDoktorBul(@RequestParam Long id){
        return ResponseEntity.ok(doktorService.findById(id));
    }

    @GetMapping(GET_ALL_DOKTOR)
    public ResponseEntity<List<Doktor>> doktorlariListele(){
        return ResponseEntity.ok(doktorService.getAllDoktor());
    }

    @DeleteMapping(DELETE_DOKTOR)
    public ResponseEntity<Void> doktorSil(@RequestParam Long id){
        doktorService.deleteById(id);
        return ResponseEntity.ok().build();
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @PostMapping(RANDEVU_SAVE)
    public ResponseEntity<Randevu> hastaEkle(@RequestBody @Valid RandevuSaveRequestDto dto){
        return ResponseEntity.ok(randevuService.save(dto));
    }

    @GetMapping(GET_BY_ID_RANDEVU)
    public ResponseEntity<Optional<Randevu>> idIleRandevuBul(@RequestParam Long id){
        return ResponseEntity.ok(randevuService.findById(id));
    }

    @GetMapping(GET_ALL_RANDEVU)
    public ResponseEntity<List<Randevu>> randevulariListele(){
        return ResponseEntity.ok(randevuService.findAll());
    }

    @DeleteMapping(DELETE_RANDEVU)
    public ResponseEntity<Void> randevuIptalEt(@RequestParam Long id){
        randevuService.deleteById(id);
        return ResponseEntity.ok().build();
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @PostMapping(HASTA_SAVE)
    public ResponseEntity<HastaSaveResponseDto> hastaKaydet(@RequestBody @Valid HastaSaveRequestDto dto){
        return ResponseEntity.ok(hastaService.save(dto));
    }

    @GetMapping(GET_BY_ID_HASTA)
    public ResponseEntity<Optional<Hasta>> idIleHastaBul(@RequestParam Long id){
        return ResponseEntity.ok(hastaService.findById(id));
    }

    @GetMapping(GET_ALL_HASTA)
    public ResponseEntity<List<Hasta>> hastalariListele(){
        return ResponseEntity.ok(hastaService.findAll());
    }

    @DeleteMapping(DELETE_HASTA)
    public ResponseEntity<Void> hastaSil(@RequestParam Long id){
        hastaService.deleteHasta(id);
        return ResponseEntity.ok().build();
    }


}
