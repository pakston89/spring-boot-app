package com.springbootapp.model.mapper;

import java.util.List;

/**
 * The BaseMapper interface
 * @param <DTO>
 * @param <Entity>
 */
public interface BaseMapper<DTO,Entity> {

    DTO entityToDTO(Entity entity);

    Entity DTOToEntity(DTO dto);

    List<DTO> entitiesToDTOs(List<Entity> entities);

    List<DTO> DTOsToEntities(List<DTO> dto);
}
