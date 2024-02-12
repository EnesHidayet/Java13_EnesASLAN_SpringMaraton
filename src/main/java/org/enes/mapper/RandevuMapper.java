package org.enes.mapper;

import org.enes.dto.request.RandevuSaveRequestDto;
import org.enes.entity.Randevu;
import org.enes.service.RandevuService;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)

public interface RandevuMapper {

    RandevuMapper INSTANCE = Mappers.getMapper(RandevuMapper.class);

     Randevu toRequestDto(RandevuSaveRequestDto randevu);
}
