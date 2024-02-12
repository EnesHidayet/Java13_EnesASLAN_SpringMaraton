package org.enes.mapper;

import org.enes.dto.request.DoktorSaveRequestDto;
import org.enes.dto.response.DoktorSaveResponseDto;
import org.enes.entity.Doktor;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface DoktorMapper {

    DoktorMapper INSTANCE = Mappers.getMapper(DoktorMapper.class);

    Doktor toRequestDto(DoktorSaveRequestDto dto);

    DoktorSaveResponseDto toDoktor(Doktor doktor);

}
