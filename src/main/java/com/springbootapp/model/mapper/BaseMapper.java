package com.springbootapp.model.mapper;

import java.util.List;

/**
 * The BaseMapper interface
 * @param <VO>
 * @param <Entity>
 */
public interface BaseMapper<VO,Entity> {

    VO entityToVO(Entity entity);

    Entity VOToEntity(VO dto);

    List<VO> entitiesToVOs(List<Entity> entities);

    List<VO> VOsToEntities(List<VO> dto);
}
