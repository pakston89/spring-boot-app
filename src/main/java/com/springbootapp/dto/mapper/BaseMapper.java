package com.springbootapp.dto.mapper;

import org.mapstruct.Mapper;
import java.util.List;

/**
 * The Base mapper interface
 * @param <Dto>
 * @param <Entity>
 * @author pause
 */
@Mapper
public interface BaseMapper<Dto,Entity> {

    Dto entityToDto(Entity entity);

    Entity dtoToEntity(Dto dto);

    List<Dto> entitiesToDtos(List<Entity> entities);

    List<Dto> dtosToEntities(List<Dto> dto);
}
