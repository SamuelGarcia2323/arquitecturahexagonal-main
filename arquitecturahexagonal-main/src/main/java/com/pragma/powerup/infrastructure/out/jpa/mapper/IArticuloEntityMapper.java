package com.pragma.powerup.infrastructure.out.jpa.mapper;

import com.pragma.powerup.domain.model.ArticuloModel;
import com.pragma.powerup.infrastructure.out.jpa.entity.ArticuloEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE
)
public interface IArticuloEntityMapper {

    ArticuloEntity toEntity(ArticuloModel articuloModel);

    ArticuloModel toArticuloModel(ArticuloEntity articuloEntity);

    List<ArticuloModel> toArticuloModelList(List<ArticuloEntity> articuloEntityList);
}
