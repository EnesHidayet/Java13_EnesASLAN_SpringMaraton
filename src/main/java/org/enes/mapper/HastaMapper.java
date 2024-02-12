package org.enes.mapper;

import org.enes.dto.request.HastaSaveRequestDto;
import org.enes.dto.response.HastaSaveResponseDto;
import org.enes.entity.Hasta;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)

public interface HastaMapper {
    HastaMapper INSTANCE = Mappers.getMapper(HastaMapper.class);

    Hasta toRequestDto(HastaSaveRequestDto dto);
    HastaSaveResponseDto toHasta(Hasta hasta);
}
