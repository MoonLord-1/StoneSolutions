package com.yeirel.stonesolutions.mappers;

import com.yeirel.stonesolutions.dto.material.MaterialRequest;
import com.yeirel.stonesolutions.dto.material.MaterialResponse;
import com.yeirel.stonesolutions.entidades.Material;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface MaterialMapper {

    @Mapping(target = "id", ignore = true)
    Material toEntity(MaterialRequest materialRequest);

    @Mapping(target = "id", ignore = true)
    MaterialResponse toResponse(Material material);
}
