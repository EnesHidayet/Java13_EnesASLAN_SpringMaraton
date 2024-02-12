package org.enes.service;

import lombok.RequiredArgsConstructor;
import org.enes.dto.request.DoktorSaveRequestDto;
import org.enes.dto.response.DoktorSaveResponseDto;
import org.enes.entity.Doktor;
import org.enes.exception.ErrorType;
import org.enes.exception.RandevuSistemiException;
import org.enes.mapper.DoktorMapper;
import org.enes.repository.DoktorRepository;
import org.enes.utility.enums.EStatus;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DoktorService {
    private final DoktorRepository doktorRepository;


    public DoktorSaveResponseDto save(DoktorSaveRequestDto dto) {
        Doktor doktor = DoktorMapper.INSTANCE.toRequestDto(dto);
        doktorRepository.save(doktor);
        return DoktorMapper.INSTANCE.toDoktor(doktor);
    }


    public void deleteById(Long id){
        Optional<Doktor> doktor = doktorRepository.findById(id);
        if (doktor.isEmpty()){
            throw new RandevuSistemiException(ErrorType.ERROR_INVALID_PARAMETER_DOKTOR);
        }
        doktor.get().setStatus(EStatus.PASIF);
        doktorRepository.save(doktor.get());
    }

    public Optional<Doktor> findById(Long id){
        Optional<Doktor> doktor = doktorRepository.findById(id);
        if (doktor.isEmpty()){
            throw new RandevuSistemiException(ErrorType.ERROR_INVALID_PARAMETER_DOKTOR);
        }
        return doktor;
    }


    public List<Doktor> getAllDoktor(){
        return doktorRepository.findAll();
    }


}
