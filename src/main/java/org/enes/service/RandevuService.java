package org.enes.service;

import lombok.RequiredArgsConstructor;
import org.enes.dto.request.RandevuSaveRequestDto;
import org.enes.entity.Hasta;
import org.enes.entity.Randevu;
import org.enes.exception.ErrorType;
import org.enes.exception.RandevuSistemiException;
import org.enes.mapper.RandevuMapper;
import org.enes.repository.HastaRepository;
import org.enes.repository.RandevuRepository;
import org.enes.utility.enums.EStatus;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class RandevuService {
    private final RandevuRepository randevuRepository;
    private final HastaService hastaService;

    public Randevu save (RandevuSaveRequestDto dto){
        Optional<Hasta> hasta = hastaService.findByTcKimlik(dto.getHastaTc());
        if (hasta.isEmpty()){
            throw new RandevuSistemiException(ErrorType.ERROR_INVALID_TC_KIMLIK_SAVE);
        }
        Randevu randevu = RandevuMapper.INSTANCE.toRequestDto(dto);
        randevu.setHastaId(hasta.get().getId());
        return randevuRepository.save(randevu);
    }

    public Optional<Randevu> findById(Long id){
        Optional<Randevu> randevu = randevuRepository.findById(id);
        if (randevu.isEmpty()){
            throw new RandevuSistemiException(ErrorType.ERROR_INVALID_PARAMETER_RANDEVU);
        }
        return randevu;
    }

    public void deleteById(Long id){
        Optional<Randevu> randevu = randevuRepository.findById(id);
        if (randevu.isEmpty()){
            throw new RandevuSistemiException(ErrorType.ERROR_INVALID_PARAMETER_RANDEVU);
        }
        randevu.get().setDurum(EStatus.IPTAL_EDILDI);
        randevuRepository.save(randevu.get());
    }

    public List<Randevu> findAll() {
        return randevuRepository.findAll();
    }

    public List<Randevu> findByDoktorId(Long doktorId){
        return randevuRepository.findByDoktorId(doktorId);
    }

    public List<Randevu> findByHastaTc(Long hastaTc){
        Optional<Hasta> hasta = hastaService.findByTcKimlik(hastaTc);
        if (hasta.isEmpty()){
            throw new RandevuSistemiException(ErrorType.ERROR_INVALID_TC_KIMLIK);
        }
        return randevuRepository.findByHastaId(hasta.get().getId());
    }
}
