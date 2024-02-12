package org.enes.service;

import lombok.RequiredArgsConstructor;
import org.enes.dto.request.HastaSaveRequestDto;
import org.enes.dto.response.HastaSaveResponseDto;
import org.enes.entity.Hasta;
import org.enes.exception.ErrorType;
import org.enes.exception.RandevuSistemiException;
import org.enes.mapper.HastaMapper;
import org.enes.repository.HastaRepository;
import org.enes.utility.enums.EHastaDurumu;
import org.springframework.aop.target.LazyInitTargetSource;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class HastaService {
    private final HastaRepository hastaRepository;

    public HastaSaveResponseDto save(HastaSaveRequestDto dto){
        Optional<Hasta> hasta1 = hastaRepository.findByTcKimlik(dto.getTcKimlik());
        if (hasta1.isPresent()){
            throw new RandevuSistemiException(ErrorType.ERROR_DUPLICATE_TCKIMLIK);
        }
        Hasta hasta = HastaMapper.INSTANCE.toRequestDto(dto);
        hastaRepository.save(hasta);
        return HastaMapper.INSTANCE.toHasta(hasta);
    }

    public Optional<Hasta> findById(Long id){
        Optional<Hasta> hasta = hastaRepository.findById(id);
        if (hasta.isEmpty()){
            throw new RandevuSistemiException(ErrorType.ERROR_INVALID_PARAMETER_HASTA);
        }
        return  hasta;
    }

    public List<Hasta> findAll(){
        return hastaRepository.findAll();
    }

    public void deleteHasta(Long id){
        Optional<Hasta> hasta = hastaRepository.findById(id);
        if (hasta.isEmpty()){
            throw new RandevuSistemiException(ErrorType.ERROR_INVALID_PARAMETER_HASTA);
        }
        hasta.get().setDurumu(EHastaDurumu.VEFAT_ETMIS);
        hastaRepository.save(hasta.get());
    }

    public Optional<Hasta> findByTcKimlik(Long tcKimlik){
        Optional<Hasta> hasta = hastaRepository.findByTcKimlik(tcKimlik);
        if (hasta.isEmpty()){
            throw new RandevuSistemiException(ErrorType.ERROR_INVALID_TC_KIMLIK);
        }
        return hasta;
    }
}
